package example.codeclan.com.cardproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/01/2017.
 */
public class HandTest {
    Hand hand;
    Card card1;
    Card card2;


    @Before
    public void before() {
        hand = new Hand();
        card1 = new Card(Rank.Ace, Suit.Diamonds);
        card2 = new Card(Rank.Ace, Suit.Clubs);
        hand.addCardToHand(card1);
        hand.addCardToHand(card2);
    }

    @Test
    public void canGetBlackjackValueOfHand(){
        assertEquals(12, hand.getBlackjackValue());
    }

}