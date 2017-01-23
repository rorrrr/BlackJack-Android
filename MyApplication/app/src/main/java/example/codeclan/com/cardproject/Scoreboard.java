package example.codeclan.com.cardproject;

import java.util.ArrayList;

/**
 * Created by user on 22/01/2017.
 */

public class Scoreboard {

    private ArrayList<String> activeDetails;

    public Scoreboard(){
        this.activeDetails = new ArrayList<>();
    }

    public void add(String string) {
        activeDetails.add(string);
    }

//    dont understand why it wants to return null there

    public String print(){
        String finalResults = "";
        for (String activeDetail : activeDetails){
            finalResults += activeDetail + "\n";
        }
        return finalResults;
    }

}
