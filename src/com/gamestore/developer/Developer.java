package com.gamestore.developer;

import com.gamestore.game.Game;
import com.gamestore.user.User;

import java.util.ArrayList;

public class Developer extends User {
    private String adders;

    public Developer (String username, String email, String adders) {
        super (username, email);
        this.adders = adders;
    }

    public String getAdders () {
        return adders;
    }

    public void setAdders (String adders) {
        this.adders = adders;
    }
}