package example.codeclan.com.cardproject;


//import org.apache.commons.lang.WordUtils;


/**
 * Created by user on 21/01/2017.
 */

public class Rules {
    private Player[] players;
    private Deck deck;
    public Scoreboard scoreboard;


    public Rules(Player[] players, Deck deck, Scoreboard scoreboard){
        this.players = players;
        this.deck = deck;
        this.scoreboard = scoreboard;
    }

//    a for loop dealing 2 cards to each player in player array
//    while putting "X of Y" into a scoresheet to track.
//    then displays the total hand value for those 2 cards

    private void dealCardsToPlayers() {
        Card card;

        for (Player player : players) {
            scoreboard.add(player.getName());

            card = deck.drawCard(player);
            scoreboard.add(card.cardDetails());

            card = deck.drawCard(player);
            scoreboard.add(card.cardDetails());

            String handTotal = "Total: " + player.getBlackjackHandValue() + "\n";
            scoreboard.add(handTotal);

        }
    }

//        goes through each player, puts them in an array decsending highest to lowest

    private void findHighestScore() {
        int indexOfWinner = players[0].getBlackjackHandValue() > players[1].getBlackjackHandValue() ? 0 : 1;
        String result = "It's Lit, " + players[indexOfWinner].getName() + " Wins!";
        scoreboard.add(result);
    }

//    shuffled deck, players get cards, determine highest score, displays each players hand n who won


    public String play() {
        deck.shuffle();
        dealCardsToPlayers();
        findHighestScore();
        String results = scoreboard.print();
//        return WordUtils.capitalizeFully(results);
//        results.toLowerCase();
//        results = results.substring(0, 1).toUpperCase() + results.substring(1).toLowerCase();
        return results;
    }



}


