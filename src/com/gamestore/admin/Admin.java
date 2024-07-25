package com.gamestore.admin;

import com.gamestore.user.User;

public class Admin extends User {

    private String password;

    public Admin (String username, String email, String password) {
        super (username, email);
        this.password = password;
    }
}
