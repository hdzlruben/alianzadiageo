package com.ioblok.aliadosdiageo.procesos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.adapter.AdapterActivity;
import com.ioblok.aliadosdiageo.categorias.MenuCategoriasActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class MenuProcesosActivity extends AppCompatActivity {

    Button btns_back_home,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    public String[] values = {"DIAGEO", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    AdapterActivity adapterActivity;

    private VideoView myVideoView;
    private RelativeLayout rlVideoView;
    private MediaController mediaController;
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

        /* Menu list */
        mDrawerOptions = (ListView) findViewById(R.id.left_drawer);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        adapterActivity = new AdapterActivity(this,values);
        mDrawerOptions.setAdapter(adapterActivity);
        /* Menu list */

        mDrawerOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                if (position == 0)
                {
                    Intent intent = new Intent(MenuProcesosActivity.this, MenuProcesosActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 1)
                {
                    Intent intent = new Intent(MenuProcesosActivity.this, MenuFamilyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 2)
                {
                    Intent intent = new Intent(MenuProcesosActivity.this, MenuCategoriasActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 3)
                {
                    Intent intent = new Intent(MenuProcesosActivity.this, MenuProcesosActivity.class);
                    startActivity(intent);
                    finish();

                }
                else if (position == 4)
                {
                    Intent intent = new Intent(MenuProcesosActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    Intent intent = new Intent(MenuProcesosActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

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

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myVideoView.pause();
                rlVideoView.setVisibility(View.INVISIBLE);
            }
        });


        if (mediaController == null) {
            mediaController = new MediaController(this);
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

        //VideoPlayer.playVideo(myVideoView, rlVideoView, btnClose, urlVideo,  this);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        myVideoView.setLayoutParams(params);

        //VideoPlayer.playVideo(myVideoView, rlVideoView, btnClose, urlVideo, this);

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

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

}
