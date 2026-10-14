package cucumberfriday;

public class IsItFriday {
    String isItFriday(String today) {
        return today.equals("Friday") ? "TGIF" : "Nope";
    }
}
