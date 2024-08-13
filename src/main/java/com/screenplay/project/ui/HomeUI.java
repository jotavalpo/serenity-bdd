package com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {
    public static final Target ID_CARD_ELEMENTS = Target.the("Botón elementos Home").
            located(By.xpath("(//div[@class='card-up'])[1]"));

    public static final Target BTN_ELEMENTS = Target.the("Botón elementos menú Elements").
            located(By.xpath("//div[@class='header-text'][contains(.,'Elements')]"));

    public static final Target BTN_LIST_ELEMENTS = Target.the("Botón lista de opciones elementos").
            locatedBy("//div//div/div[1]/div/ul/li[{0}]");

    public static final Target TXT_RANDOM_NAME_BTN = Target.the("Texto random del nombre de los botones").
            located(By.xpath("//h1[@class='text-center']"));

}
