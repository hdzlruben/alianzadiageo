package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class MenuRonActivity extends AppCompatActivity {

    Button backButton_categorias_int, zacapa_xo, zacapa_23, btn_captain_morgan, btn_captain_morgan_black, btn_captain_morgan_white;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ron);

        intent = new Intent(MenuRonActivity.this, DynamicDrinks.class);

        backButton_categorias_int = (Button)this.findViewById(R.id.backButton_categorias_int);
        backButton_categorias_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        initialize();

    }

    public void initialize(){

        zacapa_xo = (Button) findViewById(R.id.zacapa_xo);
        zacapa_23 = (Button) findViewById(R.id.zacapa_23);
        btn_captain_morgan = (Button) findViewById(R.id.btn_captain_morgan);
        btn_captain_morgan_black = (Button) findViewById(R.id.btn_captain_morgan_black);
        btn_captain_morgan_white = (Button) findViewById(R.id.btn_captain_morgan_white);

        zacapa_xo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        zacapa_23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_captain_morgan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_captain_morgan_black.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_captain_morgan_white.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});


    }

    public void launchDynamicDrinks(View view, String idVideo){


        switch (view.getId()){
            case R.id.zacapa_xo:
                intent.putExtra("idYT", 25);
                intent.putExtra("isListEnable", false);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.zacapa_23:
                intent.putExtra("idYT", 26);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_captain_morgan:
                intent.putExtra("idYT", 27);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_captain_morgan_black:
                intent.putExtra("idYT", 28);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_captain_morgan_white:
                intent.putExtra("idYT", 29);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            default:
                intent.putExtra("idYT", 25);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;

        }
    }

}
