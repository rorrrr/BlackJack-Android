package example.codeclan.com.cardproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/01/2017.
 */
public class CardTest {
    Card card;

    @Before
    public void beforeEach() {
        card = new Card(Rank.DEUCE, Suit.DIAMONDS);
    }

    @Test
    public void canGetValue() {
        assertEquals(2, card.getValue());
    }

    @Test
    public void testCardDetailsAsString(){
        assertEquals("DEUCE of DIAMONDS", card.cardDetails());
    }

}