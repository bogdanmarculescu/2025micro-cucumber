package cardscucumberapi;

import cardscucumberapi.model.Card;
import io.cucumber.java.en.*;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class ShuffleStepDefinitions {

    private String username;
    private final APIClient apiClient = new APIClient();
    private HashMap<Long, Card> response;
    private List<Object> otherresponse;

    @Given("a new user {word}")
    public void a_new_user_bogdan(String word) {
        this.username = word;
    }

    @When("user calls the {word} endpoint")
    public void user_calls_the_endpoint(String endpoint) throws Exception {
        // I should call and endpoint
        if(endpoint.equals("deck")) {
            // someone?? calls "/api/deck"
            response = apiClient.getDeckResponse();
        }
        else if(endpoint.equals("resolver")) {
            otherresponse = apiClient.getResolverResponse();
        }

    }
    @Then("they get a {int} of shuffled cards")
    public void they_get_shuffled_cards(int number) {

        assertEquals(number, response.size());
        Set<Card> uniques = new HashSet<>(response.values());
        assertEquals(response.size(), uniques.size());

        List<Boolean> result = response.values().stream().map(ShuffleStepDefinitions::validCard).collect(Collectors.toList());
        assertTrue(result.stream().noneMatch( o ->  o==false));
    }

    private static boolean validCard(Card card) {
        boolean valid = false;
        if(card.suite.equals("DIAMONDS") ||
            card.suite.equals("HEARTS")  ||
            card.suite.equals("SPADES")  ||
                card.suite.equals("CLUBS")
            )  {
            valid = true;
        }
        return valid;
    }

    @Then("there are  more than {long} items")
    public void thereIsOneItemWithIdId(Long items) {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(otherresponse.size() >= items);
    }
}
