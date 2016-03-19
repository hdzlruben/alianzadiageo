package com.ioblok.aliadosdiageo.categorias;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class MenuWhiskyActivity extends FragmentActivity {

    Button backButton_categorias_int;
    CoordinatorLayout rootLayout;
    ViewPager viewPager;

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

        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fm = getSupportFragmentManager();
        MenuFragmentPagerAdapter pagerAdapter = new MenuFragmentPagerAdapter(fm);

        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
        rootLayout = (CoordinatorLayout) findViewById(R.id.root_layout);

    }

    public void adelante(View v){
        viewPager.setCurrentItem(1);
    }
    public void atras(View v){
        viewPager.setCurrentItem(0);
    }



}
