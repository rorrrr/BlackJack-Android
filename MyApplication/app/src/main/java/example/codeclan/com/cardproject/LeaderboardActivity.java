package example.codeclan.com.cardproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by user on 24/01/2017.
 */

public class LeaderboardActivity extends AppCompatActivity {

    ListView leaderboard;
//    LeaderboardListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        Log.d(getClass().toString(), "onCreate Leaderboard got called");

//        ListAdapter mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, );
        leaderboard = (ListView)findViewById(R.id.leaderboard);

    }


}
