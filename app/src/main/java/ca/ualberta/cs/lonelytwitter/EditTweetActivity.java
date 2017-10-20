package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
    }


    TextView aTextView = (TextView) findViewById(R.id.aTextView);


    Intent intent = getIntent();
    Bundle b = intent.getExtras();

    String message = b.getString("tweet");
    aTextView.setText(message);

}
