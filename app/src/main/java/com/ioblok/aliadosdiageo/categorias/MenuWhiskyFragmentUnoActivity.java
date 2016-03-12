package com.ioblok.aliadosdiageo.categorias;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toolbar;
import android.widget.ViewFlipper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlueLabelContainerActivity;

public class MenuWhiskyFragmentUnoActivity extends Fragment {

    View v;
    Intent intent;

    Button backButton_categorias_int,btn_jw_bl,btn_arrow_front_back,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_menu_whisky_sub_menu_uno, null);

        intent = new Intent(getActivity(), JwBlueLabelContainerActivity.class);
        btn_jw_bl = (Button) v.findViewById(R.id.btn_jw_bl);

        btn_jw_bl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        return v;
    }

}
