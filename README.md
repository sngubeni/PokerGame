# Poker Game Application

This is a console-based Java application that simulates a simplified version of the five-card draw poker variant. The application deals a hand of 5 cards to the player and evaluates the hand to determine the highest ranked poker hand.

# Features
* Simulates shuffling a standard deck of 52 cards.
* Deals a single hand of 5 cards to the player.
* Evaluates the player's hand and informs them of the highest ranked poker hand.
* Follows standard 5-card poker hand rankings.
  
# Poker Hand Rankings
The poker hands are ranked in decreasing order as follows:

Straight Flush
Four of a Kind
Full House
Flush
Straight
Three of a Kind
Two Pair
One Pair
High Card

# Technical Requirements
Developed using Java 17.
Includes a build script using Maven to compile, package, and run the application.
Properly unit tested with JUnit.

# Project Structure
PokerGame/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── pokergame/
│   │                   ├── Card.java
│   │                   ├── Deck.java
│   │                   ├── Hand.java
│   │                   ├── PokerHandEvaluator.java
│   │                   └── PokerGame.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── pokergame/
│                       ├── DeckTest.java
│                       └── PokerHandEvaluatorTest.java
└── resources/

# Prerequisites
Java 17 or higher
Maven

# Example Output
Shuffling ... Shuffling ... Shuffling ...
Your hand: 3♣ 7♦ 7♥ 7♠ K♥
You have: Three of a Kind
