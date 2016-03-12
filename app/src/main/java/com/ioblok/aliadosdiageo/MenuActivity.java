package com.ioblok.aliadosdiageo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.ioblok.aliadosdiageo.categorias.MenuCategoriasActivity;
import com.ioblok.aliadosdiageo.diageo.DiageoActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;
import com.ioblok.aliadosdiageo.utilis.Constants;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;

import java.net.URL;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class MenuActivity extends AppCompatActivity {

    Button btn_diageo,btn_family,btn_categorias,btn_proceso,btn_plataformas,btn_servicio;

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initialize();

        btn_diageo.setOnClickListener(menu);
        btn_family.setOnClickListener(menu);
        btn_categorias.setOnClickListener(menu);
        btn_proceso.setOnClickListener(menu);
        btn_plataformas.setOnClickListener(menu);
        btn_servicio.setOnClickListener(menu);


    }


    public void initialize(){

        realm = Realm.getInstance(getBaseContext());
        realm.beginTransaction();

        RealmResults<URLVideosDataBase> results = realm.where(URLVideosDataBase.class).findAll();

        for (int i = 0; i < results.size(); i++) {

            URLVideosDataBase u = results.get(i);
            String strVideo = u.getUrlFileStorage();
            u.setUrlFileStorage(Constants.getBaseURL() + strVideo);
            Log.e("URL", u.getUrlVideo());
            Log.e("boolena", u.isDownloaded() + "");
            Log.e("STORAGE", u.getUrlFileStorage());
            // ... do something with the object ...
        }
        realm.commitTransaction();

        btn_diageo = (Button) findViewById(R.id.btn_diageo);
        btn_family = (Button) findViewById(R.id.btn_family);
        btn_categorias = (Button) findViewById(R.id.btn_categorias);
        btn_proceso = (Button) findViewById(R.id.btn_proceso);
        btn_plataformas = (Button) findViewById(R.id.btn_plataformas);
        btn_servicio = (Button) findViewById(R.id.btn_servicio);

    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_diageo:
                    intent = new Intent(MenuActivity.this, DiageoActivity.class);
                    break;

                case R.id.btn_family:
                    intent = new Intent(MenuActivity.this, MenuFamilyActivity.class);
                    break;

                case R.id.btn_categorias:
                    intent = new Intent(MenuActivity.this, MenuCategoriasActivity.class);
                    break;

                case R.id.btn_proceso:
                    intent = new Intent(MenuActivity.this, MenuProcesosActivity.class);
                    break;

                case R.id.btn_plataformas:
                    intent = new Intent(MenuActivity.this, MenuPlataformasActivity.class);
                    break;

                case R.id.btn_servicio:
                    intent = new Intent(MenuActivity.this, MenuServicioActivity.class);
                    break;
            }

            startActivity(intent);

        }
    };

}
