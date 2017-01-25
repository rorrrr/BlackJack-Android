package example.codeclan.com.cardproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 24/01/2017.
 */

public class LeaderboardActivity extends AppCompatActivity {

    Leaderboard mleaderboard;
    ListView leaderboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        Log.d(getClass().toString(), "onCreate Leaderboard got called");

        leaderboard = (ListView) findViewById(R.id.leaderboard);

        Intent intent = getIntent();
        Serializable ldrBrd = intent.getSerializableExtra("originalLeaderboard");
        mleaderboard = (Leaderboard) ldrBrd;

//        Log.d("LeaderboardActivity", mleaderboard.toString());

        if (mleaderboard != null) {

            HashMap<String, Integer> userScores = mleaderboard.getScores();

            ArrayList<String> leaderboardText = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : userScores.entrySet()) {
                String username = entry.getKey();
                Integer userScore = entry.getValue();
                String leaderboardEntry = username + " : " + userScore.toString();
                leaderboardText.add(leaderboardEntry);
            }

            ArrayAdapter<String> userList = new ArrayAdapter<String>(this, R.layout.winners_list, R.id.winners_name, leaderboardText);

            leaderboard.setAdapter(userList);
        }
    }

}
