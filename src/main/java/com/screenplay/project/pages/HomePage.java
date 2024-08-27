package com.screenplay.project.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    //Links de acceso rapido en header
    public static final Target LINK_HOME = Target.the("Link Home")
            .located(By.xpath("//a[contains(.,'Home (current)')]"));

    public static final Target LINK_CONTACT = Target.the("Link Contact")
            .located(By.xpath("//a[contains(.,'Contact')]"));

    public static final Target LINK_ABOUTUS = Target.the("Link About Us")
            .located(By.xpath("//a[contains(.,'About us')]"));

    public static final Target LINK_CART = Target.the("Link Cart")
            .located(By.xpath("//a[contains(.,'Cart')]"));

    public static final Target LINK_LOGIN = Target.the("Link LogIn")
            .located(By.xpath("//a[contains(.,'Log in')]"));

    public static final Target LINK_SIGNUP = Target.the("Link SignUp")
            .located(By.xpath("//a[contains(.,'Sign up')]"));

    public static final Target BTN_USUARIO_LOGEADO = Target.the("Botón con usuario logeado").
            located(By.xpath("//a[@id='nameofuser']"));

    //Links de categorias
    public static final Target LINK_PHONES = Target.the("Categoria Phones")
            .located(By.xpath("//a[contains(.,'Phones')]"));

    public static final Target LINK_LAPTOPS = Target.the("Categoria Laptops")
            .located(By.xpath("//a[contains(.,'Laptops')]"));

    public static final Target LINK_MONITORS = Target.the("Categoria Monitors")
            .located(By.xpath("//a[contains(.,'Monitors')]"));

}