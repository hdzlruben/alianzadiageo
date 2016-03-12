package com.ioblok.aliadosdiageo.utilis;

import io.realm.RealmObject;

/**
 * Created by kreativeco on 10/03/16.
 */
public class URLVideosDataBase extends RealmObject{
    private String urlVideo;
    private String urlFileStorage;
    private boolean downloaded;


    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public boolean isDownloaded() {
        return downloaded;
    }

    public void setDownloaded(boolean downloaded) {
        this.downloaded = downloaded;
    }

    public String getUrlFileStorage() {
        return urlFileStorage;
    }

    public void setUrlFileStorage(String urlFileStorage) {
        this.urlFileStorage = urlFileStorage;
    }
}
