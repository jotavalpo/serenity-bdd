package com.screenplay.project.tasks;

import lombok.extern.slf4j.Slf4j;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static com.screenplay.project.ui.HomeDemoBlazeUI.*;
import static com.screenplay.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.actions.SendKeys.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Slf4j
@AllArgsConstructor
public class LoginTask implements Task {

    private static EnvironmentVariables environmentVariables;
    private String usuario;
    private String password;

    @Override
    @Step("{0} inicia sesion con las credenciales validas")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MODAL_LOGIN),
                Enter.theValue(usuario).into(INPUT_USUARIO),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginTask authentication(String usuario, String password) {
        return Tasks.instrumented(LoginTask.class, usuario, password);
    }
}
