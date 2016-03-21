package com.ioblok.aliadosdiageo.servicio;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Created by kreativeco on 21/03/16.
 */
public class MyCustomVideo extends VideoView {

    private PlayPauseListener mListener;

    public MyCustomVideo(Context context) {
        super(context);
    }

    public MyCustomVideo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCustomVideo(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setPlayPauseListener(PlayPauseListener listener) {
        mListener = listener;
    }

    @Override
    public void pause() {
        super.pause();
        if (mListener != null) {
            mListener.onPause();
        }
    }

    @Override
    public void start() {
        super.start();
        if (mListener != null) {
            mListener.onPlay();
        }
    }

    public static interface PlayPauseListener {
        void onPlay();
        void onPause();
    }
}

