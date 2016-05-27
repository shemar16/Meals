package com.pa.meals;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MealAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public MealAdapter(Context context, String[] values) {
        super(context, R.layout.list_meals, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_meals, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);

        // Change icon based on name
        String s = values[position];

        System.out.println(s);

        switch (s) {
            case "Breakfast":
                imageView.setImageResource(R.drawable.breakfast);
                break;
            case "Lunch":
                imageView.setImageResource(R.drawable.lunch);
                break;
            case "Dinner":
                imageView.setImageResource(R.drawable.dinner);
                break;
            case "Other":
                imageView.setImageResource(R.drawable.other);
                break;
        }
        return rowView;
    }
}
