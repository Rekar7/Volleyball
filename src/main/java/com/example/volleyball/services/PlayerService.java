package com.example.volleyball.services;

import com.example.volleyball.models.Player;
import com.example.volleyball.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private PlayerRepository playerRepository;

    public Player getPlayerById(int id){
        return new Player(id,"Jan","Nowak");
    }
}
