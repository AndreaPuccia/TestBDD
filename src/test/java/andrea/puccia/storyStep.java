package andrea.puccia;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;

public class storyStep {

    Calculator c;
    int result;

    @Given("create calculator with value $integer1")
    public void givenCreateCalculatorWithValue(int integer1) {
        c = new Calculator(integer1);
    }

    @When("multiply the number $integer1")
    public void whenMultiplyTheNumber(int integer1) {
        c.multiply(integer1);
    }

    @Then("final result is $integer1")
    public void thenFinalResultIs(int integer1) {
        assertEquals(c.getResult(), integer1);
    }
}
