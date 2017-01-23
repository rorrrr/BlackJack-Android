package example.codeclan.com.cardproject;

/**
 * Created by user on 22/01/2017.
 */
public class Player {
    private String name;
    private Hand hand;

    public Player(String name, Hand hand){
        this.name = name;
        this.hand = hand;
    }

//    each person will have a name, possibly waste of time. could just be player 1etc

    public String getName(){
        name.toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }

    public void addCardToHand(Card card){
        hand.addCardToHand(card);
    }

    public int getBlackjackHandValue(){
        return hand.getBlackjackValue();
    }

}


