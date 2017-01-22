package example.codeclan.com.cardproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 22/01/2017.
 */
public class DeckTest {

    Deck setOfCards;
    Player player;

    @Before
    public void beforeEach(){
        setOfCards = new Deck(new ArrayList<Card>());
        player = new Player("Rory", new Hand());
    }

//    will draw card at index 0, right now is 2diamonds

    @Test
    public void canDealCard() {
        setOfCards.drawCard(player);
        assertEquals(2, player.getBlackjackHandValue());
    }

}