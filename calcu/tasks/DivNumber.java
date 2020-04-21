package calcu.tasks;

import calcu.ui.CalculatorScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DivNumber implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CalculatorScreen.Clean),
                Click.on(CalculatorScreen.Clean),
              //  Click.on(CalculatorScreen.NUMBER1),
                Click.on(CalculatorScreen.Div),
                Click.on(CalculatorScreen.NUMBER2)
              //  Click.on(CalculatorScreen.Equ)
                //Click.on(CalculatorScreen.Result)
        );
    }

    public static DivNumber calculator(){
        return instrumented(DivNumber.class);
    }
}
