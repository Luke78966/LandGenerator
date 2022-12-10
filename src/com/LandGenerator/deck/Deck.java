package com.LandGenerator.deck;

import com.LandGenerator.card.Card;
import com.LandGenerator.card.Land.LandCard;
import com.LandGenerator.card.NonLand.NonLandCard;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private String deckName;

    private ArrayList< Card > deck;
    private ArrayList< LandCard > lands;
    private ArrayList< NonLandCard > nonLands;

    private Double averageManaCost;
    private int red = 0;
    private int white = 0;
    private int green = 0;
    private int blue = 0;
    private int black = 0;
    private int totalCost = 0;
    private int numNonLandCards = 0;



    public Deck(ArrayList<Card> cards){
        deck = cards;
    }

    public Double getAverageManaCost() {
        return averageManaCost;
    }

    public void setAverageManaCost(Double averageManaCost) {
        this.averageManaCost = averageManaCost;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getWhite() {
        return white;
    }

    public void setWhite(int white) {
        this.white = white;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getBlack() {
        return black;
    }

    public void setBlack(int black) {
        this.black = black;
    }

    public Deck(){

    }



    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public List<LandCard> getLands() {
        return lands;
    }

    public void setLands(ArrayList<LandCard> lands) {
        this.lands = lands;
    }

    public List<NonLandCard> getNonLands() {
        return nonLands;
    }

    public void setNonLands(ArrayList<NonLandCard> nonLands) {
        this.nonLands = nonLands;
    }

    public void addLandCard( LandCard card ){
        if ( deck.size() == 100){
            System.out.println("Deck is full");
            return;
        }

        deck.add( card );
        lands.add( card );

    }

    public void addNonLandCard( NonLandCard card ){
        if ( deck.size() == 100){
            System.out.println("Deck is full");
            return;
        }

        deck.add( card );
        nonLands.add( card );
    }

    public void removeCard(Card card){
        if (deck.contains(card)){
            deck.remove(card);
        }
        if (lands.contains(card)){
            lands.remove(card);
        }
        if (nonLands.contains(card)){
            nonLands.remove(card);
        }
    }


    public void analyze(){


        numNonLandCards = nonLands.size();


        for (NonLandCard card: nonLands){
            String cost = card.getManaCost();
            for (int i = 0; i < cost.length(); i++){

                String s = String.valueOf(cost.charAt(0));

                /**
                 *   Check for NUMBERS here
                 */

                if (s.equals("R")){
                    red++;
                    totalCost++;
                }
                if (s.equals("W")){
                    white++;
                    totalCost++;
                }
                if (s.equals("U")){
                    blue++;
                    totalCost++;
                }
                if (s.equals("B")){
                    black++;
                    totalCost++;
                }
                if (s.equals("G")){
                    green++;
                    totalCost++;
                }
                //char c = cost.charAt(i);




            }
        }

    }


    public List< LandCard > recommendBasicLands(){

    int availableSlots = 100 - numNonLandCards;

    int totalPips = green + black + red + blue + white;

    int greenPercentage = (green / totalPips) * availableSlots;
    int blackPercentage = black / totalPips * availableSlots;
    int redPercentage = red / totalPips * availableSlots;
    int whitePercentage = white / totalPips * availableSlots;
    int bluePercentage = blue / totalPips * availableSlots;



        return null;
    }



}
