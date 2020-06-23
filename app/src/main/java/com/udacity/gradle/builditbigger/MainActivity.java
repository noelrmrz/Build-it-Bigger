package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.noelrmrz.jokeslibrary.JokesLibrary;


public class MainActivity extends AppCompatActivity {

    private JokesLibrary jokesLibrary = new JokesLibrary();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        new EndpointAsyncTask().execute(this);
/*        String joke = jokesLibrary.getJoke();
        CharSequence[] split = joke.split(" ");
        SpannableString spannableString = new SpannableString(split[0]);
        spannableString.setSpan(new RelativeSizeSpan(2f), 0, split[0].length(),
                SpannableString.SPAN_INCLUSIVE_EXCLUSIVE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(spannableString);

        for (int x = 1; x < split.length; x++) {
            spannableStringBuilder.append(" " + split[x]);
        }

        Intent intent = new Intent(this, DisplayJokesActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, spannableStringBuilder);
        startActivity(intent);*/
    }
}
