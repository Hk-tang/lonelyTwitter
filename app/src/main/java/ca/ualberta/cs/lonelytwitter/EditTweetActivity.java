package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private Bundle bundle;
    private TextView tweetDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

    }

    @Override
    protected void onStart() {
        super.onStart();
        String currentTweet;
        bundle = getIntent().getExtras();
        currentTweet = bundle.getString("curr_tweet");
        tweetDisplay = (TextView) findViewById(R.id.curr_tweet);
        tweetDisplay.setText(currentTweet);
    }

}
