package com.antew.listexample;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.antew.listexample.MyListAdapter.RowType;

public class EventItem implements Item {
    private final String         str1;
    private final String         str2;
    private final LayoutInflater inflater;

    public EventItem(LayoutInflater inflater, String text1, String text2) {
        this.str1 = text1;
        this.str2 = text2;
        this.inflater = inflater;
    }

    @Override
    public int getViewType() {
        return RowType.LIST_ITEM.ordinal();
    }

    @Override
    public View getView(View convertView) {
        if (convertView == null) {
            convertView = (View) inflater.inflate(R.layout.list_item, null);
        }

        TextView text1 = (TextView) convertView.findViewById(R.id.list_content1);
        TextView text2 = (TextView) convertView.findViewById(R.id.list_content2);
        text1.setText(str1);
        text2.setText(str2);

        return convertView;
    }

}
