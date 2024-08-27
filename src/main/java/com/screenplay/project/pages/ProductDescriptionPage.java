package com.screenplay.project.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductDescriptionPage extends PageObject {

    public static final Target BTN_ADD_TO_CART = Target.the("Boton Add to cart")
            .located(By.xpath("//a[contains(.,'Add to cart')]"));

}

