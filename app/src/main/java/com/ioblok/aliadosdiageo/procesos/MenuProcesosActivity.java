package com.ioblok.aliadosdiageo.procesos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.contentfamily.BuchanansActivity;
import com.ioblok.aliadosdiageo.contentfamily.DonJulioActivity;
import com.ioblok.aliadosdiageo.contentfamily.TanquerayActivity;
import com.ioblok.aliadosdiageo.contentfamily.WalkerActivity;
import com.ioblok.aliadosdiageo.contentfamily.ZacapaActivity;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;
import com.ioblok.aliadosdiageo.utilis.VideoPlayer;

import io.realm.Realm;
import io.realm.RealmResults;

public class MenuProcesosActivity extends AppCompatActivity {

    Button btns_back_home,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    /**@JCElements
     *
     * These elements are used for Video
     *
     * **/
    private VideoView myVideoView;
    private RelativeLayout rlVideoView;
    private Button btnClose;
    private int position = 0;
    Realm realm;
    String urlVideo = "NO VIDEO";

    Button btnProcessIntro, btnProcessCognac, btnProcessGinebra, btnProcessRon,
            btnProcessVodka, btnProcessWhisky, btnProcessTequila;

    Button btn_back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_procesos);
/*        initialize();

        btn_family_zacapa.setOnClickListener(menu);
        btn_family_walker.setOnClickListener(menu);
        btn_family_buchanans.setOnClickListener(menu);
        btn_family_tanqueray.setOnClickListener(menu);
        btn_family_don_julio.setOnClickListener(menu);*/
        realm = Realm.getInstance(getBaseContext());

        btnProcessIntro     = (Button) findViewById(R.id.btn_process_intro);
        btnProcessCognac    = (Button) findViewById(R.id.btn_process_cognac);
        btnProcessGinebra   = (Button) findViewById(R.id.btn_process_ginebra);
        btnProcessRon       = (Button) findViewById(R.id.btn_process_ron);
        btnProcessVodka     = (Button) findViewById(R.id.btn_process_vodka);
        btnProcessWhisky    = (Button) findViewById(R.id.btn_process_whisky);
        btnProcessTequila   = (Button) findViewById(R.id.btn_process_tequila);

        btn_back_home       = (Button)this.findViewById(R.id.btn_back_proceso);

        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void playVideo(View view){

        String btnTagVideo = view.getTag().toString();

        switch (view.getId()){
            case  R.id.btn_process_intro:
                urlVideo = getTagFromDB(btnTagVideo);
                break;
            case R.id.btn_process_cognac:
                urlVideo = getTagFromDB(btnTagVideo);
                break;
            case R.id.btn_process_ginebra:
                urlVideo = getTagFromDB(btnTagVideo);
                break;
            case R.id.btn_process_ron:
                urlVideo = getTagFromDB(btnTagVideo);
                break;
            case R.id.btn_process_vodka:
                urlVideo = getTagFromDB(btnTagVideo);
                break;
            case R.id.btn_process_whisky:
                urlVideo = getTagFromDB(btnTagVideo);
                break;
            case R.id.btn_process_tequila:
                urlVideo = getTagFromDB(btnTagVideo);
                break;
            default:
                urlVideo = "NO VIDEO";
        }

        Log.e("TAG RETURNED", urlVideo);

        myVideoView = (VideoView) findViewById(R.id.video_view);
        rlVideoView = (RelativeLayout) findViewById(R.id.rl_video_view);
        btnClose    = (Button) findViewById(R.id.btn_close);

        rlVideoView.setVisibility(View.VISIBLE);
        VideoPlayer.playVideo(myVideoView, rlVideoView, btnClose, urlVideo,  this);

    }

    public String getTagFromDB(String tag){
        RealmResults<URLVideosDataBase> results = realm.where(URLVideosDataBase.class).findAll();

        for (int i = 0; i < results.size(); i++) {

            URLVideosDataBase u = results.get(i);
            if(u.getUrlFileStorage().contains(tag)){
                tag = u.getUrlFileStorage();
                return tag;
            }

        }

        return "NOVIDEO";
    }

/*
    public void initialize(){
        btn_family_zacapa = (Button) findViewById(R.id.btn_family_zacapa);
        btn_family_walker = (Button) findViewById(R.id.btn_family_walker);
        btn_family_buchanans = (Button) findViewById(R.id.btn_family_buchanans);
        btn_family_tanqueray = (Button) findViewById(R.id.btn_family_tanqueray);
        btn_family_don_julio = (Button) findViewById(R.id.btn_family_don_julio);

    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {

                case R.id.btn_family_zacapa:
                    intent = new Intent(MenuProcesosActivity.this, ZacapaActivity.class);
                    break;
                case R.id.btn_family_walker:
                    intent = new Intent(MenuProcesosActivity.this, WalkerActivity.class);
                    break;
                case R.id.btn_family_buchanans:
                    intent = new Intent(MenuProcesosActivity.this, BuchanansActivity.class);
                    break;
                case R.id.btn_family_tanqueray:
                    intent = new Intent(MenuProcesosActivity.this, TanquerayActivity.class);
                    break;
                case R.id.btn_family_don_julio:
                    intent = new Intent(MenuProcesosActivity.this, DonJulioActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };*/

}
