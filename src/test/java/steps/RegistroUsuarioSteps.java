package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.RegistroUsuario;

public class RegistroUsuarioSteps {

    RegistroUsuario registroUsuario = new RegistroUsuario();

    @Given("^El usuario ingresa a la pagina de la tienda virtual$")
    public void navigateToShop() {
        registroUsuario.navigateToShop();
    }

    @When("^El usuario pulsa clic en el boton Sign in$")
    public void clickSignInButton() {
        registroUsuario.clickSignInButton();
    }
    @And("^El usuario diligencia el formulario de la seccion CREATE AN ACCOUNT$")
    public void enterEmailAddress() {
        registroUsuario.enterEmail("juanpineda@prueba0000.com.co");
    }

    @And("^El usuario pulsa clic en el boton Create an account$")
    public void clickCreateAnAccountButton() {
        registroUsuario.clickCreateAnAccountButton();
    }

    @And("^El usuario diligencia el formulario$")
    public void fillOutForm() {
        registroUsuario.clickTitleCheckbox("Mr.");
        registroUsuario.enterFirstName("Juan");
        registroUsuario.enterLastName("Pineda");
        registroUsuario.enterPassword("12345");
        registroUsuario.selectDateBirth("23", "April", "1990");
        registroUsuario.enterCompany("Choucair");
        registroUsuario.enterAddress("Centro Empresarial Olaya Herrera", " Cra 52 # 14 30 Oficina 421");
        registroUsuario.enterCity("Los Angeles");
        registroUsuario.selectState("California");
        registroUsuario.enterPostalCode("00000");
        registroUsuario.selectCountry("United States");
        registroUsuario.enterAdditionalInformation("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                                   "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                                                   "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                                                   "nisi ut aliquip ex ea commodo consequat");
        registroUsuario.enterHomePhone("573423");
        registroUsuario.enterMobilePhone("4042347844");
        registroUsuario.enterAddressAlias("Home");
    }

    @And("^El usuario pulsa clic en el boton Register$")
    public void clickRegisterButton() {
        registroUsuario.clickRegisterButton();
    }

    @Then("^El usuario ha sido registrado de forma correcta$")
    public void validateResults() {
        Assert.assertEquals("Juan Pineda",registroUsuario.registerStatus());
    }


}
