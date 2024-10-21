package com.example.volleyball.services;

import com.example.volleyball.models.Player;
import com.example.volleyball.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public Player getPlayerById(UUID id) {
        //GET BY ID
        playerRepository.getReferenceById(id);  //po id
        return null;
    }

    //public List<Player> getAllPlayers() {
        //GETALL
        Player player = new Player(UUID.randomUUID(),"test","test2",12,false,12,"test3");

        //return playerRepository.findAll(); //wszystkich playerów szuka
    }

    public Player AddPlayer(Player player) {
        //POST
        playerRepository.save(player); //Zapis nowego playera do bazy
        return player;

    }

    public void deletePlayer(UUID id) {
        //DELETE BY ID
        playerRepository.deleteById(id); //usuń po id
    }

    public Player updatePlayer(UUID id, Player playerFromRequest) {
        //PUT
        Player player = playerRepository.getReferenceById(id);
        player.setAge(playerFromRequest.getAge());
        player.setName(playerFromRequest.getName());
        return playerRepository.save(player);
    }

    //wyrażenia lmbda
public List<String> getAllPlayersByName(String requestedName) {
      return playerRepository.findAll()
               .stream()
               .filter(ourPlayer -> ourPlayer.getName().equals(requestedName))
               .map(Player::getSureName)
               .toList();

}

    public List<Integer> getPlayersHeightByGenderAndRole(Boolean requestedGedner, String requestedRole) {

        return playerRepository.findAll()
                .stream()
                .filter(ourPlayer -> ourPlayer.getGender().equals(requestedGedner))
                .filter(ourPlayer -> ourPlayer.getRole().equals(requestedRole))
                .map(Player::getHeight)
                .toList();


    }

}
