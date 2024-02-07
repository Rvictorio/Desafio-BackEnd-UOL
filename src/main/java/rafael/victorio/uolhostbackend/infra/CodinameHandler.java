package rafael.victorio.uolhostbackend.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rafael.victorio.uolhostbackend.model.GroupType;
import rafael.victorio.uolhostbackend.service.CondinameService;

@Component
public class CodinameHandler {

@Autowired
private CondinameService service;
    public String findCodiname(GroupType groupType) {
        if (groupType == GroupType.AVANGERS) {
        String firstMatch = service.getAvangersCodinameList().stream().findFirst().orElseThrow();
        this.service.getAvangersCodinameList().remove(firstMatch);
        return firstMatch;
        }
        String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.service.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;
    }
}
