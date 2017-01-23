package example.codeclan.com.cardproject;

import android.content.Context;
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

public class RulesActivity extends AppCompatActivity {
    EditText player1name;
    EditText player2name;
    Button playbutton;
    TextView resultsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1name = (EditText)findViewById(R.id.player1_name);
        player2name = (EditText)findViewById(R.id.player2_name);
        playbutton = (Button)findViewById(R.id.play_button);
        resultsText = (TextView)findViewById(R.id.game_output);

        Log.d(getClass().toString(), "onCreate got called");
    }


    public void onPlayButtonClick(View view) {

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );

        String player1String = player1name.getText().toString();
        String player2String = player2name.getText().toString();
        Log.d("BlackjackGame:", "Play Button Clicked");
        Log.d("BlackjackGame:", "Players Names: '" + player1String + " " + player2String + "'");

        Player player1 = new Player(player1String, new Hand());
        Player player2 = new Player(player2String, new Hand());
        Player[] players = {player1, player2};
        Deck setOfCards = new Deck(new ArrayList<Card>());

        Rules rules = new Rules(players, setOfCards, new Scoreboard());

        String result = rules.play();
        resultsText.setText(result);

    }
}
