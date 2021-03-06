package co.konecta.test.certificate.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.security.Key;

import static co.konecta.test.certificate.userinterface.LoginPage.PASSWORD;
import static co.konecta.test.certificate.userinterface.LoginPage.USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

    public class LoginTask implements Task {

        private final String username;
        private final String password;

        public LoginTask(String username, String password) {
            this.username = username;
            this.password = password;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(username).into(USER),
                    Enter.theValue(password).into(PASSWORD).thenHit(Keys.ENTER)

            );
        }

        public static LoginTask whitCredentials(String username, String password){
            return instrumented(LoginTask.class, username, password);
        }

}
