package co.konecta.test.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

        public static final Target USER = Target.the("This the input user").located(By.id("StartSharp_Membership_LoginPanel0_Username"));
        public static final Target PASSWORD = Target.the("This the input password").located(By.id("StartSharp_Membership_LoginPanel0_Password"));
        public static final Target MESSAGE = Target.the("The message alert").locatedBy("//*[contains(text(), '{0}')]");

    }

