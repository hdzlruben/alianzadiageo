package com.ioblok.aliadosdiageo.categorias;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kreativeco on 10/03/16.
 */
public class MenuFragmentPagerAdapter extends FragmentPagerAdapter {

    int mNumOfTabs = 2;

    public MenuFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new MenuWhiskyFragmentUnoActivity();
            case 1:
                return new MenuWhiskyFragmentDosActivity();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
