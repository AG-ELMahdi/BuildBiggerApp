package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        Button button = (Button) root.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchJoke();
            }
        });

        return root;
    }
    public void fetchJoke(){
        new EndpointsAsyncTask(){
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                final Intent intent = new Intent(getContext(), ViewJokeActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT, s);
                getContext().startActivity(intent);
            }
        }.execute();
    }
}
