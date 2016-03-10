package com.ioblok.aliadosdiageo.plataformas.procesos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class MenuPlataformasActivity extends AppCompatActivity {

    Button btn_back_homes,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    Button btn_back_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_plataformas);
/*        initialize();

        btn_family_zacapa.setOnClickListener(menu);
        btn_family_walker.setOnClickListener(menu);
        btn_family_buchanans.setOnClickListener(menu);
        btn_family_tanqueray.setOnClickListener(menu);
        btn_family_don_julio.setOnClickListener(menu);*/

        btn_back_home = (Button)this.findViewById(R.id.backButton_plataformas);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

/*
    public void initialize(){
        btn_family_zacapa = (Button) findViewById(R.id.btn_family_zacapa);
        btn_family_walker = (Button) findViewById(R.id.btn_family_walker);
        btn_family_buchanans = (Button) findViewById(R.id.btn_family_buchanans);
        btn_family_tanqueray = (Button) findViewById(R.id.btn_family_tanqueray);
        btn_family_don_julio = (Button) findViewById(R.id.btn_family_don_julio);

    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {

                case R.id.btn_family_zacapa:
                    intent = new Intent(MenuProcesosActivity.this, ZacapaActivity.class);
                    break;
                case R.id.btn_family_walker:
                    intent = new Intent(MenuProcesosActivity.this, WalkerActivity.class);
                    break;
                case R.id.btn_family_buchanans:
                    intent = new Intent(MenuProcesosActivity.this, BuchanansActivity.class);
                    break;
                case R.id.btn_family_tanqueray:
                    intent = new Intent(MenuProcesosActivity.this, TanquerayActivity.class);
                    break;
                case R.id.btn_family_don_julio:
                    intent = new Intent(MenuProcesosActivity.this, DonJulioActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };*/

}
