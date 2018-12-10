package com.aust.narddevs.knowyourhealth.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aust.narddevs.knowyourhealth.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeverFrag extends Fragment {


    public FeverFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fever, container, false);
    }

}
