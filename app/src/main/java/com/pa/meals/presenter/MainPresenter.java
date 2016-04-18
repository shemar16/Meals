package com.pa.meals.presenter;


import com.pa.meals.MealsApplication;
import com.pa.meals.interactor.StringInteractor;
import com.pa.meals.view.MainView;

import javax.inject.Inject;

public class MainPresenter extends Presenter<MainView> {

    @Inject
    public StringInteractor interactor;

    public MainPresenter() {
        MealsApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getString());
    }
}
