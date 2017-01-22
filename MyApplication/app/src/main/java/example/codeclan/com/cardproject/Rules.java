package example.codeclan.com.cardproject;


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
            scoreboard.add(card.toString());

            card = deck.drawCard(player);
            scoreboard.add(card.toString());

            String handTotal = "Total: " + player.getBlackjackHandValue();
            scoreboard.add(handTotal);

        }
    }

//        goes through each player, puts them in an array decsending highest to lowest

    private void findHighestScore() {
        int indexOfWinner = players[0].getBlackjackHandValue() > players[1].getBlackjackHandValue() ? 0 : 1;
        String result = players[indexOfWinner].getName() + " wins!";
        scoreboard.add(result);
    }

//    shuffled deck, players get cards, determine highest score, displays each players hand n who won


    public String play() {
        deck.shuffledPopulate();
        dealCardsToPlayers();
        findHighestScore();
        return scoreboard.print();
    }








}


