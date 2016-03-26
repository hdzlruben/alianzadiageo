package com.ioblok.aliadosdiageo.servicio;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;

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
    private MyCustomVideo myVideoView;
    private RelativeLayout rlVideoView;
    private Button btnVideo;
    private Button btnClose;
    private int position = 0;
    private MediaController mediaController;
    String urlVideo = "";
    View v;
    String txt_play_video ="";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.video_fragment, null);

        final Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-bold-webfont.ttf");

        txt_play_video = getString(R.string.txt_rep_video);
        TextView txt_title_play_video = (TextView)v.findViewById(R.id.txt_play_video);
        txt_title_play_video.setTextColor(0xFF333333);
        txt_title_play_video.setTypeface(myFont);


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

        final TabLayout tabLayout =  ((MenuServicioActivity)this.getActivity()).getTabLayout();
        final RelativeLayout rlHeaderBack = ((MenuServicioActivity)this.getActivity()).getRlHeaderBack();
        final LinearLayout llHeader = ((MenuServicioActivity)this.getActivity()).getLlHeader();

        myVideoView = (MyCustomVideo) v.findViewById(R.id.video_view);
        rlVideoView = (RelativeLayout) v.findViewById(R.id.rl_video_view);
        btnClose    = (Button) v.findViewById(R.id.btn_close);

        rlVideoView.setVisibility(View.VISIBLE);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myVideoView.pause();
                rlVideoView.setVisibility(View.INVISIBLE);
            }
        });


        if (mediaController == null) {
            mediaController = new MediaController(getActivity());
        }
        rlVideoView.setVisibility(View.VISIBLE);

        try {
            //set the media controller in the VideoView
            myVideoView.setMediaController(mediaController);
            myVideoView.setVideoPath(urlVideo);
            myVideoView.start();

        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
                myVideoView.seekTo(position);
                if (position == 0) {
                    myVideoView.start();
                } else {
                    myVideoView.pause();
                }
            }
        });

        myVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                tabLayout.setVisibility(View.VISIBLE);
                rlVideoView.setVisibility(View.GONE);
                rlHeaderBack.setVisibility(View.VISIBLE);
                llHeader.setVisibility(View.VISIBLE);
            }

        });

        myVideoView.setPlayPauseListener(new MyCustomVideo.PlayPauseListener() {
            @Override
            public void onPlay() {
            }

            @Override
            public void onPause() {
                tabLayout.setVisibility(View.VISIBLE);
                rlVideoView.setVisibility(View.GONE);
                rlHeaderBack.setVisibility(View.VISIBLE);
                llHeader.setVisibility(View.VISIBLE);
            }
        });


        //VideoPlayer.playVideo(myVideoView, rlVideoView, btnClose, urlVideo,  this);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        myVideoView.setLayoutParams(params);

        tabLayout.setVisibility(View.GONE);
        llHeader.setVisibility(View.GONE);
        rlHeaderBack.setVisibility(View.GONE);


    }
}
