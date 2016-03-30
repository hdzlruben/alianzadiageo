package com.ioblok.aliadosdiageo.utilis;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.models.ListModelMenu;

import java.util.ArrayList;

/**
 * Created by kreativeco on 11/03/16.
 */
public class Constants {

    public static String baseURL;
    public static ArrayList<String> replaceURLVideos = new ArrayList<>();
    public static ArrayList<ListModelMenu> customListView = new ArrayList<ListModelMenu>(){{
        add(new ListModelMenu("DIAGEO", R.color.menu_one_part));
        add(new ListModelMenu("Familias", R.color.menu_two_part));
        add(new ListModelMenu("Categorias", R.color.menu_three_part));
        add(new ListModelMenu("Proceso de Elaboracion", R.color.menu_four_part));
        add(new ListModelMenu("Plataformas", R.color.menu_five_part));
        add(new ListModelMenu("Servicio Responsable", R.color.menu_six_part));

    }};

    ArrayList<String> list = new ArrayList<String>() {{
        add("A");
        add("B");
        add("C");
    }};

    public static int[] mainDrawableImage =
            {
                    R.drawable.back_bluelabel,
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
                    R.drawable.back_bayleisleche
            };

    public static final int[] headerImage =
            {
                    R.drawable.headjwblabel,
                    R.drawable.headjwkinggeorge,
                    R.drawable.headjwdblabel,
                    R.drawable.headjwplatinum,
                    R.drawable.headjwrlabe,
                    R.drawable.head_jwgoldlabel,
                    R.drawable.headbuchananrseal,
                    R.drawable.headblabel,
                    R.drawable.headb18,
                    R.drawable.headbmaster,
                    R.drawable.headbwhite,
                    R.drawable.headb12,
                    R.drawable.headcardhu,
                    R.drawable.headoldparr,
                    R.drawable.headoldparrsilver,
                    R.drawable.headjb,
                    R.drawable.headbulleit,
                    R.drawable.headcrownroyal,
                    R.drawable.headvat69,
                    R.drawable.headdjblanco,
                    R.drawable.headdjanejo,
                    R.drawable.headdjreposado,
                    R.drawable.headdj70,
                    R.drawable.headdj1942,
                    R.drawable.headdjulioreal,
                    R.drawable.headzacapaxo,
                    R.drawable.headzacapa23,
                    R.drawable.headcaptainmorgan,
                    R.drawable.headcaptainmorganblack,
                    R.drawable.headcapmorganwhite,
                    R.drawable.headciroc,
                    R.drawable.headketelone,
                    R.drawable.headsmirnoff,
                    R.drawable.headtanqueraylondon,
                    R.drawable.headtanquerayten,
                    R.drawable.headbayleis,
                    R.drawable.headbayleileche
            };


    public static String[] urlVideosYouTube = {"https://www.youtube.com/watch?v=bFwzp3HSklU",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=2IrTYf-jCdk",
            "https://www.youtube.com/watch?v=4xdehaV_FDM",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=wq3EWEETd1k",
            "https://www.youtube.com/watch?v=-wcTWPTyohw&list=PLKOSogZyhlSCmNN--D6_S6G-UhnFBQ9VU&index=5",
            "https://www.youtube.com/watch?v=CX1c63Da4IE",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=eS4wQ_ZTAH4&list=PLKOSogZyhlSCmNN--D6_S6G-UhnFBQ9VU&index=2",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=fc6Hmle3Cmc",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=A9pXDv79h0Q",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=iBwmkZZ7ipU",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=eESumSCUo7w",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=h9LK9n_i8qA",
            "https://www.youtube.com/",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=6kQ8eaw5qd0",
            "https://www.youtube.com/watch?v=qHXfFGayk9w",
            "https://www.youtube.com/",
            "https://www.youtube.com/watch?v=IYc6H1JKyRs",
            "https://www.youtube.com/watch?v=5RirKd1fePQ"};

    public static String getBaseURL() {
        return baseURL;
    }

    public static void setBaseURL(String baseURLFromRealm) {
        baseURL = baseURLFromRealm;
    }

    public static void addReplaceURLVideos(String replaceURLVideos) {
        Constants.replaceURLVideos.add(replaceURLVideos);
    }

    public static ArrayList<String> getReplaceURLVideos() {
        return replaceURLVideos;
    }

    public static String getUrlVideosYouTube(int position) {
        return urlVideosYouTube[position];
    }

    public static int getMainDrawableImage(int positionDrawable) {
        return mainDrawableImage[positionDrawable];
    }

    public static int getHeaderDrawableImage(int positionDrawable){
        return headerImage[positionDrawable];
    }

    public static ArrayList<ListModelMenu> getCustomListView(){
        return customListView;
    }


}
