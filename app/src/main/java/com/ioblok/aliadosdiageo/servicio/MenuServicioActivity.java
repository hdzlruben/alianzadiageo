package com.ioblok.aliadosdiageo.servicio;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;

import com.ioblok.aliadosdiageo.R;

public class MenuServicioActivity extends AppCompatActivity {

    Button backButton_servicio;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_servicio);

        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 50, getResources().getDisplayMetrics());

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(px, px);

        Button tabVideos    = (Button) LayoutInflater.from(this).inflate(R.layout.tab_videos, null);
        Button tabsr1       = (Button) LayoutInflater.from(this).inflate(R.layout.tab_sr1, null);
        Button tabsr2       = (Button) LayoutInflater.from(this).inflate(R.layout.tab_sr2, null);
        Button tabsr3       = (Button) LayoutInflater.from(this).inflate(R.layout.tab_sr3, null);
        Button tabsr4       = (Button) LayoutInflater.from(this).inflate(R.layout.tab_sr4, null);
        Button tabLogo      = (Button) LayoutInflater.from(this).inflate(R.layout.tab_logo_service, null);

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

        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        final FragmentAdapterServices adapterKpis = new FragmentAdapterServices
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapterKpis);
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

}
