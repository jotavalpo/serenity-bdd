package com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static com.screenplay.project.ui.HomeUI.BTN_ELEMENTS;
import static com.screenplay.project.ui.HomeUI.BTN_LIST_ELEMENTS;
import static com.screenplay.project.utils.Constants.REMEMBER_TEXT_BTN_SUB_ELEMENTS;

@AllArgsConstructor
public class ChooseRandomTask implements Task {

    private String numberRandomBtn;

    @Override
    @Step("{0} selecciona aleatoriamente la posición #numberRandomBtn de la subfunción de elementos")
    public <T extends Actor> void performAs(T actor) {
        String number = numberRandomBtn;
        actor.attemptsTo(Scroll.to(BTN_ELEMENTS),
                Click.on(BTN_LIST_ELEMENTS.of(number))
        );

        String textBtn = BTN_LIST_ELEMENTS.of(number).resolveFor(actor).getText();
        actor.remember(REMEMBER_TEXT_BTN_SUB_ELEMENTS, textBtn);
    }

    public static ChooseRandomTask withParams(String numberRandomBtn) {

        return Tasks.instrumented(ChooseRandomTask.class,numberRandomBtn);
    }

}
