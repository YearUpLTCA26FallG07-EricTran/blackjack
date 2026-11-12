package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean faceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        if (faceUp) {
            return suit;
        } else {
            return "#";
        }


    }

    public String getValue() {
        if (faceUp) {
            return this.value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        if (faceUp) {
            if (value.equals("J") || value.equals("Q") || value.equals("K")) {
                return 10;
            } else if (value.equals("A")) {
                return 11;
            }
            else {
                return (Integer.parseInt(value));
        }

        }
        else {
            return 0;
        }
    }

    public boolean isIsfaceUp() {
        return faceUp;

    }

    public void flip () {
        faceUp = !faceUp;
    }

}
