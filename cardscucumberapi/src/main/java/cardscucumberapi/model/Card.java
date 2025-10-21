package cardscucumberapi.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.context.annotation.Bean;


public class Card {
    public Long id;
    public Long value;
    public String filename;
    public String suite;
}
