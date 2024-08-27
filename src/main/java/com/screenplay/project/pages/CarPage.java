package com.screenplay.project.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarPage extends PageObject {

    public static final Target BTN_ADD_TO_CART = Target.the("Boton Place Order")
            .located(By.xpath("//button[contains(.,'Place Order')]"));

    public static final Target BTN_DELETE = Target.the("Boton Delete")
            .located(By.xpath("//a[contains(.,'Delete')]"));

    //Formulario para completar orden

    public static final Target INPUT_NAME = Target.the("Input Name de modal")
            .located(By.xpath("//input[@id='name']"));

    public static final Target INPUT_COUNTRY = Target.the("Input Country de modal")
            .located(By.xpath("//input[@id='country']"));

    public static final Target INPUT_CITY = Target.the("Input City de modal")
            .located(By.xpath("//input[@id='city']"));

    public static final Target INPUT_CREDIT_CARD = Target.the("Input Credit Card de modal")
            .located(By.xpath("//input[@id='card']"));

    public static final Target INPUT_MONTH = Target.the("Input Month de modal")
            .located(By.xpath("//input[@id='month']"));

    public static final Target INPUT_YEAR = Target.the("Input Year de modal")
            .located(By.xpath("//input[@id='year']"));

    public static final Target BTN_PURCHASE = Target.the("Boton Purchase")
            .located(By.xpath("//button[@onclick='purchaseOrder()']"));

    public static final Target BTN_CLOSE = Target.the("Boton Close")
            .located(By.xpath("(//button[@type='button'])[8]"));

}