package com.pa.meals.interactor;

import com.pa.meals.MealsApplication;
import com.pa.meals.model.StringModel;

import javax.inject.Inject;


public class StringInteractor {
    @Inject
    StringModel model;

    public StringInteractor() {
        MealsApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextString();
    }
}