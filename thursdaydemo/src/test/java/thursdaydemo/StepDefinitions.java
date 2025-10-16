package thursdaydemo;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    String today;
    Thursday thursday;
    String actualResult;

    @Given("I know that  today is {word}")
    public void i_know_what_today_is(String day) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        this.today = day;
        this.thursday = new Thursday();
    }

    @When("I ask  if it's {word}")
    public void i_ask_if_it_s_friday(String method) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        if (method.equals("Friday")) {
            actualResult = thursday.isItFriday(today);
        }
        else {
            actualResult = thursday.isItThursday(today);
        }
    }

    @Then("I get an {word}")
    public void i_get_an_answer(String expectedAnswer) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        assertEquals(expectedAnswer, actualResult);

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
