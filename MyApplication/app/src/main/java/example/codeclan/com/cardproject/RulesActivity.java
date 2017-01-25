package example.codeclan.com.cardproject;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;
import static example.codeclan.com.cardproject.R.color.colorPrimaryDark;

public class RulesActivity extends AppCompatActivity {
    TextView header;
    EditText player1name;
    EditText player2name;
    Button playbutton;
    Button leaderboardButton;
    Button resetButton;
    TextView resultsText;
    Leaderboard users;
    HashMap<String, Integer> userscores;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"CASIQN__.TTF");
        header = (TextView)findViewById(R.id.header);
        playbutton = (Button)findViewById(R.id.play_button);
        header.setTypeface(myTypeface);
//        playbutton.setTypeface(myTypeface);


        player1name = (EditText)findViewById(R.id.player1_name);
        player2name = (EditText)findViewById(R.id.player2_name);
        resultsText = (TextView)findViewById(R.id.game_output);
        leaderboardButton = (Button)findViewById(R.id.leaderboard_Button);
        resetButton = (Button)findViewById(R.id.reset_Button);

        users = new Leaderboard();


        Log.d(getClass().toString(), "onCreate got called");
    }


    public void onPlayButtonClick(View view) {

        String player1String = player1name.getText().toString();
        String player2String = player2name.getText().toString();
        player1name.setBackgroundColor(android.R.color.transparent);
        player2name.setBackgroundColor(android.R.color.transparent);
        Log.d("BlackjackGame:", "Play Button Clicked");
        Log.d("BlackjackGame:", "Players Names: '" + player1String + " " + player2String + "'");

        Player player1 = new Player(player1String, new Hand());
        Player player2 = new Player(player2String, new Hand());
        Player[] players = {player1, player2};
        Deck setOfCards = new Deck(new ArrayList<Card>());

        Rules rules = new Rules(players, setOfCards, new Scoreboard());

        String result = rules.play();
        String wonName = rules.winnersName();
        if (player1name.getText().toString().equals(wonName)) {
            player1name.setBackground(getResources().getDrawable(R.drawable.grbtn));
//            player2name.setBackgroundColor(Color.BLACK);

        } else if (player2name.getText().toString().equals(wonName)) {
//            player1name.setBackgroundColor(Color.BLACK);
            player2name.setBackground(getResources().getDrawable(R.drawable.grbtn));
        } else {
            player1name.setBackgroundColor(Color.BLUE);
            player2name.setBackgroundColor(Color.BLUE);
        }

        resultsText.setText(result);
        users.addWinForUser(rules.winnersName());
    }

    public void onLeaderboardClick(View view) {

        Log.d(getClass().toString(), "onLeaderboard clicked");

        Intent wIntent;
        wIntent = new Intent(RulesActivity.this, LeaderboardActivity.class);
        wIntent.putExtra("originalLeaderboard", users);
        startActivity(wIntent);
    }

    public void onResetButtonClick(View view) {

        Intent intent = new Intent(this, RulesActivity.class);
        this.startActivity(intent);
        this.finishAffinity();

    }






}
