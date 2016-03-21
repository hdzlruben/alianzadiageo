package com.ioblok.aliadosdiageo.family;

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
import com.ioblok.aliadosdiageo.categorias.MenuCategoriasActivity;
import com.ioblok.aliadosdiageo.contentfamily.BuchanansActivity;
import com.ioblok.aliadosdiageo.contentfamily.DonJulioActivity;
import com.ioblok.aliadosdiageo.contentfamily.TanquerayActivity;
import com.ioblok.aliadosdiageo.contentfamily.WalkerActivity;
import com.ioblok.aliadosdiageo.contentfamily.ZacapaActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;

import java.util.ArrayList;

public class MenuFamilyActivity extends AppCompatActivity {

    Button backButton,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    public String[] values = {"DIAGEO", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    AdapterActivity adapterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_family);
        initialize();

        btn_family_zacapa.setOnClickListener(menu);
        btn_family_walker.setOnClickListener(menu);
        btn_family_buchanans.setOnClickListener(menu);
        btn_family_tanqueray.setOnClickListener(menu);
        btn_family_don_julio.setOnClickListener(menu);
        backButton = (Button)this.findViewById(R.id.backButton_diageo);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

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
                    Intent intent = new Intent(MenuFamilyActivity.this, MenuFamilyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 1)
                {
                    Intent intent = new Intent(MenuFamilyActivity.this, MenuFamilyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 2)
                {
                    Intent intent = new Intent(MenuFamilyActivity.this, MenuCategoriasActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 3)
                {
                    Intent intent = new Intent(MenuFamilyActivity.this, MenuProcesosActivity.class);
                    startActivity(intent);
                    finish();

                }
                else if (position == 4)
                {
                    Intent intent = new Intent(MenuFamilyActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    Intent intent = new Intent(MenuFamilyActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
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
                    intent = new Intent(MenuFamilyActivity.this, ZacapaActivity.class);
                    break;
                case R.id.btn_family_walker:
                    intent = new Intent(MenuFamilyActivity.this, WalkerActivity.class);
                    break;
                case R.id.btn_family_buchanans:
                    intent = new Intent(MenuFamilyActivity.this, BuchanansActivity.class);
                    break;
                case R.id.btn_family_tanqueray:
                    intent = new Intent(MenuFamilyActivity.this, TanquerayActivity.class);
                    break;
                case R.id.btn_family_don_julio:
                    intent = new Intent(MenuFamilyActivity.this, DonJulioActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

}
