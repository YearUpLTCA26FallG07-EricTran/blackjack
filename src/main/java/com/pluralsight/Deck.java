package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        //first make array list for cards
        cards = new ArrayList<>();
        String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
        String[] value = {"2", "3","4","5","6","7","8","9","10","J","Q","K","A"};


        //now assign 1 suit to each card value so 1:13
        for (String suit: suits) {
            for (String v : value){
                cards.add(new Card(suit, v));

            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card deal() {
        return cards.remove(0);
    }
}
