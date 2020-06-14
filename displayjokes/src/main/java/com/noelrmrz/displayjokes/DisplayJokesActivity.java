package com.noelrmrz.displayjokes;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayJokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.AppName);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView tvJoke = (TextView) findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if (intent.hasExtra(Intent.EXTRA_TEXT)){
            CharSequence jokeToDisplay = intent.getCharSequenceExtra(Intent.EXTRA_TEXT);
            tvJoke.setText(jokeToDisplay);
        }
        else {
            tvJoke.setText("Error");
        }
    }

    /**
     * When the arrow is pressed on the action bar, close the activity
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
