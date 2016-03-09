package com.ioblok.aliadosdiageo.procesos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.contentfamily.BuchanansActivity;
import com.ioblok.aliadosdiageo.contentfamily.DonJulioActivity;
import com.ioblok.aliadosdiageo.contentfamily.TanquerayActivity;
import com.ioblok.aliadosdiageo.contentfamily.WalkerActivity;
import com.ioblok.aliadosdiageo.contentfamily.ZacapaActivity;

public class MenuProcesosActivity extends AppCompatActivity {

    Button btn_back_home,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_procesos);
        initialize();

        btn_family_zacapa.setOnClickListener(menu);
        btn_family_walker.setOnClickListener(menu);
        btn_family_buchanans.setOnClickListener(menu);
        btn_family_tanqueray.setOnClickListener(menu);
        btn_family_don_julio.setOnClickListener(menu);
    }


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
    };

}
