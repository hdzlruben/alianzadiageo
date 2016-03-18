package com.ioblok.aliadosdiageo.utilis;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import com.ioblok.aliadosdiageo.R;

import java.util.ArrayList;

/**
 * Created by kreativeco on 11/03/16.
 */
public class Constants {

    public static String baseURL;
    public static ArrayList<String> replaceURLVideos = new ArrayList<>();

    public static int [] mainDrawableImage = {R.drawable.back_bluelabel,
                                                R.drawable.back_jwbl,
                                                R.drawable.back_jwdblack,
                                                R.drawable.jw_plabel,
                                                R.drawable.back_redlabel,
                                                R.drawable.back_jwgold,
                                                R.drawable.back_buchanansredseal,
                                                R.drawable.back_jwblabel,
                                                R.drawable.backbuchanans_sreserve,
                                                R.drawable.back_buchananmaster,
                                                R.drawable.back_blackandwhite,
                                                R.drawable.back_buchanansdeluxe,
                                                R.drawable.botella_botonescardhu,
                                                R.drawable.back_grandoldpar,
                                                R.drawable.back_oldparsilver,
                                                R.drawable.back_jb,
                                                R.drawable.back_bulleitbourboun,
                                                R.drawable.boteelacrownroyal,
                                                R.drawable.botellavat69,
                                                R.drawable.backdonjulioblanco,
                                                R.drawable.backdonjulioanejo,
                                                R.drawable.backdonjulio,
                                                R.drawable.backdonjulio70,
                                                R.drawable.backdonjulio1942,
                                                R.drawable.back_donjulioreal,
                                                R.drawable.botella_ron_zacapax0,
                                                R.drawable.botella_ron_zacapa,
                                                R.drawable.botella_capitanmorgan,
                                                R.drawable.botella_captainmorganblack,
                                                R.drawable.back_captainmorganwhite,
                                                R.drawable.back_cirocvodka,
                                                R.drawable.back_ketelone,
                                                R.drawable.back_smirnoff,
                                                R.drawable.backtanqueray,
                                                R.drawable.back_tanqueraynoten,
                                                R.drawable.backbayleis,
                                                R.drawable.back_bayleisleche};


    public static String [] urlVideosYouTube = {"https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU",
                                                "https://www.youtube.com/watch?v=bFwzp3HSklU"};

    public static String getBaseURL() {
        return baseURL;
    }

    public static void setBaseURL(String baseURLFromRealm) {
        baseURL = baseURLFromRealm;
    }

    public static void addReplaceURLVideos(String replaceURLVideos) {
        Constants.replaceURLVideos.add(replaceURLVideos);
    }
    public static ArrayList<String>getReplaceURLVideos(){
        return replaceURLVideos;
    }

    public static String getUrlVideosYouTube(int position){
        return urlVideosYouTube[position];
    }

    public static int getMainDrawableImage(int positionDrawable) {
        return mainDrawableImage[positionDrawable];
    }
}
