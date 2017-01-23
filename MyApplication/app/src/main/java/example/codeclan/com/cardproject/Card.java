package example.codeclan.com.cardproject;

/**
 * Created by user on 22/01/2017.
 */
public class Card {
    private Rank rank;
    private Suit suit;

    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

//    just for blackjack, using JQK's 11,12,13 to set as 10
//    start at 2, ace as 11

    public int getBlackJackValue(){
        int value = rank.ordinal() + 2;
        if (value == 14) value = 11;
        if (this.rank == Rank.Jack) value = 10;
        if (value == 12) value = 10;
        if (value == 13) value = 10;
        return value;
    }

//    return string of details eg jack of hearts

    public String cardDetails(){
        return rank + " Of " + suit;
    }
}
