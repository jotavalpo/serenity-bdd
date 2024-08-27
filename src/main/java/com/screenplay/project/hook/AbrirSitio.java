package com.screenplay.project.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirSitio implements Task {

    private EnvironmentVariables environmentVariables;

    public AbrirSitio(String webUrl) {

        this.webUrl = webUrl;

    }
    private String webUrl;

    @Override
    public <T extends Actor> void performAs(T actor) {

        String pathWebURl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(webUrl);
        actor.attemptsTo(Open.url(pathWebURl));

    }

    public static Performable browserURL(String webUrl) {
        return instrumented(AbrirSitio.class, webUrl);
    }
}
