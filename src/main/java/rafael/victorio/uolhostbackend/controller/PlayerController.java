package rafael.victorio.uolhostbackend.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rafael.victorio.uolhostbackend.controller.dtos.PlayerDto;
import rafael.victorio.uolhostbackend.model.Player;
import rafael.victorio.uolhostbackend.service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService service;

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDto dto){
    Player newPlayer = service.createPlayer(dto);

    return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }
    public ResponseEntity<List<Player>> getAllPlayers(){
        return new ResponseEntity<>(service.getAllPlayers(), HttpStatus.OK);

    }
}
