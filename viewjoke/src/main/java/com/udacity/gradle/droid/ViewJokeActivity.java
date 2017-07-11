package com.udacity.gradle.droid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ViewJokeActivity extends AppCompatActivity {
    public static String JOKE= "Joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_joke);
    }
}
