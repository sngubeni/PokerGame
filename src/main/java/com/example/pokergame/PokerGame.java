package com.example.pokergame;

/**
 * Main application class that simulates the poker game.
 */
public class PokerGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("Shuffling ... Shuffling ... Shuffling ...");

        Hand hand = new Hand(deck.dealHand(5));
        System.out.println("Your hand: " + hand);

        String result = PokerHandEvaluator.evaluateHand(hand);
        System.out.println("You have: " + result);
    }
}