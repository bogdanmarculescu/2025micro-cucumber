package thursdaydemo;

public class Thursday {
    String isItFriday(String today) {
        return today.equals("Friday") ? "Yeey" : "Nope";
    }

    String isItThursday(String today) {
        return today.equals("Thursday") ? "Yep" : "Nope";
    }
}
