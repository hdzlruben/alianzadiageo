package com.ioblok.aliadosdiageo.categorias;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.servicio.FragmentAdapterServices;

/**
 * Created by kreativeco on 12/03/16.
 */
public class DynamicMessages extends Fragment {


    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.activity_jw_blue_label_mensajes, null);

        // Inflate the layout for this fragment
        return v;
    }
}
