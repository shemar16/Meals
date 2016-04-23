package com.pa.meals.ui;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pa.meals.R;


public class AddMealFragment extends Fragment {

    public static final String ARG_FRAGMENT_NUMBER = "fragment_number";

    public AddMealFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_add_meal, container, false);

        return rootView;
    }

}
