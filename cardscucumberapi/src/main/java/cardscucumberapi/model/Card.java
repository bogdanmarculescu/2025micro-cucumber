package cardscucumberapi.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.context.annotation.Bean;


public class Card {
    Long id;
    Long value;
    String filename;
    String suite;
}
