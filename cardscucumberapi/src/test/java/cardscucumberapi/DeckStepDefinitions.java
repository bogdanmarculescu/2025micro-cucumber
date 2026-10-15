package cardscucumberapi;

import cardscucumberapi.model.Card;
import io.cucumber.java.en.*;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckStepDefinitions {

    APIClient client = new APIClient();
    String name;
    Integer requestedCards;
    String counted;
    Integer providedCards;
    HashMap<Long, Card> providedCardObjects;

    @Given("I am {word}")
    public void i_am_bogdan(String name) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        this.name = name;
    }
    @When("I call for {int} cards from {word}")
    public void i_call_for_cards_from_not_counted(Integer requestedCards, String counted){
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        this.requestedCards = requestedCards;
        this.counted = counted;

        if(counted.equalsIgnoreCase("counted")){
            //call method form client
            try {
                providedCardObjects = client.getDeckResponseCounted(requestedCards);
                providedCards = providedCardObjects.size();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else {
            try {
                providedCardObjects = client.getDeckResponse();
                providedCards = providedCardObjects.size();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    @Then("I receive {int} of cards")
    public void i_receive_of_cards(Integer expectedCards) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        assertEquals(expectedCards, providedCards);
    }
}
