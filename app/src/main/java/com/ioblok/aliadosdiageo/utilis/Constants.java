package com.ioblok.aliadosdiageo.utilis;

import java.util.ArrayList;

/**
 * Created by kreativeco on 11/03/16.
 */
public class Constants {

    public static String baseURL;
    public static ArrayList<String> replaceURLVideos = new ArrayList<>();

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
}
