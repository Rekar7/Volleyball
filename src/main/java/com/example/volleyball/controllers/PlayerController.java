package com.example.volleyball.controllers;

import com.example.volleyball.models.Player;
import com.example.volleyball.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService service;

    @GetMapping("/getAllPlayers/{id}")
    public List<Player> getAllPlayers(@PathVariable int id) {

        return List.of(service.getPlayerById(id));
    }

    @GetMapping("/player/{playerId}")  //endpoint to /player
    public Player getPlayer(@PathVariable int playerId) {
        return service.getPlayerById(playerId);
    }

    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player player) {
        return service.AddPlayer(player);
    }

    @DeleteMapping("/player/del/{playerId}")
    public Player deletePlayer(@PathVariable int playerId) {
        return service.deletePlayer(playerId);
    }

    @PutMapping("player/edit/{playerId}")
    public Player updatePlayer(@PathVariable int playerId, @RequestBody Player player) {
        return service.updatePlayer(playerId);
    }
}
