package com.example.volleyball.controllers;

import com.example.volleyball.models.Player;
import com.example.volleyball.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService service;

    @GetMapping("/getAllPlayers")
    public List<Player> getAllPlayers() {
        return service.getAllPlayers();
    }

    @GetMapping("/player/{playerId}")  //endpoint to /player
    public Player getPlayer(@PathVariable UUID playerId) {
        return service.getPlayerById(playerId);
    }

    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player player) {
        return service.AddPlayer(player);
    }

    @DeleteMapping("/player/del/{playerId}")
    public void deletePlayer(@PathVariable UUID playerId) {
        service.deletePlayer(playerId);
    }

    @PutMapping("player/edit/{playerId}")
    public Player updatePlayer(@PathVariable UUID playerId, @RequestBody Player player) {
        return service.updatePlayer(playerId, player);
    }
}
