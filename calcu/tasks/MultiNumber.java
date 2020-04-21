package calcu.tasks;

import calcu.ui.CalculatorScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultiNumber implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CalculatorScreen.Clean),
                Click.on(CalculatorScreen.Clean),
            //    Click.on(CalculatorScreen.NUMBER1),
                Click.on(CalculatorScreen.Multi),
                Click.on(CalculatorScreen.NUMBER2)
//            //    Click.on(CalculatorScreen.Result)
        );
    }
    public static MultiNumber calculator(){
        return instrumented(MultiNumber.class);

    }
}
