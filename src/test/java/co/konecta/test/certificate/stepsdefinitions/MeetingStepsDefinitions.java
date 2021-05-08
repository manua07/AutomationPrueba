package co.konecta.test.certificate.stepsdefinitions;

import co.konecta.test.certificate.task.BusinessUnitTask;
import co.konecta.test.certificate.task.LoginTask;
import co.konecta.test.certificate.task.MeetingTask;
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
import static co.konecta.test.certificate.userinterface.MeetingPage.*;

public class MeetingStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("General");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^i am create meeting unit in the application$")
    public void iAmEntryInThePage() {
        actor.wasAbleTo(Open.browserOn(homePage));
    }


    @And("^i enter login meeting username (.*) and the password (.*)$")
    public void iEnterTheLoginInformationUsernameAndThePassword(String username, String password) {
        actor.attemptsTo(
                LoginTask.whitCredentials(username, password)
        );
    }


    @When("^i enter the meeting name (.*) and the meeting type (.*) and the meeting number (.*) and the location (.*) and the unit (.*) and the organized by fist name (.*) and organized by last name (.*) and organized by email1 (.*) and organized by email2 (.*) and the reporter (.*) and the attendee list (.*)$")
    public void iEnterTheMeetingNameAndTheMeetingTypeAndTheMeetingNumberAndTheStartDateAndTheEndDateAndTheLocationAndTheUnitAndTheOrganizedByAndTheReporterAndTheAttendeeList(String meetingName, String meetingType, String meetingNumber, String location, String unit, String organizedByFirstName, String organizedByLastName, String organizedByEmail1, String organizedByEmail2, String reporter, String attendeeList) {
        actor.attemptsTo(Click.on(BUTTON_MEETING),
                Click.on(BUTTON_MEETINGS),
                Click.on(BUTTON_CREATE_MEETING));
        actor.attemptsTo(MeetingTask.whitInformationMeeting(meetingName,meetingType,meetingNumber,location,unit,organizedByFirstName,organizedByLastName, organizedByEmail1,organizedByEmail2,reporter,attendeeList));

    }

    @Then("^user view modal (.*) in the application$")
    public void userViewModalMessageInTheApplication() {
    }
}