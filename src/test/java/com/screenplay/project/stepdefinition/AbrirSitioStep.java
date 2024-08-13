package com.screenplay.project.stepdefinition;

import com.screenplay.project.questions.ValidateElementsTextBtn;
import com.screenplay.project.tasks.ChooseRandomTask;
import com.screenplay.project.tasks.FuntionsElementsTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import static com.screenplay.project.utils.Constants.ACTOR;
import static com.screenplay.project.utils.Constants.REMEMBER_TEXT_BTN_SUB_ELEMENTS;
import static com.screenplay.project.utils.DataFaker.fakerNumberOneAndNine;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@Slf4j
public class AbrirSitioStep {

    @Before
    public void setTheStage() {

        OnStage.setTheStage(new OnlineCast());

    }

    @And("desea validar la funcion de la carta de elementos")
    public void deseaValidarLaFuncionDeLaCartaDeElementos() {

        OnStage.theActorCalled(ACTOR).attemptsTo(FuntionsElementsTask.choose());
    }


    @When("selecciona aleatoriamente alguna de las subfunciones")
    public void seleccionaAleatoriamenteAlgunaDeLasSubfunciones() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseRandomTask.withParams(fakerNumberOneAndNine()));
        
    }

    @Then("visualizara en la cabecera el nombre de la opcion elegida")
    public void visualizaraEnLaCabeceraElNombreDeLaOpcionElegida() {
        String validateText = OnStage.theActorCalled(ACTOR).recall(REMEMBER_TEXT_BTN_SUB_ELEMENTS);
        if (validateText != null) {
            log.info(validateText);
        }

        theActorInTheSpotlight().should(seeThat(ValidateElementsTextBtn.withParams(validateText)));
    }
}
