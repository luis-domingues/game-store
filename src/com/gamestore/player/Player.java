package com.gamestore.player;
import com.gamestore.game.Game;

public class Player {
    private String username;
    private String email;
    private Game[] games;

    public Player (String username, String email, Game[] games) {
        super();
        this.username = username;
        this.email = email;
        this.games = games;
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

    public Game[] getGames () {
        return games;
    }

    public void setGames (Game[] games) {
        this.games = games;
    }
}
