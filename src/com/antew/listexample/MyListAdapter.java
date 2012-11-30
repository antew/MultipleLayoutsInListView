package com.antew.listexample;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class MyListAdapter extends ArrayAdapter<Item> {

    public enum RowType {
        // Here we have two items types, you can have as many as you like though
        LIST_ITEM, HEADER_ITEM
    }

    private List<Item> items;

    public MyListAdapter(Context context, List<Item> items) {
        super(context, 0, items);
        this.items = items;
    }

    @Override
    public int getViewTypeCount() {
        // Get the number of items in the enum
        return RowType.values().length;

    }

    @Override
    public int getItemViewType(int position) {
        // Use getViewType from the Item interface
        return items.get(position).getViewType();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Use getView from the Item interface
        return items.get(position).getView(convertView);
    }
}