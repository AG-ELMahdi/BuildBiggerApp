package com.udacity.gradle.builditbigger;


import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ApplicationTest {


    @Test
    public void JokeTest() {

        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            String joke =task.execute().get();
            assertFalse(TextUtils.isEmpty(joke));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}