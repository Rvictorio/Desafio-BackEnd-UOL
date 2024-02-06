package rafael.victorio.uolhostbackend.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rafael.victorio.uolhostbackend.controller.dtos.PlayerDto;
import rafael.victorio.uolhostbackend.model.Player;
import rafael.victorio.uolhostbackend.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService service;

    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDto dto){
    Player newPlayer = service.createPlayer(dto);
    }
}
