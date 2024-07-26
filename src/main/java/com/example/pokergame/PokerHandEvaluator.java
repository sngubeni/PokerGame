package com.example.pokergame;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Evaluates a poker hand and determines the highest ranked poker hand.
 */
public class PokerHandEvaluator {

    /**
     * Evaluates the given hand and returns the highest ranked poker hand.
     *
     * @param hand the hand to evaluate
     * @return the highest ranked poker hand
     */
    public static String evaluateHand(Hand hand) {
        List<Card> cards = hand.getCards();
        if (isStraightFlush(cards)) {
            return "Straight Flush";
        } else if (isFourOfAKind(cards)) {
            return "Four of a Kind";
        } else if (isFullHouse(cards)) {
            return "Full House";
        } else if (isFlush(cards)) {
            return "Flush";
        } else if (isStraight(cards)) {
            return "Straight";
        } else if (isThreeOfAKind(cards)) {
            return "Three of a Kind";
        } else if (isTwoPair(cards)) {
            return "Two Pair";
        } else if (isOnePair(cards)) {
            return "One Pair";
        } else {
            return "High Card";
        }
    }

    private static boolean isStraightFlush(List<Card> cards) {
        return isFlush(cards) && isStraight(cards);
    }

    private static boolean isFourOfAKind(List<Card> cards) {
        return getRankCount(cards).containsValue(4);
    }

    private static boolean isFullHouse(List<Card> cards) {
        Map<String, Integer> rankCount = getRankCount(cards);
        return rankCount.containsValue(3) && rankCount.containsValue(2);
    }

    private static boolean isFlush(List<Card> cards) {
        String suit = cards.get(0).suit();
        return cards.stream().allMatch(card -> card.suit().equals(suit));
    }

    private static boolean isStraight(List<Card> cards) {
        List<Integer> ranks = cards.stream()
                .map(card -> getRankValue(card.rank()))
                .sorted()
                .toList();
        return IntStream.range(0, ranks.size() - 1).noneMatch(i -> ranks.get(i) + 1 != ranks.get(i + 1));
    }

    private static boolean isThreeOfAKind(List<Card> cards) {
        return getRankCount(cards).containsValue(3);
    }

    private static boolean isTwoPair(List<Card> cards) {
        long pairCount = getRankCount(cards).values().stream().filter(count -> count == 2).count();
        return pairCount == 2;
    }

    private static boolean isOnePair(List<Card> cards) {
        return getRankCount(cards).containsValue(2);
    }

    private static Map<String, Integer> getRankCount(List<Card> cards) {
        Map<String, Integer> rankCount = new HashMap<>();
        cards.forEach(card -> rankCount.put(card.rank(), rankCount.getOrDefault(card.rank(), 0) + 1));
        return rankCount;
    }

    private static int getRankValue(String rank) {
        return switch (rank) {
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            case "A" -> 14;
            default -> throw new IllegalArgumentException("Invalid card rank: " + rank);
        };
    }
}