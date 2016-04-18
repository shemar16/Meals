package com.pa.meals;

import com.pa.meals.interactor.InteractorModule;
import com.pa.meals.interactor.StringInteractor;
import com.pa.meals.model.ModelModule;
import com.pa.meals.presenter.MainPresenter;
import com.pa.meals.view.ViewModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface MealsApplicationComponent {

    void inject(MainActivity mainActivity);

    void inject(MainPresenter mainPresenter);

    void inject(StringInteractor stringInteractor);
}
