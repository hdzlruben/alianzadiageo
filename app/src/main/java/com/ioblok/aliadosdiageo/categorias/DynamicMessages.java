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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.messages_fragment, container, false);

        // Inflate the layout for this fragment
        return root;
    }
}
