package rafael.victorio.uolhostbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafael.victorio.uolhostbackend.controller.dtos.PlayerDto;
import rafael.victorio.uolhostbackend.model.Player;
import rafael.victorio.uolhostbackend.repositories.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        return repository.save(newPlayer);
    }
}
