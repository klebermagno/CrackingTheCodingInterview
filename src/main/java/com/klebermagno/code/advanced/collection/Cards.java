package com.klebermagno.code.advanced.collection;

public class Cards {
    private enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }
    private enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    private Suit suit;
    private Rank rank;

    public Cards(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
}
