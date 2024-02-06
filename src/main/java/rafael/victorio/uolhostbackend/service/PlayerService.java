package rafael.victorio.uolhostbackend.service;

import org.springframework.stereotype.Service;
import rafael.victorio.uolhostbackend.controller.dtos.PlayerDto;
import rafael.victorio.uolhostbackend.model.Player;

@Service
public class PlayerService {

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
    }
}
