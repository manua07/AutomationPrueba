package co.konecta.test.certificate.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.konecta.test.certificate.userinterface.LoginPage.MESSAGE;

public class TheMessage implements Question<Boolean> {

    private final String message;

    public TheMessage(String message) {
        this.message = message;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return MESSAGE.of(message).resolveFor(actor).isVisible();
    }

    public static TheMessage isVisible(String message){
        return  new TheMessage(message);
    }
}