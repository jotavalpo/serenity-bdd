package com.screenplay.project.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Input username nueva cuenta")
            .located(By.xpath("//input[@id='sign-username']"));

    public static final Target INPUT_PASSWORD = Target.the("Input password nueva cuenta")
            .located(By.xpath("//input[@id='sign-password']"));

    public static final Target BTN_LOGIN = Target.the("Boton Sign up")
            .located(By.xpath("//button[@onclick='register()']"));

    public static final Target BTN_CLOSE = Target.the("Boton Close")
            .located(By.xpath("(//button[contains(.,'Close')])[2]"));
}
