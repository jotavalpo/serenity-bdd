package com.screenplay.project.stepdefinition.hook;

import com.screenplay.project.hook.AbrirSitio;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;


import static com.screenplay.project.utils.Constants.*;
import static com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("{string} abre el sitio web de pruebas")
    public void abreElSitioWebDePruebas(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                AbrirSitio.browserURL(WEB_URL)
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE)
                )
        );

    }

    @Given("{string} abre el sitio web de pruebas de demoblaze")
    public void abreElSitioWebDePruebasDeDemoblaze(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                AbrirSitio.browserURL(MAP_URL)
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE_DEMOBLAZE)
                )
        );

    }
}
