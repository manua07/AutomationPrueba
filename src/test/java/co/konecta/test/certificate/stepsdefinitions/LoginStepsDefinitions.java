package co.konecta.test.certificate.stepsdefinitions;

import co.konecta.test.certificate.questions.*;
import co.konecta.test.certificate.task.LoginTask;
import co.konecta.test.certificate.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("General");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^i am entry in the application$")
    public void iAmEntryInThePage() {
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^i enter the username (.*) and the password (.*)$")
    public void iEnterTheUserAndThePassword(String username, String password) {
        actor.attemptsTo(
                LoginTask.whitCredentials(username, password)
        );
    }

    @Then("^user view (.*) in the input$")
    public void userViewInTheInput(String message) {
        actor.should(
                seeThat(
                        TheMessage.isVisible(message)
                )
        );

    }
}
