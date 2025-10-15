package cardscucumberapi;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class APIClient {
    private static final String BACKEND_HOST="http://localhost:8100";
    private ResponseEntity<String> response;

    public ResponseEntity<String> getDeckResponse() throws Exception{
        ResponseEntity<String> response = new RestTemplate().getForEntity(BACKEND_HOST+"/api/deck",String.class);
        return response;
    }

}
