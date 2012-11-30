package com.antew.listexample;

import android.view.View;

public interface Item {
    public int getViewType();
    public View getView(View convertView);
}
