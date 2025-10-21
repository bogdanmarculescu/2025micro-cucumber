package cardscucumberapi;


import cardscucumberapi.model.Card;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class APIClient {
    private static final String BACKEND_HOST="http://localhost:8100";
    private ResponseEntity<String> response;

    public HashMap<Long, Card> getDeckResponse() throws Exception{
        //ResponseEntity<Map> response = new RestTemplate().getForEntity(BACKEND_HOST + "/api/deck", Map.class);

        RestTemplate restTemplate = new RestTemplate();
        HashMap<Long, Card> response= Objects
                .requireNonNull(
                restTemplate
                        .exchange(BACKEND_HOST + "/api/deck",
                                HttpMethod.GET,
                                null,
                                new ParameterizedTypeReference<HashMap<Long, Card>>() {
                }).getBody());

        //HashMap res  = new RestTemplate().getForObject(BACKEND_HOST + "/api/deck", HashMap.class);
        return response;
    }

    public List<Object> getResolverResponse() throws Exception{
        //ResponseEntity<Map> response = new RestTemplate().getForEntity(BACKEND_HOST + "/api/deck", Map.class);

        RestTemplate restTemplate = new RestTemplate();
        List<Object> response= Objects
                .requireNonNull(
                        restTemplate
                                .exchange(BACKEND_HOST + "/api/resolver/outcomes",
                                        HttpMethod.GET,
                                        null,
                                        new ParameterizedTypeReference<List<Object>>() {
                                        }).getBody());

        //HashMap res  = new RestTemplate().getForObject(BACKEND_HOST + "/api/deck", HashMap.class);
        return response;
    }

}
