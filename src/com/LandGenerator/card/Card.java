package com.LandGenerator.card;

public abstract class Card {

    private String title;


    public Card(){

    }

    public void setTitle( String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
