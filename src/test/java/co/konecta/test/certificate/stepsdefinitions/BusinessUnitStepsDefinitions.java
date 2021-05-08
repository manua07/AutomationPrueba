package co.konecta.test.certificate.stepsdefinitions;

import co.konecta.test.certificate.task.BusinessUnitTask;
import co.konecta.test.certificate.task.LoginTask;
import co.konecta.test.certificate.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.test.certificate.userinterface.BusinessUnitPage.*;

public class BusinessUnitStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("General");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^i am create business unit in the application$")
    public void iAmEntryInThePage() {
        actor.wasAbleTo(Open.browserOn(homePage));
    }


    @And("^i enter the login information username (.*) and the password (.*)$")
    public void iEnterTheLoginInformationUsernameAndThePassword(String username, String password) {
        actor.attemptsTo(
                LoginTask.whitCredentials(username, password)
        );
    }

    @When("^i enter the name business (.*)$")
    public void iEnterTheNameBusiness(String nameBusiness) {
        actor.attemptsTo(Click.on(BUTTON_ORGANIZATION),
                Click.on(BUTTON_BUSINESS_UNITS),
                Click.on(BUTTON_CREATE_BUSINESS));
        actor.attemptsTo(BusinessUnitTask.whitInformationBusiness(nameBusiness));
        actor.attemptsTo(Click.on(BUTTON_SAVE_BUSINESS));

    }

    @Then("^user view record in the application$")
    public void userViewNameBusinessInTheApplication() {
    }
}

