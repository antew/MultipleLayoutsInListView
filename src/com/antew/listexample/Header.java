package com.antew.listexample;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.antew.listexample.MyListAdapter.RowType;

public class Header implements Item {
    private final String         name;
    private final LayoutInflater inflater;

    public Header(LayoutInflater inflater, String name) {
        this.name = name;
        this.inflater = inflater;
    }

    @Override
    public int getViewType() {
        return RowType.HEADER_ITEM.ordinal();
    }

    @Override
    public View getView(View convertView) {
        if (convertView == null) {
            // No views to reuse, need to inflate a new view
            convertView = (View) inflater.inflate(R.layout.header, null);
        }

        TextView text = (TextView) convertView.findViewById(R.id.headerText);
        text.setText(name);

        return convertView;
    }

}
