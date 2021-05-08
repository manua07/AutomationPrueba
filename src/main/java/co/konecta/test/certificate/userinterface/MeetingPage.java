package co.konecta.test.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MeetingPage {

    public static final Target INPUT_MEETING_NAME = Target.the("").locatedBy("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[1]/input");
    public static final Target INPUT_MEETING_TYPE = Target.the("").locatedBy("/html/body/div[6]/div[2]/div/div[2]/form/div/div[1]/div/div/div/input");
    public static final Target INPUT_EDIT_MEETING_TYPE = Target.the("This the button level report").locatedBy("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[2]/a");
    public static final Target INPUT_MEETING_NUMBER = Target.the("").locatedBy("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[3]/input");
    public static final Target BUTTON_EDIT_LOCATION = Target.the("This the input date level measurement").locatedBy("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[6]/a");

    public static final Target INPUT_LOCATION = Target.the("This the input date level measurement").locatedBy("/html/body/div[6]/div[2]/div/div[2]/form/div/div[1]/div/div/div[1]/input");
    public static final Target INPUT_UNIT = Target.the("").locatedBy("/html/body/div[3]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[7]/div[1]/a/span[1]");
    public static final Target INPUT_SEARCH_UNIT = Target.the("This the input observations").locatedBy("/html/body/div[8]/div/input");

    public static final Target BUTTON_EDIT_ORGANIZED_BY= Target.the("").locatedBy("/html/body/div[3]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[8]/a");
    public static final Target INPUT_FIRSTNAME_ORGANIZED_BY= Target.the("").locatedBy("/html/body/div[10]/div[2]/div/div[2]/form/div/div[1]/div/div/div[2]/input");
    public static final Target INPUT_LASTNAME_ORGANIZED_BY= Target.the("").locatedBy("/html/body/div[10]/div[2]/div/div[2]/form/div/div[1]/div/div/div[3]/input");
    public static final Target INPUT_EMAIL1_ORGANIZED_BY= Target.the("").locatedBy("/html/body/div[10]/div[2]/div/div[2]/form/div/div[1]/div/div/div[4]/input[1]");
    public static final Target INPUT_EMAIL2_ORGANIZED_BY= Target.the("").locatedBy("/html/body/div[10]/div[2]/div/div[2]/form/div/div[1]/div/div/div[4]/input[2]");

    public static final Target BUTTON_MEETING= Target.the("").locatedBy("/html/body/div[2]/aside[1]/section/div/ul/li[5]/a/span");
    public static final Target BUTTON_MEETINGS= Target.the("This the input observations").locatedBy("/html/body/div[2]/aside[1]/section/div/ul/li[5]/ul/li[1]/a");
    public static final Target BUTTON_CREATE_MEETING= Target.the("This the input observations").locatedBy("/html/body/div[2]/div[1]/section/div/div[2]/div[2]/div/div/div[1]");

    public static final Target BUTTON_REPORTER= Target.the("This the input observations").locatedBy("/html/body/div[3]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[9]/div[1]/a/span[1]");
    public static final Target BUTTON_SEARCH_REPORTER= Target.the("This the input observations").locatedBy("/html/body/div[10]/div/input");
    public static final Target BUTTON_ATTENDEE_LIST= Target.the("This the input observations").locatedBy("/html/body/div[3]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[1]/div[2]/a/span[1]");
    public static final Target BUTTON_SEARCH_ATTENDEE_LIST= Target.the("This the input observations").locatedBy("/html/body/div[11]/div/input");


    public static final Target BUTTON_SAVE_MEETING_TYPE = Target.the("").locatedBy("/html/body/div[6]/div[2]/div/div[1]/div/div/div/div[1]");
    public static final Target BUTTON_SAVE_LOCATION = Target.the("").locatedBy("/html/body/div[6]/div[2]/div/div[1]/div/div/div/div[1]");
    public static final Target BUTTON_SAVE_ORGANIZED = Target.the("").locatedBy("/html/body/div[10]/div[2]/div/div[1]/div/div/div/div[1]");
    public static final Target BUTTON_SAVE_MEETING = Target.the("").locatedBy("/html/body/div[3]/div[1]/section/div[2]/div[2]/div[1]/div[1]/div/div/div/div[1]");


}
