package com.example.volleyball.controllers;
import com.example.volleyball.models.Player;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {

    @GetMapping("/player/{playerId}")  //endpoint to /player
    public Player getPlayer(@PathVariable int playerId) {
        return new Player(playerId, "Rychu", "Gortat");
   }

   @PostMapping("/player")
   public Player addPlayer(@RequestBody Player player) {
        return player;
   }

   @DeleteMapping("/player/del/{playerId}")
    public Player deletePlayer(@PathVariable int playerId) {
        return new Player(playerId, "Rychu", "Gortat");
   }

    @PutMapping("player/edit/{playerId}")
    public Player updatePlayer(@PathVariable int playerId, @RequestBody Player player) {
        return player;
    }
}
