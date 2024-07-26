package com.example.pokergame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of 52 playing cards.
 */
public class Deck {
    private final List<Card> cards;

    /**
     * Constructs a Deck and initializes it with 52 cards.
     */
    public Deck() {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cards = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    /**
     * Shuffles the deck of cards.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Deals a specified number of cards from the deck.
     *
     * @param numberOfCards the number of cards to deal
     * @return a list of dealt cards
     */
    public List<Card> dealHand(int numberOfCards) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }
}