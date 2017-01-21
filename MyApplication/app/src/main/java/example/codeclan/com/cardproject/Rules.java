package example.codeclan.com.cardproject;

import java.util.ArrayList;

/**
 * Created by user on 21/01/2017.
 */

public class Rules {

    public Rules

    private void setUp(String[] cards) {

        String[] suit = {"Spades", "Diamonds", "Clubs", "Hearts"};
        String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] deck = new String[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = rank[i%13] + suit[i/13];
        }

    }


}

