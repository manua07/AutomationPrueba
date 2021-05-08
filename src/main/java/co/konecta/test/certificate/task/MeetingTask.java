package co.konecta.test.certificate.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.test.certificate.userinterface.BusinessUnitPage.*;
import static co.konecta.test.certificate.userinterface.MeetingPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MeetingTask implements Task {

    private final String meetingName;
    private final String meetingType;
    private final String meetingNumber;
    private final String location;
    private final String unit;
    private final String organizedByFirstName;
    private final String organizedByLastName;
    private final String organizedByEmail1;
    private final String organizedByEmail2;
    private final String reporter;
    private final String attendeeList;

    public MeetingTask(String meetingName, String meetingType, String meetingNumber, String location, String unit, String organizedByFirstName, String organizedByLastName, String organizedByEmail1, String organizedByEmail2, String reporter, String attendeeList) {
        this.meetingName = meetingName;
        this.meetingType = meetingType;
        this.meetingNumber = meetingNumber;
        this.location = location;
        this.unit = unit;
        this.organizedByFirstName = organizedByFirstName;
        this.organizedByLastName = organizedByLastName;
        this.organizedByEmail1 = organizedByEmail1;
        this.organizedByEmail2 = organizedByEmail2;
        this.reporter = reporter;
        this.attendeeList = attendeeList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(meetingName).into(INPUT_MEETING_NAME),
                Click.on(INPUT_EDIT_MEETING_TYPE),
                Enter.theValue(meetingType).into(INPUT_MEETING_TYPE),
                Click.on(BUTTON_SAVE_MEETING_TYPE),
                Enter.theValue(meetingNumber).into(INPUT_MEETING_NUMBER),
                Click.on(BUTTON_EDIT_LOCATION),
                Enter.theValue(location).into(INPUT_LOCATION),
                Click.on(BUTTON_SAVE_LOCATION),
                Click.on(INPUT_UNIT),
                Click.on(INPUT_SEARCH_UNIT),
                Enter.theValue(unit).into(INPUT_SEARCH_UNIT).thenHit(Keys.ENTER),
                Click.on(BUTTON_EDIT_ORGANIZED_BY),
                Enter.theValue(organizedByFirstName).into(INPUT_FIRSTNAME_ORGANIZED_BY),
                Enter.theValue(organizedByLastName).into(INPUT_LASTNAME_ORGANIZED_BY),
                Enter.theValue(organizedByEmail1).into(INPUT_EMAIL1_ORGANIZED_BY),
                Enter.theValue(organizedByEmail2).into(INPUT_EMAIL2_ORGANIZED_BY),
                Click.on(BUTTON_SAVE_ORGANIZED),
                Click.on(BUTTON_REPORTER),
                Click.on(BUTTON_SEARCH_REPORTER),
                Enter.theValue(reporter).into(BUTTON_SEARCH_REPORTER).thenHit(Keys.ENTER),
                Click.on(BUTTON_ATTENDEE_LIST),
                Click.on(BUTTON_SEARCH_ATTENDEE_LIST),
                Enter.theValue(attendeeList).into(BUTTON_SEARCH_ATTENDEE_LIST).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_MEETING)
                //   Click.on(INPUT_SEARCH_PARENT_UNIT),

        );
    }

    public static MeetingTask whitInformationMeeting(String meetingName, String meetingType, String meetingNumber, String location, String unit, String organizedByFirstName, String organizedByLastName, String organizedByEmail1, String organizedByEmail2, String reporter, String attendeeList){
        return instrumented(MeetingTask.class, meetingName,meetingType,meetingNumber,location,unit,organizedByFirstName,organizedByLastName, organizedByEmail1,organizedByEmail2,reporter,attendeeList);
    }



}

