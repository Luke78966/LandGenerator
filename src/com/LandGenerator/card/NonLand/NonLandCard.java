package com.LandGenerator.card.NonLand;

import com.LandGenerator.card.Card;

public class NonLandCard extends Card {

    private String manaCost;

    private String cardDescription;


    public NonLandCard(){

    }

    public NonLandCard( String manaCost, String cardDescription ) {
        this.manaCost = manaCost;
        this.cardDescription = cardDescription;
    }




    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }
}
