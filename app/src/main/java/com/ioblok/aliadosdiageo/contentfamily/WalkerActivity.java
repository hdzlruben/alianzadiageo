package com.ioblok.aliadosdiageo.contentfamily;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;
import com.ioblok.aliadosdiageo.utilis.VideoPlayer;

import io.realm.Realm;
import io.realm.RealmResults;

public class WalkerActivity extends AppCompatActivity {

    Button backButton_desc;
    String text;

    /**@JCElements
     *
     * These elements are used for Video
     *
     * **/
    private VideoView myVideoView;
    private RelativeLayout rlVideoView;
    private ImageButton btnVideo;
    private Button btnClose;
    private int position = 0;
    Realm realm;
    String urlVideo = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_walker);
        initialize();

        backButton_desc = (Button)this.findViewById(R.id.btn_back_desc);
        backButton_desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        realm = Realm.getInstance(getBaseContext());

        btnVideo    = (ImageButton) findViewById(R.id.btn_video);
        String btnTagVideo = btnVideo.getTag().toString();

        RealmResults<URLVideosDataBase> results = realm.where(URLVideosDataBase.class).findAll();

        for (int i = 0; i < results.size(); i++) {

            URLVideosDataBase u = results.get(i);
            if(u.getUrlFileStorage().contains(btnTagVideo)){
                urlVideo = u.getUrlFileStorage();
                return;
            }

        }

    }


    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getAssets(), "acaslonpro-regular-webfont.ttf");
        text = getString(R.string.txt_jw);

        DocumentView documentView = (DocumentView)findViewById(R.id.txt_jw_text);
        documentView.setText(text);
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentView.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentView.getDocumentLayoutParams().setTextTypeface(myFont);
    }

    public void playVideo(View view){

        myVideoView = (VideoView) findViewById(R.id.video_view);
        rlVideoView = (RelativeLayout) findViewById(R.id.rl_video_view);
        btnClose    = (Button) findViewById(R.id.btn_close);
        rlVideoView.setVisibility(View.VISIBLE);
        VideoPlayer.playVideo(myVideoView, rlVideoView, btnClose, urlVideo,  this);

    }

}
