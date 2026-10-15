package thursdaylive;

public class FridayTest {

    String something = "this is dynamic";

    public String isItFriday(String day){
        if(day.equalsIgnoreCase("Friday")) {
            return "Yaay";
        }
        else return "Nope";
    }

    public static String almostFriday(String day){
        if(day.equalsIgnoreCase("Friday")) {
            System.out.println("StaticYaay");
        }
        return "what now?";


        //return "Ooops";
    }
}
