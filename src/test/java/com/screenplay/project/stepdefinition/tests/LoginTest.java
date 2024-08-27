package com.screenplay.project.stepdefinition.tests;

import com.screenplay.project.hook.AbrirSitio;

import com.screenplay.project.pages.HomePage;
import com.screenplay.project.questions.ValidateTextBtnPostLogin;
import com.screenplay.project.tasks.LoginTask;
import net.serenitybdd.core.environment.ConfiguredEnvironment;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.util.EnvironmentVariables;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static com.screenplay.project.utils.Constants.*;
import static com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {

    private static EnvironmentVariables environmentVariables;

    public LoginTest() {
        this.environmentVariables = ConfiguredEnvironment.getEnvironmentVariables();
    }

    @BeforeEach
    public void abrirSitioDemoblaze() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR).attemptsTo(
                AbrirSitio.browserURL(MAP_URL)
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE_DEMOBLAZE)
                )
        );

    }

    @Test
    public void realizarLoginExitosamente() {

        String texto = "Welcome jmontero";

        String usuario = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USUARIO_DEMOBLAZE);
        String password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSWORD_DEMOBLAZE);
        theActorCalled(ACTOR).attemptsTo(
                LoginTask.authentication(usuario, password)
        );

        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateTextBtnPostLogin.from(HomePage.BTN_USUARIO_LOGEADO), equalTo(texto))
        );
    }
}
