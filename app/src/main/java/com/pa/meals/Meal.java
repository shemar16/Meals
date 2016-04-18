package com.pa.meals;

import com.orm.SugarRecord;

public class Meal extends SugarRecord {
    String name;

    public Meal(){

    }

    public Meal(String name){
        this.name= name;
    }


}
