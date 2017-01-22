package example.codeclan.com.cardproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 21/01/2017.
 */

public class Deck {
    private ArrayList<Card> setOfCards;

//    creates an array of Cards

    public Deck(ArrayList<Card> setOfCards) {
        this.setOfCards = setOfCards;
        populate();
    }

//    creates a deck, for each suit gives a rank using the enums
//    shuffles NO LONGER IS SHUFFLED FOR TESTING REASON

    public void populate(){
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                setOfCards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(setOfCards);
    }


//    Dealing one card at a time to each player PLAYER
//    adds card at index0 and removes card at index0

    public Card drawCard(Player player){
        Card card = setOfCards.get(0);
        player.addCardToHand(card);
        setOfCards.remove(0);
        return card;
    }

}
