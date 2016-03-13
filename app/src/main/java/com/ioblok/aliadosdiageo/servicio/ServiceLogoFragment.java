package com.ioblok.aliadosdiageo.servicio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ioblok.aliadosdiageo.R;

/**
 * Created by kreativeco on 12/03/16.
 */
public class ServiceLogoFragment extends Fragment {
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.service_logo_fragment, null);

        return v;

    }
}
