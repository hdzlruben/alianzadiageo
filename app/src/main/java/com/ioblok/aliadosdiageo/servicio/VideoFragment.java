package com.ioblok.aliadosdiageo.servicio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;
import com.ioblok.aliadosdiageo.utilis.VideoPlayer;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by kreativeco on 12/03/16.
 */


public class VideoFragment extends Fragment {

    /**@JCElements
     *
     * These elements are used for Video
     *
     * **/
    private VideoView myVideoView;
    private RelativeLayout rlVideoView;
    private Button btnVideo;
    private Button btnClose;
    private int position = 0;
    String urlVideo = "";
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.video_fragment, null);

        btnVideo    = (Button) v.findViewById(R.id.btn_video);
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playVideo();
            }
        });
        String btnTagVideo = btnVideo.getTag().toString();
        
        RealmResults<URLVideosDataBase> results =
                ((MenuServicioActivity)this.getActivity()).getRealm().
                        where(URLVideosDataBase.class).findAll();

        for (int i = 0; i < results.size(); i++) {

            URLVideosDataBase u = results.get(i);
            if(u.getUrlFileStorage().contains(btnTagVideo)){
                urlVideo = u.getUrlFileStorage();
            }

        }

        return v;

    }

    public void playVideo(){

        myVideoView = (VideoView) v.findViewById(R.id.video_view);
        rlVideoView = (RelativeLayout) v.findViewById(R.id.rl_video_view);
        btnClose    = (Button) v.findViewById(R.id.btn_close);

        rlVideoView.setVisibility(View.VISIBLE);
        VideoPlayer.playVideo(myVideoView, rlVideoView, btnClose, urlVideo,  getActivity());

    }
}
