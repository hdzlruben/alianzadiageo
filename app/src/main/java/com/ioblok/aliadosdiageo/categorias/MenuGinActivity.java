package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class MenuGinActivity extends AppCompatActivity {

    Button backButton_categorias_int,btn_gin_tanqueray_l,btn_gin_tanqueray_t;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_gin);

        intent = new Intent(MenuGinActivity.this, DynamicDrinks.class);

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

        btn_gin_tanqueray_l = (Button) findViewById(R.id.btn_gin_tanqueray_l);
        btn_gin_tanqueray_t = (Button) findViewById(R.id.btn_gin_tanqueray_t);

        btn_gin_tanqueray_l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_gin_tanqueray_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

    }

    public void launchDynamicDrinks(View view, String idVideo){


        switch (view.getId()){
            case R.id.btn_gin_tanqueray_l:
                intent.putExtra("idYT", 33);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_gin_tanqueray_t:
                intent.putExtra("idYT", 34);
                intent.putExtra("isListEnable", false);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            default:
                intent.putExtra("idYT", 33);
                intent.putExtra("isListEnable", false);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;

        }
    }


}
