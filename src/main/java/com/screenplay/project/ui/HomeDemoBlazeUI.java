package com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeDemoBlazeUI extends PageObject {


    public static final Target BTN_MODAL_LOGIN = Target.the("Botón para abrir modal de inicio sesión").
    located(By.xpath("//a[contains(.,'Log in')]"));
    public static final Target INPUT_USUARIO = Target.the("Input para ingresar usuario").
            located(By.xpath("//input[@id='loginusername']"));

    public static final Target INPUT_PASSWORD = Target.the("Input para ingresar contraseña").
            located(By.xpath("//input[@id='loginpassword']"));

    public static final Target BTN_LOGIN = Target.the("Botón iniciar sesión").
            locatedBy("//button[@type='button'][contains(.,'Log in')]");

    public static final Target BTN_CLOSE = Target.the("Botón Close de modal").
            located(By.xpath("(//button[contains(@class,'btn btn-secondary')])[3]"));

    public static final Target ICON_CLOSE = Target.the("Ícono para cerrar modal").
            located(By.xpath("(//span[contains(.,'×')])[3]"));

    public static final Target BTN_USUARIO_LOGEADO = Target.the("Botón con usuario logeado").
            located(By.xpath("//a[@id='nameofuser']"));
}
