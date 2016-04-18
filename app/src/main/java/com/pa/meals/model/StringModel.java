package com.pa.meals.model;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class StringModel {

    private int idx = 0;

    public String getNextString() {
        String[] list = {
                "ecc", "pecc", "kimehetsz",
                "holnapután", "bejöhetsz",
                "cérnára", "cinegére",
                "ugorj", "cica", "az", "egérre", "fuss!"
        };

        if (idx == list.length) {
            idx = 0;
        }
        return list[idx++];
    }
}
