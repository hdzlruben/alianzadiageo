package com.ioblok.aliadosdiageo.categorias;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.utilis.Constants;

/**
 * Created by kreativeco on 13/03/16.
 */
public class DynamicScrollViewDrinks extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.dynamic_scrollview_drinks, container, false);

        LinearLayout llMainImage = (LinearLayout) root.findViewById(R.id.ll_main_image);
        int positionExtras = ((DynamicDrinks)this.getActivity()).getPositionExtras();
        llMainImage.setBackgroundResource(Constants.getMainDrawableImage(positionExtras));
        return root;
    }
}
