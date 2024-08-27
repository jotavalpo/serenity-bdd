package com.screenplay.project.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Input username")
            .located(By.xpath("//input[@id='loginusername']"));

    public static final Target INPUT_PASSWORD = Target.the("Input password")
            .located(By.xpath("//input[@id='loginpassword']"));

    public static final Target BTN_LOGIN = Target.the("Boton Log in")
            .located(By.xpath("//button[@onclick='logIn()']"));

    public static final Target BTN_CLOSE = Target.the("Boton Close")
            .located(By.xpath("(//button[contains(.,'Close')])[4]"));
}
