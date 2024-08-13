Feature: Iniciar sesión en la página web demoblaze

  Yo como Jorge
  Quiero realiza pruebas de inicio de sesión
  Para comprobar la robustez y control de errores de la web

  Background:
    Given "Jorge" abre el sitio web de pruebas de demoblaze

  @loginExitoso
  Scenario: Inicio de sesión valido
    And ingresa el usuario y password correctos
    Then se inicia sesion de forma exitosa y el texto de bienvenida "Welcome jmontero"