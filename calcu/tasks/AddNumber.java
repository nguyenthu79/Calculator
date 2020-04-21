package calcu.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import calcu.ui.CalculatorScreen;


public class AddNumber implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CalculatorScreen.NUMBER1),
                Click.on(CalculatorScreen.Add),
                Click.on(CalculatorScreen.NUMBER2)
              //  Click.on(CalculatorScreen.Equ)
        );


    }
    public static AddNumber calculator(){
        return instrumented(AddNumber.class);
    }
}
