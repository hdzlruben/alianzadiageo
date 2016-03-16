package com.ioblok.aliadosdiageo.utilis;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.diageo.DiageoActivity;

import io.realm.Realm;

/**
 * Created by kreativeco on 12/03/16.
 */
public class VideoPlayer {

    public static VideoView videoView;
    public static RelativeLayout rlVideoView;
    public static Button btnCloseVideo;

    public static int position = 0;
    public static ProgressDialog progressDialog;
    public static MediaController mediaControls;

    public static String urlVideo = "";


    public static void playVideo(VideoView vv, RelativeLayout rlVV, Button btnClose, String urlV, Activity activity){
        videoView = vv;
        rlVideoView = rlVV;
        btnCloseVideo = btnClose;
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
                rlVideoView.setVisibility(View.INVISIBLE);
            }
        });
        urlVideo = urlV;

        if (mediaControls == null) {
            mediaControls = new MediaController(activity);
        }
        //initialize the VideoView
        rlVideoView.setVisibility(View.VISIBLE);
        // create a progress bar while the video file is loading
        progressDialog = new ProgressDialog(activity);
        // set a title for the progress bar
        progressDialog.setTitle("Video");
        // set a message for the progress bar
        progressDialog.setMessage("Loading...");
        //set the progress bar not cancelable on users' touch
        progressDialog.setCancelable(false);
        // show the progress bar
        progressDialog.show();

        try {
            //set the media controller in the VideoView
            videoView.setMediaController(mediaControls);
            videoView.setVideoPath(urlVideo);
            videoView.start();
            //set the uri of the video to be played
            Log.e("URL VIDEO", urlVideo);
            //myVideoView.setVideoURI(Uri.parse(urlVideo));

        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoView.requestFocus();
        //we also set an setOnPreparedListener in order to know when the video file is ready for playback
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
                // close the progress bar and play the video
                progressDialog.dismiss();
                //if we have a position on savedInstanceState, the video playback should start from here
                videoView.seekTo(position);
                if (position == 0) {
                    videoView.start();
                } else {
                    //if we come from a resumed activity, video playback will be paused
                    videoView.pause();
                }
            }
        });

    }

}
