package com.udacity.gradle.builditbigger;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {
    @Test
    public void testDoInBackground() throws Exception {
        com.udacity.gradle.builditbigger.MainActivity mainActivity = new com.udacity.gradle.builditbigger.MainActivity();
        mainActivity.testFlag = true;
        new EndpointAsyncTask().execute(mainActivity);
        Thread.sleep(5000);
        assertNotNull("Error:  Fetched joke = " + mainActivity.getJoke(), mainActivity.getJoke());
    }
}
