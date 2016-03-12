package com.ioblok.aliadosdiageo.diageo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;

import com.ioblok.aliadosdiageo.MenuActivity;
import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.utilis.Constants;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;
import com.ioblok.aliadosdiageo.utilis.VideoPlayer;
import com.ioblok.aliadosdiageo.utilis.addItemNav;

import java.io.File;
import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class DiageoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    Button backButton,menu_desplegable;
    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    private static final String[] values = {"Diageo", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    private int[] colors = new int[] { 0x30FF0000, 0x300000FF };
    //private String[] values;


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
    Realm realm;
    String urlVideo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diageo);

        realm = Realm.getInstance(getBaseContext());

        btnVideo    = (Button)findViewById(R.id.btn_video);
        String btnTagVideo = btnVideo.getTag().toString();

        RealmResults<URLVideosDataBase> results = realm.where(URLVideosDataBase.class).findAll();

        for (int i = 0; i < results.size(); i++) {

            URLVideosDataBase u = results.get(i);
            if(u.getUrlFileStorage().contains(btnTagVideo)){
                urlVideo = u.getUrlFileStorage();
                return;
            }

        }

        backButton  = (Button)this.findViewById(R.id.backButton_diageo);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mDrawerOptions = (ListView) findViewById(R.id.left_drawer);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        mDrawerOptions.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values));
        mDrawerOptions.setOnItemClickListener(this);
        
    }

    /*@Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "Pulsado " + values[i], Toast.LENGTH_SHORT).show();
        mDrawer.closeDrawers();
    }*/

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "Pulsado " + values[i], Toast.LENGTH_SHORT).show();
        mDrawer.closeDrawers();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                if (mDrawer.isDrawerOpen(mDrawerOptions)){
                    mDrawer.closeDrawers();
                }else{
                    mDrawer.openDrawer(mDrawerOptions);
                }
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openMenu(View v) {
        Log.e("abrir boton", " ");
        mDrawer.openDrawer(mDrawerOptions);
    }

    public void playVideo(View view){

        myVideoView = (VideoView) findViewById(R.id.video_view);
        rlVideoView = (RelativeLayout) findViewById(R.id.rl_video_view);
        btnClose    = (Button) findViewById(R.id.btn_close);

        rlVideoView.setVisibility(View.VISIBLE);
        VideoPlayer.playVideo(myVideoView, rlVideoView, btnClose, urlVideo,  this);

    }

}
