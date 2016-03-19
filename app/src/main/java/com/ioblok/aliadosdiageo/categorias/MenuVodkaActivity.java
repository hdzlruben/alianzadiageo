package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class MenuVodkaActivity extends AppCompatActivity {

    Button backButton_categorias_int, btn_vodka_ciroc, btn_vodka_ketel, btn_vodka_smirnoff;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_vodka);

        intent = new Intent(MenuVodkaActivity.this, DynamicDrinks.class);

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

        btn_vodka_ciroc = (Button) findViewById(R.id.btn_vodka_ciroc);
        btn_vodka_ketel = (Button) findViewById(R.id.btn_vodka_ketel);
        btn_vodka_smirnoff = (Button) findViewById(R.id.btn_vodka_smirnoff);

        btn_vodka_ciroc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_vodka_ketel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_vodka_smirnoff.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});


    }

    public void launchDynamicDrinks(View view, String idVideo){


        switch (view.getId()){
            case R.id.btn_vodka_ciroc:
                intent.putExtra("idYT", 30);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_vodka_ketel:
                intent.putExtra("idYT", 31);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_vodka_smirnoff:
                intent.putExtra("idYT", 32);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            default:
                intent.putExtra("idYT", 30);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;

        }
    }


}
