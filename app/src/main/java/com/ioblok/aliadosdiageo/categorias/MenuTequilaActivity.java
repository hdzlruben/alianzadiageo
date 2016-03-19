package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class MenuTequilaActivity extends AppCompatActivity {

    Button backButton_categorias_int,btn_donjulio_anejado,btn_donjulio_blanco,btn_donjulio_reposado,btn_donjulio_70,btn_donjulio_1942,btn_donjulio_real;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tequila);

        intent = new Intent(MenuTequilaActivity.this, DynamicDrinks.class);

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

        btn_donjulio_blanco = (Button) findViewById(R.id.btn_donjulio_blanco);
        btn_donjulio_anejado = (Button) findViewById(R.id.btn_donjulio_anejado);
        btn_donjulio_reposado = (Button) findViewById(R.id.btn_donjulio_reposado);
        btn_donjulio_70 = (Button) findViewById(R.id.btn_donjulio_70);
        btn_donjulio_1942 = (Button) findViewById(R.id.btn_donjulio_1942);
        btn_donjulio_real = (Button) findViewById(R.id.btn_donjulio_real);

        btn_donjulio_blanco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_donjulio_anejado.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_donjulio_reposado.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_donjulio_70.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_donjulio_1942.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});

        btn_donjulio_real.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String idVideo = v.getTag().toString();
                launchDynamicDrinks(v, idVideo);}});


    }

    public void launchDynamicDrinks(View view, String idVideo){


        switch (view.getId()){
            case R.id.btn_donjulio_blanco:
                intent.putExtra("idYT", 19);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_donjulio_anejado:
                intent.putExtra("idYT", 20);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_donjulio_reposado:
                intent.putExtra("idYT", 21);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", true);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_donjulio_70:
                intent.putExtra("idYT", 22);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_donjulio_1942:
                intent.putExtra("idYT", 23);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            case R.id.btn_donjulio_real:
                intent.putExtra("idYT", 24);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;
            default:
                intent.putExtra("idYT", 19);
                intent.putExtra("isListEnable", true);
                intent.putExtra("hasSpot", false);
                intent.putExtra("idVideo", idVideo);
                startActivity(intent);
                break;

        }
    }

    /*View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_donjulio_blanco:
                    intent = new Intent(MenuTequilaActivity.this, DonJulioBlancoContainerActivity.class);
                    break;
                case R.id.btn_donjulio_anejado:
                    intent = new Intent(MenuTequilaActivity.this, DonJulioAnejoContainerActivity.class);
                    break;
                case R.id.btn_donjulio_reposado:
                    intent = new Intent(MenuTequilaActivity.this, DonJulioReposadoContainerActivity.class);
                    break;
                case R.id.btn_donjulio_70:
                    intent = new Intent(MenuTequilaActivity.this, DonJulio70ContainerActivity.class);
                    break;
                case R.id.btn_donjulio_1942:
                    intent = new Intent(MenuTequilaActivity.this, DonJulio1942ContainerActivity.class);
                    break;
                case R.id.btn_donjulio_real:
                    intent = new Intent(MenuTequilaActivity.this, DonJulioRealContainerActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };*/
}
