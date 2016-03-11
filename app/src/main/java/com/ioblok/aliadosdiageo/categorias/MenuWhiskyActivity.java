package com.ioblok.aliadosdiageo.categorias;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.ioblok.aliadosdiageo.R;

public class MenuWhiskyActivity extends FragmentActivity {

    Button backButton_categorias_int,btn_arrow_front_front,btn_arrow_front_back,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
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
