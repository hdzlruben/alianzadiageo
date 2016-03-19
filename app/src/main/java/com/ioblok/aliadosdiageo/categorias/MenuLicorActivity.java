package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class MenuLicorActivity extends AppCompatActivity {

    Button backButton_categorias_int, btn_baileys, btn_baileys_d;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_licor);

        intent = new Intent(MenuLicorActivity.this, DynamicDrinks.class);

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

        btn_baileys = (Button) findViewById(R.id.btn_baileys);
        btn_baileys_d = (Button) findViewById(R.id.btn_baileys_d);

        btn_baileys.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_baileys_d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

    }

    public void launchDynamicDrinks(View view, String idVideo){


        switch (view.getId()){
            case R.id.btn_baileys:
                intent.putExtra("idYT", 35);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_baileys_d:
                intent.putExtra("idYT", 36);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            default:
                intent.putExtra("idYT", 35);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;

        }
    }


}
