package rafael.victorio.uolhostbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafael.victorio.uolhostbackend.controller.dtos.PlayerDto;
import rafael.victorio.uolhostbackend.infra.CodinameHandler;
import rafael.victorio.uolhostbackend.model.GroupType;
import rafael.victorio.uolhostbackend.model.Player;
import rafael.victorio.uolhostbackend.repositories.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }

    private String getCodiname(GroupType groupType){
        return handler.findCodiname(groupType);
    }

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
}
