Feature: Buscar youtube en google
  Scenario: Como usuario deseo ingresar a google y buscar youtube
    Given El usuario se encuentra en la pagina de inicio
    When El usuario escribe la palabra youtube en la caja de texto
    Then El usuario hace click en el boton buscar
    And El usuario obtiene las busquedas sobre google