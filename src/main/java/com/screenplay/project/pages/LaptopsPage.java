package com.screenplay.project.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LaptopsPage extends PageObject {

    public static final Target LINK_SONY_VAIO_I5 = Target.the("Link Sony vaio i5")
            .located(By.xpath("//a[contains(.,'Sony vaio i5')]"));

    public static final Target LINK_SONY_VAIO_I7 = Target.the("Link Sony vaio i7")
            .located(By.xpath("//a[contains(.,'Sony vaio i7')]"));

    public static final Target LINK_MACBOOK_AIR = Target.the("Link MacBook air")
            .located(By.xpath("//a[contains(.,'MacBook air')]"));

    public static final Target LINK_DELL_I7 = Target.the("Link Dell i7 8gb")
            .located(By.xpath("//a[contains(.,'Dell i7 8gb')]"));

    public static final Target LINK_2017_DELL = Target.the("Link 2017 Dell 15.6 Inch")
            .located(By.xpath("//a[contains(.,'2017 Dell 15.6 Inch')]"));

    public static final Target LINK_MACBOOK_PRO = Target.the("Link MacBook Pro")
            .located(By.xpath("//a[contains(.,'MacBook Pro')]"));

    public static final Target BTN_PREVIOUS = Target.the("Boton Previous")
            .located(By.xpath("//button[contains(.,'Previous')]"));

    public static final Target BTN_NEXT = Target.the("Boton Next")
            .located(By.xpath("//button[contains(.,'Next')]"));

}
