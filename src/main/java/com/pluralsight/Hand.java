package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private String name;
    private ArrayList<Card> cards;

    public Hand(String name){
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void deal(Card card) {
        card.flip();
        cards.add(card);
    }
    public int getValue() {
        int total = 0;
        for (Card card : cards) {
            total += card.getPointValue();
        }
        return total;
    }

    public void display() {
        System.out.println(name + "'s hand:");
        for (Card card : cards) {
            System.out.println("  " + card.getValue() + " of " + card.getSuit());
        }
        System.out.println("  Total: " + getValue());
    }
}
