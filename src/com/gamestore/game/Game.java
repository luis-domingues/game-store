package com.gamestore.game;

public class Game {
    //atributos da classe
    public String title;
    public double price;
    public double discount;

    //comportamento da classe `Game.java`
    public double getDiscountedPrice () {
        return price - discount;
    }
}
