package com.ioblok.aliadosdiageo.servicio;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by kreativeco on 12/03/16.
 */
public class FragmentAdapterServices extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public FragmentAdapterServices(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new VideoFragment();
            case 1:
                return new Service1Fragment();
            case 2:
                return new Service2Fragment();
            case 3:
                return new Service3Fragment();
            case 4:
                return new Service4Fragment();
            case 5:
                return new ServiceLogoFragment();

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
