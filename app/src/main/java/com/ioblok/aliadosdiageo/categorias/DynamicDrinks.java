package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.categorias.content_gin.TanquerayLondon.TanquerayLondonMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_gin.TanquerayLondon.TanquerayLondonServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_gin.TanquerayLondon.TanquerayLondonTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_gin.TanquerayTen.TanquerayTenMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_gin.TanquerayTen.TanquerayTenServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_gin.TanquerayTen.TanquerayTenTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_licor.Baileys.BaileysMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_licor.Baileys.BaileysServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_licor.Baileys.BaileysTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_licor.BaileysDulceDeLeche.BaileysDulceMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_licor.BaileysDulceDeLeche.BaileysDulceServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_licor.BaileysDulceDeLeche.BaileysDulceTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorgan.CaptainMorganMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorgan.CaptainMorganServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorgan.CaptainMorganTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganBlack.CaptainMorganBlackMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganBlack.CaptainMorganBlackServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganBlack.CaptainMorganBlackTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganWhite.CaptainMorganWhiteMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganWhite.CaptainMorganWhiteServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganWhite.CaptainMorganWhiteTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.ZacapaVeintitres.ZacapaVeintitresMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.ZacapaVeintitres.ZacapaVeintitresServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.ZacapaVeintitres.ZacapaVeintitresTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_ron.ZacapaXo.ZacapaMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio1942.DonJulio1942MensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio1942.DonJulio1942ServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio1942.DonJulio1942TourFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio70.DonJulio70MensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio70.DonJulio70ServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio70.DonJulio70TourFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioAnejo.DonJulioAnejoMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioAnejo.DonJulioAnejoServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioAnejo.DonJulioAnejoTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioBlanco.DonJulioBlancoMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioBlanco.DonJulioBlancoServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioBlanco.DonJulioBlancoTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReal.DonJulioRealMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReal.DonJulioRealServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReal.DonJulioRealTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReposado.DonJulioReposadoMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReposado.DonJulioReposadoServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReposado.DonJulioReposadoTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.Buchanans18.BuchanansUnoOchoMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.Buchanans18.BuchanansUnoOchoServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.Buchanans18.BuchanansUnoOchoTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.BuchanansRedSeal.BuchanansRedSealMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.BuchanansRedSeal.BuchanansRedSealTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlackLabel.JwBlackLabelMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlackLabel.JwBlackLabelServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlackLabel.JwBlackLabelTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlueLabelMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlueLabelServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlueLabelTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwDoubleBlackLabel.JwDoubleBlackLabelMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwDoubleBlackLabel.JwDoubleBlackLabelServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwDoubleBlackLabel.JwDoubleBlackLabelTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwGoldLabelReserve.JwGoldLabelMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwGoldLabelReserve.JwGoldLabelServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwGoldLabelReserve.JwGoldLabelTourFragment;
import com.ioblok.aliadosdiageo.utilis.Constants;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;
import com.ioblok.aliadosdiageo.utilis.VideoPlayer;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by kreativeco on 12/03/16.
 */
public class DynamicDrinks extends AppCompatActivity {

    Button backButton_categorias_int, btnDots, btnHideList;
    ListView listView;
    LinearLayout llDots;
    Boolean isHideMyListView = true;
    View v;
    ViewPager viewPager;


    CoordinatorLayout rootLayout;
    String[] valuesWith     = new String[]{"SPOT", "VIDEO", "MENSAJES\nClAVE", "TOUR DE\nBOTELLAS", "COMO\nSERVIR"};
    String[] valuesWithout  = new String[]{"VIDEO", "MENSAJES\nClAVE", "TOUR DE\nBOTELLAS", "COMO\nSERVIR"};


    int positionExtras;
    boolean isListEnable = true;
    boolean hasSpot = false;
    String youTubeUrlVideo = "";
    String idVideo = "";


    /**@JCElements
     *
     * These elements are used for Video
     *
     * **/
    private VideoView myVideoView;
    private RelativeLayout rlVideoView;
    private Button btnClose;
    Realm realm;
    String urlVideo = "NO VIDEO";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamic_drinks_activity);

        Intent intent   = getIntent();
        positionExtras  = intent.getIntExtra("idYT", 0);
        isListEnable    = intent.getBooleanExtra("isListEnable", true);
        hasSpot         = intent.getBooleanExtra("hasSpot", false);
        idVideo         = intent.getStringExtra("idVideo");
        youTubeUrlVideo = Constants.getUrlVideosYouTube(positionExtras);

        backButton_categorias_int   = (Button) this.findViewById(R.id.backButton_categorias_int);
        btnDots                     = (Button) findViewById(R.id.btn_dots);
        btnHideList                 = (Button) findViewById(R.id.btn_hide_list);
        llDots                      = (LinearLayout) findViewById(R.id.ll_dots);
        listView                    = (ListView) findViewById(R.id.list);

        realm = Realm.getInstance(getBaseContext());

        RealmResults<URLVideosDataBase> results = realm.where(URLVideosDataBase.class).findAll();

        for (int i = 0; i < results.size(); i++) {

            URLVideosDataBase u = results.get(i);
            if(u.getUrlFileStorage().contains(idVideo)){
                urlVideo = u.getUrlFileStorage();
                //return;
            }

        }

        if(!isListEnable) llDots.setVisibility(View.GONE);

        backButton_categorias_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnDots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideList();
            }
        });

        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }
            DynamicScrollViewDrinks firstFragment = new DynamicScrollViewDrinks();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();
        }

        ArrayAdapter<String> adapter;

        if(hasSpot) adapter = new ArrayAdapter<String>(this, R.layout.simple_list_item_custom, valuesWith);
        else adapter = new ArrayAdapter<String>(this, R.layout.simple_list_item_custom, valuesWithout);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition;

                if(hasSpot) itemPosition = position;
                else itemPosition = position + 1;

                switch (itemPosition){
                    case 0:
                        openYoutube(youTubeUrlVideo);
                        break;
                    case 1:
                        playVideo();
                        break;
                    case 2:
                        keyMessage();
                        break;
                    case 3:
                        bottleTour();
                        break;
                    case 4:
                        howToPrepare();
                        break;
                    default:
                        changeFragment();
                }

            }

        });


    }

    public void changeFragment() {

        DynamicTourDrink newFragment = new DynamicTourDrink();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }


    public void howToPrepare() {

        JwGoldLabelServirFragment newFragment = new JwGoldLabelServirFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    public void bottleTour() {

        JwGoldLabelTourFragment newFragment = new JwGoldLabelTourFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    public void keyMessage() {
        JwGoldLabelMensajesFragment newFragment = new JwGoldLabelMensajesFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void openYoutube(String idVideo){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(idVideo));
        startActivity(intent);
    }

    public void hideList(){
        if(isHideMyListView){
            listView.setVisibility(View.VISIBLE);
            btnHideList.setVisibility(View.VISIBLE);
            isHideMyListView = false;
        }else{
            listView.setVisibility(View.GONE);
            btnHideList.setVisibility(View.GONE);
            isHideMyListView = true;
        }
    }

    public void hideList(View view){
        listView.setVisibility(View.GONE);
        btnHideList.setVisibility(View.GONE);
        isHideMyListView = true;
    }

    public int getPositionExtras(){
        return positionExtras;
    }

    public void playVideo(){

        if(urlVideo.equals("NO VIDEO")) return;

        myVideoView = (VideoView) findViewById(R.id.video_view);
        rlVideoView = (RelativeLayout) findViewById(R.id.rl_video_view);
        btnClose    = (Button) findViewById(R.id.btn_close);

        rlVideoView.setVisibility(View.VISIBLE);
        VideoPlayer.playVideo(myVideoView, rlVideoView, btnClose, urlVideo,  this);

    }


}
