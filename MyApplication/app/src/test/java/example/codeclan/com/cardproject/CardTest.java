package example.codeclan.com.cardproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/01/2017.
 */
public class CardTest {
    Card card;
    Card card2;
    Card card3;

    @Before
    public void beforeEach() {
        card = new Card(Rank.DEUCE, Suit.DIAMONDS);
        card2 = new Card(Rank.JACK, Suit.HEARTS);
        card3 = new Card(Rank.ACE, Suit.SPADES);
    }

    @Test
    public void canGetValue() {
        assertEquals(2, card.getBlackJackValue());
    }

    @Test
    public void canGetValueOfPictureCard() {
        assertEquals(10, card2.getBlackJackValue());
    }

    @Test
    public void canGetValueOfAce() {
        assertEquals(11, card3.getBlackJackValue());
    }

    @Test
    public void testCardDetailsAsString(){
        assertEquals("DEUCE of DIAMONDS", card.cardDetails());
    }

}