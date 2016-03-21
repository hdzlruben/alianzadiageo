package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.adapter.AdapterActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;

import java.util.ArrayList;

public class MenuVodkaActivity extends AppCompatActivity {

    Button backButton_categorias_int, btn_vodka_ciroc, btn_vodka_ketel, btn_vodka_smirnoff;
    Intent intent;


    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    public String[] values = {"DIAGEO", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    AdapterActivity adapterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_vodka);
        intent = new Intent(MenuVodkaActivity.this, DynamicDrinks.class);

        /* Menu list */
        mDrawerOptions = (ListView) findViewById(R.id.left_drawer);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        adapterActivity = new AdapterActivity(this,values);
        mDrawerOptions.setAdapter(adapterActivity);
        /* Menu list */

        mDrawerOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                if (position == 0)
                {
                    Intent intent = new Intent(MenuVodkaActivity.this, MenuVodkaActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 1)
                {
                    Intent intent = new Intent(MenuVodkaActivity.this, MenuFamilyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 2)
                {
                    Intent intent = new Intent(MenuVodkaActivity.this, MenuCategoriasActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 3)
                {
                    Intent intent = new Intent(MenuVodkaActivity.this, MenuProcesosActivity.class);
                    startActivity(intent);
                    finish();

                }
                else if (position == 4)
                {
                    Intent intent = new Intent(MenuVodkaActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    Intent intent = new Intent(MenuVodkaActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

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
                launchDynamicDrinks(v, idVideo);
            }
        });


    }

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
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
