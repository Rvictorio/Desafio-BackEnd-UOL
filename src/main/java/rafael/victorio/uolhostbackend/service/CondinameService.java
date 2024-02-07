package rafael.victorio.uolhostbackend.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class CondinameService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;

    private List<String> avangersCodinameList = new ArrayList<>();

    ObjectMapper objectMapper = new ObjectMapper();

    @PostConstruct
        public void loadJsonData(){

            try{
                String codinameResponse = restTemplate.getForObject(env.getProperty("avangers"), String.class);
                JsonNode jsonNode = objectMapper.readTree(codinameResponse);

                ArrayNode avangers = (ArrayNode) jsonNode.get("vingadores");

                for( JsonNode item: avangers){
                    this.avangersCodinameList.add(item.get("codiname").asText());
                }

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
}
