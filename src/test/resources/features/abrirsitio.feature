Feature: Abrir la página web

  Yo como Jorge
  Quiero realiza una prueba a la lista de elementos y las subFunciones
  Para comprobar la robustez y control de errores de la web

  Background:
    Given "Jorge" abre el sitio web de pruebas

  @successful
  Scenario: Validación en la función del ID Card Elements
    And desea validar la funcion de la carta de elementos
    When selecciona aleatoriamente alguna de las subfunciones
    Then visualizara en la cabecera el nombre de la opcion elegida
