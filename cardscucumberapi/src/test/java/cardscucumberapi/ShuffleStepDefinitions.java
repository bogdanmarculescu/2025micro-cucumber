package cardscucumberapi;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class ShuffleStepDefinitions {

    private String username;
    private final APIClient apiClient = new APIClient();
    private String response;

    @Given("a new user {word}")
    public void a_new_user_bogdan(String word) {
        this.username = word;
    }

    @When("user calls the {word} endpoint")
    public void user_calls_the_endpoint(String endpoint) throws Exception {
        // I should call and endpoint
        if(endpoint.equals("deck")) {
            // someone?? calls "/api/deck"
            response = apiClient.getDeckResponse().getBody();
        }
    }
    @Then("they get shuffled cards")
    public void they_get_shuffled_cards() {
        assertEquals("shuffled cards", response);
    }

}
