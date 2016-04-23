package com.pa.meals.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pa.meals.R;


public class MyMealsFragment extends Fragment {

    public static final String ARG_FRAGMENT_NUMBER = "fragment_number";

    public MyMealsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_my_meals, container, false);

        return rootView;


    }


}
