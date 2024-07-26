package com.example.pokergame;

import java.util.List;

/**
 * Represents a player's hand of cards.
 */
public class Hand {
    private final List<Card> cards;

    /**
     * Constructs a Hand with the specified list of cards.
     *
     * @param cards the list of cards in the hand
     */
    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    /**
     * Returns the list of cards in the hand.
     *
     * @return the list of cards in the hand
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Returns a string representation of the hand.
     *
     * @return a string representation of the hand
     */
    @Override
    public String toString() {
        return cards.stream()
                .map(Card::toString)
                .reduce((card1, card2) -> card1 + " " + card2)
                .orElse("");
    }
}