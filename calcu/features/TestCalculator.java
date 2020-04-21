package calcu.features;

import calcu.questions.CalculationResults;
import calcu.tasks.*;
import calcu.ui.CalculatorScreen;

import com.google.inject.internal.cglib.core.$Predicate;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.openqa.selenium.WebDriver;

import java.util.function.Predicate;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

@RunWith(SerenityRunner.class)
public class TestCalculator {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;
    private Consequence seeThat;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }


    @Test
    public void calculate_1_and_2() {

        anna.attemptsTo(
                AddNumber.calculator()
        );
        anna.should(
                seeThat(CalculationResults.calculationResult(), equalTo("3"))

        );
        anna.attemptsTo(
                SubNumber.calculator()
        );
        anna.should(
                seeThat(CalculationResults.calculationResult(), equalTo("−1"))
        );

        anna.attemptsTo(
                MultiNumber.calculator()
        );
        anna.should(
                seeThat(CalculationResults.calculationResult(), equalTo("2"))
        );

        anna.attemptsTo(
                DivNumber.calculator()
        );
        anna.should(
                seeThat(CalculationResults.calculationResult(), equalTo("0.5"))
        );


    }

}