package com.ioblok.aliadosdiageo.servicio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.adapter.AdapterActivity;
import com.ioblok.aliadosdiageo.categorias.MenuCategoriasActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;

import java.util.ArrayList;

import io.realm.Realm;

public class MenuServicioActivity extends AppCompatActivity {
    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    public String[] values = {"DIAGEO", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    AdapterActivity adapterActivity;
    ViewPager viewPager;
    Button backButton;
    TabLayout tabLayout;
    Realm realm;
    LinearLayout llHeader;
    RelativeLayout rlHeaderBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio);

        backButton = (Button)this.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        llHeader = (LinearLayout) findViewById(R.id.header);
        rlHeaderBack = (RelativeLayout) findViewById(R.id.header_back);

        /*List video menu*/


        mDrawerOptions = (ListView) findViewById(R.id.left_drawer);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        adapterActivity = new AdapterActivity(this,values);
        mDrawerOptions.setAdapter(adapterActivity);

        /*List video menu*/


        mDrawerOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                if (position == 0)
                {
                    Intent intent = new Intent(MenuServicioActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 1)
                {
                    Intent intent = new Intent(MenuServicioActivity.this, MenuFamilyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 2)
                {
                    Intent intent = new Intent(MenuServicioActivity.this, MenuCategoriasActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 3)
                {
                    Intent intent = new Intent(MenuServicioActivity.this, MenuProcesosActivity.class);
                    startActivity(intent);
                    finish();

                }
                else if (position == 4)
                {
                    Intent intent = new Intent(MenuServicioActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    Intent intent = new Intent(MenuServicioActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });


        viewPager = (ViewPager) findViewById(R.id.view_pager);

        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 40, getResources().getDisplayMetrics());

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(px, px);

        realm = Realm.getInstance(getBaseContext());
        //realm.beginTransaction();

        ImageButton tabVideos    = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_videos, null);
        ImageButton tabsr1       = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_sr1, null);
        ImageButton tabsr2       = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_sr2, null);
        ImageButton tabsr3       = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_sr3, null);
        ImageButton tabsr4       = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_sr4, null);
        ImageButton tabLogo      = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_logo_service, null);

        tabVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        tabsr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        tabsr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

        tabsr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        tabsr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(4);
            }
        });

        tabLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.actuandomejor.com.mx/saberservir/app/index.php"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tabVideos.setLayoutParams(params);
        tabsr1.setLayoutParams(params);
        tabsr2.setLayoutParams(params);
        tabsr3.setLayoutParams(params);
        tabsr4.setLayoutParams(params);
        tabLogo.setLayoutParams(params);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabVideos));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabsr1));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabsr2));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabsr3));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabsr4));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabLogo));

        final FragmentAdapterServices adapterServices = new FragmentAdapterServices
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapterServices);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    public Realm getRealm(){
        return realm;
    }

    public TabLayout getTabLayout(){
        return tabLayout;
    }

    public RelativeLayout getRlHeaderBack(){
        return  rlHeaderBack;
    }

    public LinearLayout getLlHeader(){
        return llHeader;
    }

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }


}
