package com.example.pokergame;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {
    @Test
    public void testDeckShuffleAndDeal() {
        Deck deck = new Deck();
        deck.shuffle();
        List<Card> hand = deck.dealHand(5);
        assertEquals(5, hand.size());
    }
}