package com.ioblok.aliadosdiageo.plataformas.procesos;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.adapter.AdapterMenuIntActivity;

import java.util.ArrayList;

public class MenuPlataformasActivity extends AppCompatActivity {

    Button btn_back_homes,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    public String[] menuPrincipalint = {"SPOT", "VIDEO", "MENSAJES CLAVES" ,"TOUR DE BOTELLAS","COMO SERVIR"};
    AdapterMenuIntActivity adapterActivity;

    Button btn_back_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_plataformas);

        btn_back_home = (Button)this.findViewById(R.id.backButton_plataformas);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mDrawerOptions = (ListView) findViewById(R.id.left_drawer);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        adapterActivity = new AdapterMenuIntActivity(this,menuPrincipalint);
        mDrawerOptions.setAdapter(adapterActivity);
    }

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

}
