package com.ioblok.aliadosdiageo.utilis;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.ioblok.aliadosdiageo.R;

/**
 * Created by kreativeco on 23/03/16.
 */
public class CustomTextView extends TextView{

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public CustomTextView(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/acaslonpro-regular-webfont.ttf");
        setTypeface(tf ,1);
    }
}
