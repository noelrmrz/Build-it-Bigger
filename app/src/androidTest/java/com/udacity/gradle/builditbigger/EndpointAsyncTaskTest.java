package com.udacity.gradle.builditbigger;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAsyncTask() throws InterruptedException, ExecutionException {
        // on the MainActivity execute the AsyncTask
        EndpointAsyncTask asyncTaskTask = new EndpointAsyncTask();
        asyncTaskTask.execute(activityTestRule.getActivity());

        // the String returned in the onPostExecute is being retrieved
        String randomJoke = asyncTaskTask.get();

        // If the string is not null, then we got a value
        assertNotNull(randomJoke);
    }
}
