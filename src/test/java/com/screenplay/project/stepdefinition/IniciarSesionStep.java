package com.screenplay.project.stepdefinition;

import com.screenplay.project.questions.ValidateTextBtnPostLogin;
import com.screenplay.project.tasks.LoginTask;
import com.screenplay.project.ui.HomeDemoBlazeUI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.util.EnvironmentVariables;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import static com.screenplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

@Slf4j
public class IniciarSesionStep {

    private static EnvironmentVariables environmentVariables;
    private String usuario;
    private String password;

    @Before
    public void setTheStage() {

        OnStage.setTheStage(new OnlineCast());

    }

    @And("ingresa el usuario y password correctos")
    public void ingresaElUsuarioYPasswordCorrectos() {

        usuario = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USUARIO_DEMOBLAZE);
        password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSWORD_DEMOBLAZE);
        theActorCalled(ACTOR).attemptsTo(
                LoginTask.authentication(usuario, password)
        );
    }


    @Then("se inicia sesion de forma exitosa y el texto de bienvenida {string}")
    public void seIniciaSesionDeFormaExitosaYElTextoDeBienvenida(String texto) {

        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateTextBtnPostLogin.from(HomeDemoBlazeUI.BTN_USUARIO_LOGEADO), equalTo(texto))
        );
    }
}
