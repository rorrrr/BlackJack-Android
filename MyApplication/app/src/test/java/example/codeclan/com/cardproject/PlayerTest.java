package example.codeclan.com.cardproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/01/2017.
 */
public class PlayerTest {
    Player player;
    Card card1;
    Card card2;

    @Before
    public void before(){
        player = new Player("Rory", new Hand());
        card1 = new Card(Rank.Ace, Suit.Diamonds);
        card2 = new Card(Rank.Jack, Suit.Clubs);
    }

    @Test
    public void canGetName(){
        assertEquals("Rory", player.getName());
    }

    @Test
    public void canAddCardsAndGetBlackJackValue() {
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        assertEquals(21, player.getBlackjackHandValue());
    }

}