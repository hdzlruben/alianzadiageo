package com.ioblok.aliadosdiageo.categorias;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
    Intent intent;

    Button btn_jw_bl, btn_jw_king, btn_jw_double, btn_jw_platinum, btn_jw_red,
            btn_jw_gold, btn_buchanas_red, btn_jw_black, btn_buchanas_18;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_menu_whisky_sub_menu_uno, null);

        intent = new Intent(getActivity(), DynamicDrinks.class);

        btn_jw_bl           = (Button) v.findViewById(R.id.btn_jw_bl);
        btn_jw_king         = (Button) v.findViewById(R.id.btn_jw_king);
        btn_jw_double       = (Button) v.findViewById(R.id.btn_jw_double);
        btn_jw_platinum     = (Button) v.findViewById(R.id.btn_jw_platinum);
        btn_jw_red          = (Button) v.findViewById(R.id.btn_jw_red);
        btn_jw_gold         = (Button) v.findViewById(R.id.btn_jw_gold);
        btn_buchanas_red    = (Button) v.findViewById(R.id.btn_buchanas_red);
        btn_jw_black        = (Button) v.findViewById(R.id.btn_jw_black);
        btn_buchanas_18     = (Button) v.findViewById(R.id.btn_buchanas_18);

        btn_jw_bl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
                final String idVideo = v.getTag().toString(); 
                launchDynamicDrinks(v, idVideo);}});

        btn_jw_king.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
                final String idVideo = v.getTag().toString(); 
                launchDynamicDrinks(v, idVideo);}});

        btn_jw_double.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
                final String idVideo = v.getTag().toString(); 
                launchDynamicDrinks(v, idVideo);}});

        btn_jw_platinum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
                final String idVideo = v.getTag().toString(); 
                launchDynamicDrinks(v, idVideo);}});

        btn_jw_red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
                final String idVideo = v.getTag().toString(); 
                launchDynamicDrinks(v, idVideo);}});

        btn_jw_gold.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
                final String idVideo = v.getTag().toString(); 
                launchDynamicDrinks(v, idVideo);}});

        btn_buchanas_red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
                final String idVideo = v.getTag().toString(); 
                launchDynamicDrinks(v, idVideo);}});

        btn_jw_black.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
                final String idVideo = v.getTag().toString(); 
                launchDynamicDrinks(v, idVideo);}});

        btn_buchanas_18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
                final String idVideo = v.getTag().toString(); 
                launchDynamicDrinks(v, idVideo);}});

        return v;
    }

    public void launchDynamicDrinks(View view, String idVideo){

        switch (view.getId()){
            case R.id.btn_jw_bl:
                intent.putExtra("idYT", 0);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_jw_king:
                intent.putExtra("idYT", 1);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_jw_double:
                intent.putExtra("idYT", 2);
                intent.putExtra("hasSpot", false);
                intent.putExtra("isListEnable", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_jw_platinum:
                intent.putExtra("idYT", 3);
                intent.putExtra("hasSpot", false);
                intent.putExtra("isListEnable", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_jw_red:
                intent.putExtra("idYT", 4);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_jw_gold:
                intent.putExtra("idYT", 5);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_buchanas_red:
                intent.putExtra("idYT", 6);
                intent.putExtra("hasSpot", false);
                intent.putExtra("isListEnable", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_jw_black:
                intent.putExtra("idYT", 7);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_buchanas_18:
                intent.putExtra("idYT", 8);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            default:
                intent.putExtra("idYT", 0);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;

        }
    }

    public void launchDynamicTour(View view, String idVideo){

    }
}
