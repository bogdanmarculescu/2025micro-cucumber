package thursdaylive;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    FridayTest ft = new FridayTest();
    String fridayResponse;
    String input;

    @Given("I see that the day is {word}")
    public void i_see_that_the_day_is_day(String inputDay) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        input = inputDay;
    }
    @When("I call the method")
    public void i_call_the_method() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        fridayResponse = ft.isItFriday(input);
        //FridayTest.almostFriday("Thursday");

    }
    @Then("I get the correct {word}")
    public void i_get_the_correct_response(String expectedResponse) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        assertEquals(expectedResponse, fridayResponse);

    }


    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}
