package com.antew.listexample;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater i = LayoutInflater.from(this);
        
        List<Item> items = new ArrayList<Item>();
        items.add(new Header(i, "Friday - November 30th 2012"));
        items.add(new EventItem(i, "8:30am" , "Start work"));
        items.add(new EventItem(i, "9:15am" , "Call Bob"));
        items.add(new EventItem(i, "11:00am", "Meeting with Joe"));
        items.add(new EventItem(i, "5:00pm" , "Freedom!"));
        
        items.add(new Header(i, "Saturday - December 1st 2012"));
        items.add(new EventItem(i, "8:30am" , "Keep sleeping"));
        items.add(new EventItem(i, "10:00am", "Wake up"));
        items.add(new EventItem(i, "11:00am", "Walk the dog"));
        items.add(new EventItem(i, "6:00pm" , "Dinner at John's"));
        
        items.add(new Header(i, "Sunday - December 2rd 2012"));
        items.add(new EventItem(i, "8:30am" , "Keep sleeping"));
        items.add(new EventItem(i, "10:00am", "Wake up"));
        items.add(new EventItem(i, "11:00am", "Walk the dog"));
        items.add(new EventItem(i, "6:00pm" , "Dinner at John's"));

        items.add(new Header(i, "Monday - December 3rd 2012"));
        items.add(new EventItem(i, "8:30am" , "Start work"));
        items.add(new EventItem(i, "9:15am" , "Call Bob"));
        items.add(new EventItem(i, "11:00am", "Meeting with Joe"));
        items.add(new EventItem(i, "5:00pm" , "Freedom!"));
        
        MyListAdapter adapter = new MyListAdapter(this, items);
        setListAdapter(adapter);
    }

}
