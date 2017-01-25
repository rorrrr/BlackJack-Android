package example.codeclan.com.cardproject;


import java.io.Serializable;
import java.util.HashMap;


/**
 * Created by user on 24/01/2017.
 */

public class Leaderboard implements Serializable{

    public HashMap<String, Integer> userScores;

    public Leaderboard() {
        this.userScores = new HashMap<>();
    }

    public void addWinForUser(String user) {
        Integer score = userScores.get(user);
        if (score == null) {
            userScores.put(user, 1);
        } else {
            userScores.put(user, score + 1);
        }
    }

    public HashMap<String, Integer> getScores() {
        return this.userScores;
    }
}
