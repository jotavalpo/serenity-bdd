package com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidateTextBtnPostLogin implements Question<String> {

    private final Target target;

    public ValidateTextBtnPostLogin(Target target) {
        this.target = target;
    }

    public static ValidateTextBtnPostLogin from(Target target) {
        return new ValidateTextBtnPostLogin(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        WebElementFacade element = target.resolveFor(actor);
        element.waitUntilVisible();
        return element.getText();

/*        Soluciones no funcionaron con versión de Serenity Core y Cucumber, investigar
        return TextContent.of(target).viewedBy(actor).asString();
        return Text.of(target).viewedBy(actor).asString();
        return Text.of(target.resolveFor(actor)).asString();*/
    }
}