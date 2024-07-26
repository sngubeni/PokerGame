package com.example.pokergame;

/**
 * Represents a single card in a deck.
 */
public record Card(String suit, String rank) {

    /**
     * Returns a string representation of the card.
     *
     * @return a string representation of the card in the format "rank + suit"
     */
    @Override
    public String toString() {
        return rank + suit;
    }
}