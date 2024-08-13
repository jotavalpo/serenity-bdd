package com.screenplay.project.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/iniciarsesion.feature",
        glue = "com.screenplay.project.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@loginExitoso"
)
public class RunnerIniciarSesion {
}