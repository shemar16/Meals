package com.pa.meals;

import android.app.Application;

import com.pa.meals.view.ViewModule;


public class MealsApplication extends Application {

    public static MealsApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerMealsApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
