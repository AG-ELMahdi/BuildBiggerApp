package com.udacity.gradle.droid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ahmed El-Mahdi on 7/10/2017.
 */

public class ViewJokeFragment extends Fragment {
    public ViewJokeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View root =inflater.inflate(R.layout.fragment_view_joke, container, false);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(Intent.EXTRA_TEXT);
            final TextView jokeView = (TextView) root.findViewById(R.id.TextView);
            jokeView.setText(joke);


        return root;
    }



}
