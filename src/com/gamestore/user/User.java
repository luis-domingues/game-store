package com.gamestore.user;

import com.gamestore.game.Game;

import java.util.ArrayList;

public class User {
    protected String username;
    private String email;
    private ArrayList<Game> games;

    public User(String username, String email) {
        super();
        this.username = username;
        this.email = email;
        this.games = new ArrayList<Game>();
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public ArrayList<Game> getGames () {
        return games;
    }

    public void setGames (ArrayList<Game> games) {
        this.games = games;
    }
}
