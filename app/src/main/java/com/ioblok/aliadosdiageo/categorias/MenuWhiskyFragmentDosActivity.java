package com.ioblok.aliadosdiageo.categorias;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.ioblok.aliadosdiageo.R;

public class MenuWhiskyFragmentDosActivity extends Fragment {


    Button backButton_categorias_int,btn_jw_bl,btn_arrow_front_back,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_menu_whisky_sub_menu_dos, null);

        return v;

    }
}