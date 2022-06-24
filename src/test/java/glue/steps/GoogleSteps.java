package glue.steps;

import glue.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps extends Test {
    @Given("El usuario se encuentra en la pagina de inicio")
    public void elUsuarioSeEncuentraEnLaPaginaDeInicio() {
        System.out.println("1");
    }
    @When("El usuario escribe la palabra youtube en la caja de texto")
    public void elUsuarioEscribeLaPalabraYoutubeEnLaCajaDeTexto() throws Exception {
        System.out.println("2");
        google.ingresarTexto();
    }
    @Then("El usuario hace click en el boton buscar")
    public void elUsuarioHaceClickEnElBotonBuscar() throws Exception {
        System.out.println("3");
        google.clickBuscar();
    }
    @Then("El usuario obtiene las busquedas sobre google")
    public void elUsuarioObtieneLasBusquedasSobreGoogle() {
        System.out.println("4");
    }


}
