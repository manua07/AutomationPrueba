package co.konecta.test.certificate.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static co.konecta.test.certificate.userinterface.BusinessUnitPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusinessUnitTask implements Task {

    private final String nameBusiness;

    public BusinessUnitTask(String nameBusiness) {
        this.nameBusiness = nameBusiness;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nameBusiness).into(INPUT_NAME_BUSINESS),
                Click.on(INPUT_PARENT_UNIT)

        );
    }

    public static BusinessUnitTask whitInformationBusiness(String nameBusiness){
        return instrumented(BusinessUnitTask.class, nameBusiness);
    }



}
