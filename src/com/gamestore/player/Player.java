package com.gamestore.player;

import com.gamestore.game.Game;
import com.gamestore.user.User;

import java.util.ArrayList;

public class Player extends User {
    private ArrayList<Player> friends;

    public Player(String username, String email, ArrayList<Player> friends) {
        super(username, email);
        this.friends = new ArrayList<Player>();
    }

    public ArrayList<Player> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Player> friends) {
        this.friends = friends;
    }
}
