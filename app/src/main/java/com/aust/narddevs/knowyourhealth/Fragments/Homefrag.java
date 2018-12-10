package com.aust.narddevs.knowyourhealth.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aust.narddevs.knowyourhealth.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Homefrag extends Fragment {


    public Homefrag() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homefrag, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
