package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.adapter.AdapterActivity;
import com.ioblok.aliadosdiageo.contentfamily.BuchanansActivity;
import com.ioblok.aliadosdiageo.contentfamily.DonJulioActivity;
import com.ioblok.aliadosdiageo.contentfamily.TanquerayActivity;
import com.ioblok.aliadosdiageo.contentfamily.WalkerActivity;
import com.ioblok.aliadosdiageo.contentfamily.ZacapaActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;

import java.util.ArrayList;

public class MenuCategoriasActivity extends AppCompatActivity {

    Button btn_back_home,btn_menu_whisky,btn_menu_tequila,btn_menu_ron,btn_menu_vodka,btn_menu_gin,btn_menu_licor;

    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    public String[] values = {"DIAGEO", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    AdapterActivity adapterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_categorias);

        btn_back_home = (Button)this.findViewById(R.id.backButton_categorias);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent = new Intent(MenuCategoriasActivity.this, MenuCategoriasActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 1)
                {
                    Intent intent = new Intent(MenuCategoriasActivity.this, MenuFamilyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 2)
                {
                    Intent intent = new Intent(MenuCategoriasActivity.this, MenuCategoriasActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 3)
                {
                    Intent intent = new Intent(MenuCategoriasActivity.this, MenuProcesosActivity.class);
                    startActivity(intent);
                    finish();

                }
                else if (position == 4)
                {
                    Intent intent = new Intent(MenuCategoriasActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    Intent intent = new Intent(MenuCategoriasActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

        initialize();

        btn_menu_whisky.setOnClickListener(menu);
        btn_menu_tequila.setOnClickListener(menu);
        btn_menu_ron.setOnClickListener(menu);
        btn_menu_vodka.setOnClickListener(menu);
        btn_menu_gin.setOnClickListener(menu);
        btn_menu_licor.setOnClickListener(menu);

    }

    public void initialize(){
        btn_menu_whisky = (Button) findViewById(R.id.btn_menu_whisky);
        btn_menu_tequila = (Button) findViewById(R.id.btn_menu_tequila);
        btn_menu_ron = (Button) findViewById(R.id.btn_menu_ron);
        btn_menu_vodka = (Button) findViewById(R.id.btn_menu_vodka);
        btn_menu_gin = (Button) findViewById(R.id.btn_menu_gin);
        btn_menu_licor = (Button) findViewById(R.id.btn_menu_licor);
    }

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_menu_whisky:
                    intent = new Intent(MenuCategoriasActivity.this, MenuWhiskyActivity.class);
                    break;
                case R.id.btn_menu_tequila:
                    intent = new Intent(MenuCategoriasActivity.this, MenuTequilaActivity.class);
                    break;
                case R.id.btn_menu_ron:
                    intent = new Intent(MenuCategoriasActivity.this, MenuRonActivity.class);
                    break;
                case R.id.btn_menu_vodka:
                    intent = new Intent(MenuCategoriasActivity.this, MenuVodkaActivity.class);
                    break;
                case R.id.btn_menu_gin:
                    intent = new Intent(MenuCategoriasActivity.this, MenuGinActivity.class);
                    break;
                case R.id.btn_menu_licor:
                    intent = new Intent(MenuCategoriasActivity.this, MenuLicorActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };
}
