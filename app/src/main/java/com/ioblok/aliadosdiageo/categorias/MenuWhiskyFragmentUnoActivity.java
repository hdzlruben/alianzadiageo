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
import com.ioblok.aliadosdiageo.categorias.content_whisky.Buchanans18.Buchanans18ContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_whisky.BuchanansRedSeal.BuchanansRedSealContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlackLabel.JwBlackLabelContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlueLabelContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwDoubleBlackLabel.JwDoubleBlackLabelContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwGoldLabelReserve.JwGoldLabelReserveContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwKingGeorgeActivity.JwKingGeorgeContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwPlatinumLabel.JwPlatinumLabelContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwRedLabel.JwRedLabelContainerActivity;
import com.ioblok.aliadosdiageo.diageo.DiageoActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;

public class MenuWhiskyFragmentUnoActivity extends Fragment {

    View v;
    Button btn_jw_bl,btn_jw_kg,btn_jw_dbl,btn_jw_pl,btn_jw_rd,btn_jw_glr,btn_bc_rl,btn_jw_bl_l,btn_bc_18;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_menu_whisky_sub_menu_uno, null);
        initilize();

        btn_jw_bl.setOnClickListener(menu);
        btn_jw_kg.setOnClickListener(menu);
        btn_jw_dbl.setOnClickListener(menu);
        btn_jw_pl.setOnClickListener(menu);
        btn_jw_rd.setOnClickListener(menu);
        btn_jw_glr.setOnClickListener(menu);
        btn_bc_rl.setOnClickListener(menu);
        btn_jw_bl_l.setOnClickListener(menu);
        btn_bc_18.setOnClickListener(menu);

        return v;
    }

    public void initilize(){
        btn_jw_bl = (Button) v.findViewById(R.id.btn_jw_bl);
        btn_jw_kg = (Button) v.findViewById(R.id.btn_jw_kg);
        btn_jw_dbl = (Button) v.findViewById(R.id.btn_jw_dbl);
        btn_jw_pl = (Button) v.findViewById(R.id.btn_jw_pl);
        btn_jw_rd = (Button) v.findViewById(R.id.btn_jw_rd);
        btn_jw_glr = (Button) v.findViewById(R.id.btn_jw_glr);
        btn_bc_rl = (Button) v.findViewById(R.id.btn_bc_rl);
        btn_jw_bl_l = (Button) v.findViewById(R.id.btn_jw_bl_l);
        btn_bc_18 = (Button) v.findViewById(R.id.btn_bc_18);
    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_jw_bl:
                    intent = new Intent(getActivity(), JwBlueLabelContainerActivity.class);
                    break;

                case R.id.btn_jw_kg:
                    intent =  new Intent(getActivity(), JwKingGeorgeContainerActivity.class);
                    break;

                case R.id.btn_jw_dbl:
                    intent =  new Intent(getActivity(), JwDoubleBlackLabelContainerActivity.class);
                    break;

                case R.id.btn_jw_pl:
                    intent =  new Intent(getActivity(), JwPlatinumLabelContainerActivity.class);
                    break;

                case R.id.btn_jw_rd:
                    intent =  new Intent(getActivity(), JwRedLabelContainerActivity.class);
                    break;

                case R.id.btn_jw_glr:
                    intent =  new Intent(getActivity(), JwGoldLabelReserveContainerActivity.class);
                    break;

                case R.id.btn_bc_rl:
                    intent =  new Intent(getActivity(), BuchanansRedSealContainerActivity.class);
                    break;

                case R.id.btn_jw_bl_l:
                    intent =  new Intent(getActivity(), JwBlackLabelContainerActivity.class);
                    break;

                case R.id.btn_bc_18:
                    intent =  new Intent(getActivity(), Buchanans18ContainerActivity.class);
                    break;
            }
            startActivity(intent);

        }
    };
}
