package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
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


    View v;
    Intent intent;

    Button btn_buchanas_master, btn_black_and_white, buchanas_12, btn_cardhu, btn_old_parr,
            btn_old_parr_silver, btn_jb, btn_bulleit, btn_cr, btn_vat69;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_menu_whisky_sub_menu_dos, null);

        intent = new Intent(getActivity(), DynamicDrinks.class);

        btn_buchanas_master = (Button) v.findViewById(R.id.btn_buchanas_master);
        btn_black_and_white = (Button) v.findViewById(R.id.btn_black_and_white);
        buchanas_12         = (Button) v.findViewById(R.id.buchanas_12);
        btn_cardhu          = (Button) v.findViewById(R.id.btn_cardhu);
        btn_old_parr        = (Button) v.findViewById(R.id.btn_old_parr);
        btn_old_parr_silver = (Button) v.findViewById(R.id.btn_old_parr_silver);
        btn_jb              = (Button) v.findViewById(R.id.btn_jb);
        btn_bulleit         = (Button) v.findViewById(R.id.btn_bulleit);
        btn_cr              = (Button) v.findViewById(R.id.btn_cr);
        btn_vat69           = (Button) v.findViewById(R.id.btn_vat69);

        btn_buchanas_master.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_black_and_white.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        buchanas_12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_cardhu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_old_parr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_old_parr_silver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_jb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_bulleit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_cr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_vat69.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        return v;

    }

    public void launchDynamicDrinks(View view, String idVideo){

        // 6, 3, 2, 1, 10, 12, 14, 16, 17 19,

        switch (view.getId()){
            case R.id.btn_buchanas_master:
                intent.putExtra("idYT", 9);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_black_and_white:
                intent.putExtra("idYT", 10);
                intent.putExtra("isListEnable", false);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.buchanas_12:
                intent.putExtra("idYT", 11);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_cardhu:
                intent.putExtra("idYT", 12);
                intent.putExtra("isListEnable", false);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_old_parr:
                intent.putExtra("idYT", 13);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_old_parr_silver:
                intent.putExtra("idYT", 14);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_jb:
                intent.putExtra("idYT", 15);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_bulleit:
                intent.putExtra("idYT", 16);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_cr:
                intent.putExtra("idYT", 17);
                intent.putExtra("isListEnable", false);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_vat69:
                intent.putExtra("idYT", 18);
                intent.putExtra("isListEnable", false);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            default:
                intent.putExtra("idYT", 9);
                intent.putExtra("isListEnable", false);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;

        }
    }
}