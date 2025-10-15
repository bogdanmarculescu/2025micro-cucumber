package cucumberfriday;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    IsItFriday well = new IsItFriday();

    private String today;
    private String actualAnswer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("I as whether it's Friday yet")
    public void i_as_whether_it_s_friday_yet() {
        this.actualAnswer = well.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(actualAnswer, expectedAnswer);
    }

}
