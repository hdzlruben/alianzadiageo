package com.ioblok.aliadosdiageo.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ioblok.aliadosdiageo.R;

/**
 * Created by io on 11/03/16.
 */
public class AdapterMenuIntActivity extends BaseAdapter {
    // Declare Variables
    Context context;
    String[] menuPrincipalint;
    Integer[] imageId;
    LayoutInflater inflater;


    public AdapterMenuIntActivity(Context context, String[] values) {
        this.context = context;
        this.menuPrincipalint = values;

    }

    @Override
    public int getCount() {
        return menuPrincipalint.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtTitle;
        ImageView imgImg;

        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.activity_list_menu_int, parent, false);
        // Locate the TextViews in listview_item.xml
        txtTitle = (TextView) itemView.findViewById(R.id.title);

        // Capture position and set to the TextViews
        txtTitle.setText(menuPrincipalint[position]);
        return itemView;
    }

}