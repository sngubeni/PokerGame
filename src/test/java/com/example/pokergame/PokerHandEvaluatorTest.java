package com.example.pokergame;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class PokerHandEvaluatorTest {
    @Test
    public void testEvaluateHand() {
        Hand hand = new Hand(Arrays.asList(
                new Card("♠", "2"),
                new Card("♠", "3"),
                new Card("♠", "4"),
                new Card("♠", "5"),
                new Card("♠", "6")
        ));
        String result = PokerHandEvaluator.evaluateHand(hand);
        assertEquals("Straight Flush", result);
    }
}