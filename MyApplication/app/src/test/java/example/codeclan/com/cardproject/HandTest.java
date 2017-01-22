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
        card1 = new Card(Rank.DEUCE, Suit.DIAMONDS);
        card2 = new Card(Rank.THREE, Suit.CLUBS);
        hand.addCardToHand(card1);
        hand.addCardToHand(card2);
    }

    @Test
    public void canGetBlackjackValueOfHand(){
        assertEquals(5, hand.getBlackjackValue());
    }

}