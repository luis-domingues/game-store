package com.gamestore.game;

import com.gamestore.developer.Developer;

public class Game {
    private String title;
    private double price;
    private double discount;
    private Developer developer;

    public Game(String title, double price, double discount, Developer developer) {
        super();
        this.title = title;
        this.price = price;
        this.discount = discount;
        this.developer = developer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0)
            return;
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount <= 0)
            return;
        if (discount > price)
            return;
        this.discount = discount;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
