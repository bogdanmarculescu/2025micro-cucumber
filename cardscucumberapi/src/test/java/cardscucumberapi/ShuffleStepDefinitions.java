package cardscucumberapi;

import cardscucumberapi.model.Card;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;

import java.util.HashMap;
import java.util.Map;

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
    @Then("they get a {int} of shuffled cards")
    public void they_get_shuffled_cards(int number) {
        // check number of cards

        ObjectMapper mapper = new ObjectMapper();
        Map<Long, Card> cards = new HashMap<Long, Card>();

        try {
            cards = mapper.readValue(response,
                    //new TypeReference<Map<Long, Card>>() {}
                    Map.class
                    );

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        assertEquals(number, cards.size());
    }

}
