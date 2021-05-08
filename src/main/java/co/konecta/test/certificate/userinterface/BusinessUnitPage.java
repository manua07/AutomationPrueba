package co.konecta.test.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusinessUnitPage {

    public static final Target BUTTON_TAB_INITIAL = Target.the("This the button tab initial").locatedBy("/html/body/div[2]/header/nav/a");
    public static final Target BUTTON_ORGANIZATION = Target.the("This the button organization").locatedBy("/html/body/div[2]/aside[1]/section/div/ul/li[6]/a/i[2]");
    public static final Target BUTTON_BUSINESS_UNITS = Target.the("This the button business units").locatedBy("/html/body/div[2]/aside[1]/section/div/ul/li[6]/ul/li[1]/a/span");
    public static final Target BUTTON_CREATE_BUSINESS = Target.the("This the button create business").locatedBy("/html/body/div[2]/div[1]/section/div/div[2]/div[2]/div/div/div[1]");
    public static final Target INPUT_NAME_BUSINESS = Target.the("This the input name business").locatedBy("/html/body/div[5]/div[2]/div/div[2]/form/div/div[1]/div/div/div[1]/input");
    public static final Target INPUT_PARENT_UNIT = Target.the("This the input parent unit").locatedBy("/html/body/div[5]/div[2]/div/div[2]/form/div/div[1]/div/div/div[2]/div[1]/a/span[1]");
    public static final Target INPUT_SEARCH_PARENT_UNIT = Target.the("This the input search parent unit").locatedBy("/html/body/div[8]/div");
    public static final Target BUTTON_SAVE_BUSINESS = Target.the("This the button save business").locatedBy("/html/body/div[5]/div[2]/div/div[1]/div/div/div/div[1]");

}
