package com.ioblok.aliadosdiageo.contentfamily;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
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
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class BuchanansActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    public String[] values = {"DIAGEO", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    AdapterActivity adapterActivity;
    private MediaController mediaController;

    private VideoView myVideoView;
    private RelativeLayout rlVideoView;
    private ImageButton btnVideo, btn_img_spot;
    private Button btnClose;
    private int position = 0;
    Realm realm;
    String urlVideo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_buchanans);

         /* Menu list */
        mDrawerOptions = (ListView) findViewById(R.id.left_drawer);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        adapterActivity = new AdapterActivity(this,values);
        mDrawerOptions.setAdapter(adapterActivity);
        /* Menu list */

        btn_img_spot = (ImageButton) findViewById(R.id.img_btn_spot);


        mDrawerOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                if (position == 0)
                {
                    Intent intent = new Intent(BuchanansActivity.this, BuchanansActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 1)
                {
                    Intent intent = new Intent(BuchanansActivity.this, MenuFamilyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 2)
                {
                    Intent intent = new Intent(BuchanansActivity.this, MenuCategoriasActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 3)
                {
                    Intent intent = new Intent(BuchanansActivity.this, MenuProcesosActivity.class);
                    startActivity(intent);
                    finish();

                }
                else if (position == 4)
                {
                    Intent intent = new Intent(BuchanansActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    Intent intent = new Intent(BuchanansActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });


        realm = Realm.getInstance(getBaseContext());

        btnVideo    = (ImageButton)findViewById(R.id.btn_video);
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

    public void playSpot(View view){
        Log.e("Presionado btn spot", "");
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=3wvgrtSxRpI"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

    public void playVideo(View view){

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

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        myVideoView.setLayoutParams(params);


    }

    public void finishActivity(View view){finish();}

}
