package com.ioblok.aliadosdiageo.servicio;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.ioblok.aliadosdiageo.R;

import io.realm.Realm;

public class MenuServicioActivity extends AppCompatActivity {

    Button backButton_servicio;
    TabLayout tabLayout;
    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_servicio);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 40, getResources().getDisplayMetrics());

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(px, px);

        realm = Realm.getInstance(getBaseContext());
        realm.beginTransaction();

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
                viewPager.setCurrentItem(5);
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


        backButton_servicio = (Button)this.findViewById(R.id.backButton_servicio);

        backButton_servicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public Realm getRealm(){
        return realm;
    }

}
