package com.pa.meals.interactor;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorModule {
    @Provides
    public MealInteractor getMealsInteractor() {
        return new MealInteractor();
    }


}
