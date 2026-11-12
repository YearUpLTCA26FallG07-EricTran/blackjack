package com.pluralsight;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        int numPlayers = playerAmount();
        ArrayList<Hand> hands = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++) {
            String name = Console.promptForString("Enter name for player " + (i + 1) + ": ");
            hands.add(new Hand(name));
        }

        Deck deck = new Deck();
        deck.shuffle();

        for (Hand hand : hands) {
            hand.deal(deck.deal());
            hand.deal(deck.deal());
        }


        for (Hand hand : hands) {
            hand.display();

        }
    }

    public static int playerAmount() {
        return Console.promptForInt("How many players?");
        }

}