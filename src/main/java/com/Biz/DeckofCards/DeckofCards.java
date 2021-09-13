package com.Biz.DeckofCards;
public class DeckofCards {
    public static void main(String[] args) {
        System.out.println("Deck Of Cards");
        String[] SYMBOLS = {
                "/n Clubs", "/n Diamonds", "/n Hearts", "/n Spades"
        };

        String[] NUMBERS = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // initialize deck
        int n = SYMBOLS.length * NUMBERS.length;
        String[] deck = new String[n];
        for (int i = 0; i < NUMBERS.length; i++) {
            for (int j = 0; j < SYMBOLS.length; j++) {
                deck[SYMBOLS.length * i + j] = NUMBERS[i] + " of " + SYMBOLS[j];
            }
        }


    }
}