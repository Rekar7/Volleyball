package com.example.volleyball.services;

import com.example.volleyball.models.Player;

public class PlayerService {
    public Player getPlayerById(int id){
        return new Player(id,"Jan","Nowak");
    }
}
