package example.codeclan.com.cardproject;

import java.util.ArrayList;

/**
 * Created by user on 22/01/2017.
 */
public class Hand {
    private ArrayList<Card> drawncards;


//    creating an array for the cards in players hands
    public Hand() {
        this.drawncards = new ArrayList<Card>();
    }

    public void addCardToHand(Card card) {
        drawncards.add(card);
    }

//    made specific to blackjack. total of cards in hand

    public int getBlackjackValue(){
        int total = 0;
        for (Card card : drawncards){
            total += card.getBlackJackValue();
        }
        return total;
    }




}

