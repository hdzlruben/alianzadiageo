package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
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

public class MenuWhiskyActivity extends FragmentActivity {

    Button backButton_categorias_int;
    CoordinatorLayout rootLayout;
    ViewPager viewPager;

    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    public String[] values = {"DIAGEO", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    AdapterActivity adapterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_whisky);

        backButton_categorias_int = (Button)this.findViewById(R.id.backButton_categorias_int);
        backButton_categorias_int.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent = new Intent(MenuWhiskyActivity.this, MenuWhiskyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 1)
                {
                    Intent intent = new Intent(MenuWhiskyActivity.this, MenuFamilyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 2)
                {
                    Intent intent = new Intent(MenuWhiskyActivity.this, MenuCategoriasActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 3)
                {
                    Intent intent = new Intent(MenuWhiskyActivity.this, MenuProcesosActivity.class);
                    startActivity(intent);
                    finish();

                }
                else if (position == 4)
                {
                    Intent intent = new Intent(MenuWhiskyActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    Intent intent = new Intent(MenuWhiskyActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });


        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fm = getSupportFragmentManager();
        MenuFragmentPagerAdapter pagerAdapter = new MenuFragmentPagerAdapter(fm);

        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
        rootLayout = (CoordinatorLayout) findViewById(R.id.root_layout);

    }

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }


    public void adelante(View v){
        viewPager.setCurrentItem(1);
    }
    public void atras(View v){
        viewPager.setCurrentItem(0);
    }



}
