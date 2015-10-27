package com.example.cynchen.scavengerhunt;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;


import java.util.ArrayList;


public class HomeScreenFragment extends Fragment {


    public Button start_button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //oncreateview: finds the correct clueslink video to show dependent on the clue counter from main activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //fragment_video is the layout
        final View rootView = inflater.inflate(R.layout.fragment_home_screen, container, false);

        start_button = (Button) rootView.findViewById(R.id.startbutton);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoFragment videofrag = new VideoFragment();
                ((MainActivity)getActivity()).transitionToFragment(videofrag);
            }
        });

        return rootView;
    }
}