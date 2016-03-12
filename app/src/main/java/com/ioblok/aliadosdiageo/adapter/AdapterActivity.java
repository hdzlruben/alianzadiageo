package com.ioblok.aliadosdiageo.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ioblok.aliadosdiageo.R;

/**
 * Created by kreativeco on 11/03/16.
 */
public class AdapterActivity extends BaseAdapter {
    // Declare Variables
    Context context;
    String[] titulos;
    Integer[] imageId;
    LayoutInflater inflater;


    public AdapterActivity(Context context, String[] values) {
        this.context = context;
        this.titulos = values;

    }

    @Override
    public int getCount() {
        return titulos.length;
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

        Typeface myFont = Typeface.createFromAsset(context.getAssets(), "CenturyGothic.ttf");

        // Declare Variables
        TextView txtTitle;
        ImageView imgImg;



        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.activity_list_view_custom, parent, false);


        if(titulos[position] == "DIAGEO"){
            itemView.setBackgroundResource(R.color.menu_one_part);
        }
        if(titulos[position] == "Familias"){
            itemView.setBackgroundResource(R.color.menu_two_part);
        }
        if(titulos[position] == "Categorias"){
            itemView.setBackgroundResource(R.color.menu_three_part);
        }
        if(titulos[position] == "Proceso de Elaboracion"){
            itemView.setBackgroundResource(R.color.menu_four_part);
        }
        if(titulos[position] == "Plataformas"){
            itemView.setBackgroundResource(R.color.menu_five_part);
        }
        if(titulos[position] == "Servicio Responsable"){
            itemView.setBackgroundResource(R.color.menu_six_part);
        }


        String Diageo = "Diageo";
        // Locate the TextViews in listview_item.xml
        txtTitle = (TextView) itemView.findViewById(R.id.title);

        // Capture position and set to the TextViews
        txtTitle.setText(titulos[position]);
        txtTitle.setTypeface(myFont);

        return itemView;
    }

}