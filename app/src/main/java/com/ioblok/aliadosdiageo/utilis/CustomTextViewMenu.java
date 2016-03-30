package com.ioblok.aliadosdiageo.utilis;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by kreativeco on 23/03/16.
 */
public class CustomTextViewMenu extends TextView{

    public CustomTextViewMenu(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomTextViewMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public CustomTextViewMenu(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "CenturyGothic.ttf");
        setTypeface(tf, 1);
        setTextSize(10);
    }

}
