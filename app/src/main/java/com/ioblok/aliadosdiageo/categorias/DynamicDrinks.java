package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.ioblok.aliadosdiageo.MenuActivity;
import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.adapter.CustomMenuAdapter;
import com.ioblok.aliadosdiageo.categorias.content_gin.TanquerayLondon.*;
import com.ioblok.aliadosdiageo.categorias.content_gin.TanquerayTen.*;
import com.ioblok.aliadosdiageo.categorias.content_licor.Baileys.*;
import com.ioblok.aliadosdiageo.categorias.content_licor.BaileysDulceDeLeche.*;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorgan.*;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganBlack.*;
import com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganWhite.*;
import com.ioblok.aliadosdiageo.categorias.content_ron.ZacapaVeintitres.*;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio1942.*;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio70.*;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioAnejo.*;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioBlanco.*;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReal.*;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReposado.*;
import com.ioblok.aliadosdiageo.categorias.content_vodka.Ciroc.*;
import com.ioblok.aliadosdiageo.categorias.content_vodka.KetelOne.*;
import com.ioblok.aliadosdiageo.categorias.content_vodka.Smirnoff.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.Buchanans18.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.BuchanansDoce.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.BuchanansMaster.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.BuchanansRedSeal.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.Bullet.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JandB.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwBlackLabel.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwDoubleBlackLabel.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwGoldLabelReserve.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwKingGeorgeActivity.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwPlatinumLabel.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwRedLabel.JwRedLabelMensajesFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwRedLabel.JwRedLabelServirFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.JwRedLabel.JwRedLabelTourFragment;
import com.ioblok.aliadosdiageo.categorias.content_whisky.OldPar.*;
import com.ioblok.aliadosdiageo.categorias.content_whisky.OldParSilver.*;
import com.ioblok.aliadosdiageo.contentfamily.BuchanansActivity;
import com.ioblok.aliadosdiageo.contentfamily.DonJulioActivity;
import com.ioblok.aliadosdiageo.contentfamily.TanquerayActivity;
import com.ioblok.aliadosdiageo.contentfamily.WalkerActivity;
import com.ioblok.aliadosdiageo.contentfamily.ZacapaActivity;
import com.ioblok.aliadosdiageo.diageo.DiageoActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;
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
    MediaController mediaController;
    private int position = 0;
    View v;
    ImageView ivHeader;
    String[] valuesWith = new String[]{"SPOT", "VIDEO", "MENSAJES\nClAVE", "TOUR DE\nBOTELLAS", "COMO\nSERVIR"};
    String[] valuesWithout = new String[]{"VIDEO", "MENSAJES\nCLAVES", "TOUR DE\nBOTELLAS", "COMO\nSERVIR"};

    PopupWindow popupWindow;
    int positionExtras;
    boolean isListEnable = true;
    boolean hasSpot = false;
    String youTubeUrlVideo = "";
    String idVideo = "";


    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    CustomMenuAdapter adapterActivity;
    public View lastView;


    /**
     * @JCElements These elements are used for Video
     **/
    private VideoView myVideoView;
    private RelativeLayout rlVideoView;
    private Button btnClose;
    Realm realm;
    String urlVideo = "NO VIDEO";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamic_drinks_activity);

         /* Menu list*/
        mDrawerOptions = (ListView) findViewById(R.id.left_drawer);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        adapterActivity = new CustomMenuAdapter(this, R.layout.custom_menu_item, Constants.getCustomListView());
        View header = getLayoutInflater().inflate(R.layout.custom_menu_header, null);
        mDrawerOptions.addHeaderView(header);
        mDrawerOptions.setAdapter(adapterActivity);

        mDrawerOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                if (position == 1) {
                    Intent intent = new Intent(DynamicDrinks.this, DiageoActivity.class);
                    startActivity(intent);
                    finish();
                } else if (position == 2) {
                    hideSubmenu(arg1, position);
                    lastView = arg1;
                } else if (position == 3) {
                    hideSubmenu(arg1, position);
                    lastView = arg1;
                } else if (position == 4) {
                    hideSubmenu(arg1, position);
                    lastView = arg1;
                } else if (position == 5) {
                    Intent intent = new Intent(DynamicDrinks.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();
                } else if (position == 6) {
                    Intent intent = new Intent(DynamicDrinks.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });


        Intent intent = getIntent();
        positionExtras = intent.getIntExtra("idYT", 0);
        isListEnable = intent.getBooleanExtra("isListEnable", true);
        hasSpot = intent.getBooleanExtra("hasSpot", false);
        idVideo = intent.getStringExtra("idVideo");
        youTubeUrlVideo = Constants.getUrlVideosYouTube(positionExtras);
        Log.e("FUCK VIdeO", idVideo);

        backButton_categorias_int = (Button) this.findViewById(R.id.backButton_categorias_int);
        btnDots = (Button) findViewById(R.id.btn_dots);
        btnHideList = (Button) findViewById(R.id.btn_hide_list);
        llDots = (LinearLayout) findViewById(R.id.ll_dots);
        listView = (ListView) findViewById(R.id.list);
        ivHeader = (ImageView) findViewById(R.id.iv_header);

        ivHeader.setBackgroundResource(Constants.getHeaderDrawableImage(positionExtras));

        realm = Realm.getInstance(getBaseContext());

        RealmResults<URLVideosDataBase> results = realm.where(URLVideosDataBase.class).findAll();

        for (int i = 0; i < results.size(); i++) {

            URLVideosDataBase u = results.get(i);
            String splitURL = u.getUrlFileStorage();
            String[] partOfURL = splitURL.split("/");
            String lastElementOfURL = partOfURL[partOfURL.length - 1];
            lastElementOfURL.replace(".mp4", "");
            Log.e("LAST ELEMENT", lastElementOfURL);

            if (lastElementOfURL.equals((idVideo + ".mp4"))) {
                urlVideo = splitURL;
            }

            /* if(u.getUrlFileStorage().contains(idVideo)){
                 urlVideo = u.getUrlFileStorage();
             } */

        }

        if (!isListEnable) llDots.setVisibility(View.GONE);

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

        if (hasSpot)
            adapter = new ArrayAdapter<String>(this, R.layout.simple_list_item_custom, valuesWith);
        else
            adapter = new ArrayAdapter<String>(this, R.layout.simple_list_item_custom, valuesWithout);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition;

                if (hasSpot) itemPosition = position;
                else itemPosition = position + 1;

                switch (itemPosition) {
                    case 0:
                        openYoutube(youTubeUrlVideo);
                        hideList();
                        //Si popup != null, es decir, ya se presionó por lo menos una vez, entonces se oculta el último popup
                        break;
                    case 1:
                        playVideo();
                        break;
                    case 2:
                        keyMessage();
                        hideList();
                        break;
                    case 3:
                        bottleTour();
                        hideList();
                        break;
                    case 4:
                        howToPrepare();
                        hideList();
                        break;
                    default:
                        changeFragment();
                }

            }

        });

    }


    private void hideSubmenu(View arg1, int position) {
        if (lastView != null && arg1 != lastView) {
            for (int i = 0; i < ((ViewGroup) lastView).getChildCount(); ++i) {
                View nextChild = ((ViewGroup) lastView).getChildAt(i);
                if (nextChild instanceof LinearLayout) {
                    nextChild.setVisibility(View.GONE);
                    nextChild.setTag("false");
                }
            }
        }

        for (int i = 0; i < ((ViewGroup) arg1).getChildCount(); ++i) {
            View nextChild = ((ViewGroup) arg1).getChildAt(i);
            if (nextChild instanceof LinearLayout) {
                switch (position) {
                    case 2:
                        if (R.id.ll_families == nextChild.getId()) {
                            if (nextChild.getTag().toString().equals("true")) {
                                nextChild.setVisibility(View.GONE);
                                nextChild.setTag("false");
                            } else {
                                nextChild.setVisibility(View.VISIBLE);
                                nextChild.setTag("true");
                            }
                        }
                        break;
                    case 3:
                        if (R.id.ll_categories == nextChild.getId()) {
                            if (nextChild.getTag().toString().equals("true")) {
                                nextChild.setVisibility(View.GONE);
                                nextChild.setTag("false");
                            } else {
                                nextChild.setVisibility(View.VISIBLE);
                                nextChild.setTag("true");
                            }
                        }
                        break;
                    case 4:
                        if (R.id.ll_process == nextChild.getId()) {
                            if (nextChild.getTag().toString().equals("true")) {
                                nextChild.setVisibility(View.GONE);
                                nextChild.setTag("false");
                            } else {
                                nextChild.setVisibility(View.VISIBLE);
                                nextChild.setTag("true");
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_menu_whisky:
                    intent = new Intent(DynamicDrinks.this, MenuWhiskyActivity.class);
                    break;
                case R.id.btn_menu_tequila:
                    intent = new Intent(DynamicDrinks.this, MenuTequilaActivity.class);
                    break;
                case R.id.btn_menu_ron:
                    intent = new Intent(DynamicDrinks.this, MenuRonActivity.class);
                    break;
                case R.id.btn_menu_vodka:
                    intent = new Intent(DynamicDrinks.this, MenuVodkaActivity.class);
                    break;
                case R.id.btn_menu_gin:
                    intent = new Intent(DynamicDrinks.this, MenuGinActivity.class);
                    break;
                case R.id.btn_menu_licor:
                    intent = new Intent(DynamicDrinks.this, MenuLicorActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };

    public void actionsFromSubMenuItems(View view) {

        Intent customIntent;

        switch (view.getId()) {


            //listeners for header list
            case R.id.menu_header_home:
                customIntent = new Intent(DynamicDrinks.this, MenuActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_header_back:
                finish();
                break;
            case R.id.menu_header_close:
                mDrawer.closeDrawers();
                break;


            //listeners for families submenu
            case R.id.menu_item_zacapa:
                customIntent = new Intent(DynamicDrinks.this, ZacapaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_jw:
                customIntent = new Intent(DynamicDrinks.this, WalkerActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_b:
                customIntent = new Intent(DynamicDrinks.this, BuchanansActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_t:
                customIntent = new Intent(DynamicDrinks.this, TanquerayActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_dj:
                customIntent = new Intent(DynamicDrinks.this, DonJulioActivity.class);
                startActivity(customIntent);
                finish();
                break;


            //listeners for categories submenu
            case R.id.menu_item_whisky:
                customIntent = new Intent(DynamicDrinks.this, MenuWhiskyActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_tequila:
                customIntent = new Intent(DynamicDrinks.this, MenuTequilaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_ron:
                customIntent = new Intent(DynamicDrinks.this, MenuRonActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_vodka:
                customIntent = new Intent(DynamicDrinks.this, MenuVodkaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_gin:
                customIntent = new Intent(DynamicDrinks.this, MenuGinActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_licor:
                customIntent = new Intent(DynamicDrinks.this, MenuLicorActivity.class);
                startActivity(customIntent);
                finish();
                break;


            //listeners for process submenu
            case R.id.menu_item_intro:
                customIntent = new Intent(DynamicDrinks.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_introduccion");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_cognac:
                customIntent = new Intent(DynamicDrinks.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_cognac");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_ginebra:
                customIntent = new Intent(DynamicDrinks.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_ginebra");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_ron:
                customIntent = new Intent(DynamicDrinks.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_ron");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_vodka:
                customIntent = new Intent(DynamicDrinks.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_vodka");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_whisky:
                customIntent = new Intent(DynamicDrinks.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_whisky");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_tequila:
                customIntent = new Intent(DynamicDrinks.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_tequila");
                startActivity(customIntent);
                finish();
                break;

        }

    }


    public void changeFragment() {

        DynamicTourDrink newFragment = new DynamicTourDrink();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }


    public void howToPrepare() {

        Fragment howToPrepareFragment = null;

        switch (positionExtras) {
            case 0:
                howToPrepareFragment = new JwBlueLabelServirFragment();
                break;
            case 1:
                howToPrepareFragment = new JwKingGeorgeServirFragment();
                break;
            case 2:
                howToPrepareFragment = new JwDoubleBlackLabelServirFragment();
                break;
            case 3:
                howToPrepareFragment = new JwPlatiniumServirFragment();
                break;
            case 4:
                howToPrepareFragment = new JwRedLabelServirFragment();
                break;
            case 5:
                howToPrepareFragment = new JwGoldLabelServirFragment();
                break;
            case 6:
                howToPrepareFragment = new BuchanansRedSealServirFragment();
                break;
            case 7:
                howToPrepareFragment = new JwBlackLabelServirFragment();
                break;
            case 8:
                howToPrepareFragment = new BuchanansUnoOchoServirFragment();
                break;
            case 9:
                howToPrepareFragment = new BuchanansMasterServirFragment();
                break;
            case 10:
                break;
            case 11:
                howToPrepareFragment = new BuchanansDoceServirFragment();
                break;
            case 12:
                break;
            case 13:
                howToPrepareFragment = new OldParServirFragment();
                break;
            case 14:
                howToPrepareFragment = new OldParSilverServirFragment();
                break;
            case 15:
                howToPrepareFragment = new JandBServirFragment();
                break;
            case 16:
                howToPrepareFragment = new BulletServirFragment();
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                howToPrepareFragment = new DonJulioBlancoServirFragment();
                break;
            case 20:
                howToPrepareFragment = new DonJulioAnejoServirFragment();
                break;
            case 21:
                howToPrepareFragment = new DonJulioReposadoServirFragment();
                break;
            case 22:
                howToPrepareFragment = new DonJulio70ServirFragment();
                break;
            case 23:
                howToPrepareFragment = new DonJulio1942ServirFragment();
                break;
            case 24:
                howToPrepareFragment = new DonJulioRealServirFragment();
                break;
            case 25:
                break;
            case 26:
                howToPrepareFragment = new ZacapaVeintitresServirFragment();
                break;
            case 27:
                howToPrepareFragment = new CaptainMorganServirFragment();
                break;
            case 28:
                howToPrepareFragment = new CaptainMorganBlackServirFragment();
                break;
            case 29:
                howToPrepareFragment = new CaptainMorganWhiteServirFragment();
                break;
            case 30:
                howToPrepareFragment = new CirocServirFragment();
                break;
            case 31:
                howToPrepareFragment = new KetelOneServirFragment();
                break;
            case 32:
                howToPrepareFragment = new SmirnoffServirFragment();
                break;
            case 33:
                howToPrepareFragment = new TanquerayLondonServirFragment();
                break;
            case 34:
                howToPrepareFragment = new TanquerayTenServirFragment();
                break;
            case 35:
                howToPrepareFragment = new BaileysServirFragment();
                break;
            case 36:
                howToPrepareFragment = new BaileysDulceServirFragment();
                break;
            default:
                return;
        }

        if (howToPrepareFragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, howToPrepareFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }

    }

    public void bottleTour() {

        Fragment bottleFragment = null;

        switch (positionExtras) {
            case 0:
                bottleFragment = new JwBlueLabelTourFragment();
                break;
            case 1:
                bottleFragment = new JwKingGeorgeTourFragment();
                break;
            case 2:
                bottleFragment = new JwDoubleBlackLabelTourFragment();
                break;
            case 3:
                bottleFragment = new JwPlatiniumTourFragment();
                break;
            case 4:
                bottleFragment = new JwRedLabelTourFragment();
                break;
            case 5:
                bottleFragment = new JwGoldLabelTourFragment();
                break;
            case 6:
                bottleFragment = new BuchanansRedSealTourFragment();
                break;
            case 7:
                bottleFragment = new JwBlackLabelTourFragment();
                break;
            case 8:
                bottleFragment = new BuchanansUnoOchoTourFragment();
                break;
            case 9:
                bottleFragment = new BuchanansMasterTourFragment();
                break;
            case 10:
                break;
            case 11:
                bottleFragment = new BuchanansDoceTourFragment();
                break;
            case 12:
                break;
            case 13:
                bottleFragment = new OldParTourFragment();
                break;
            case 14:
                bottleFragment = new OldParSilverTourFragment();
                break;
            case 15:
                bottleFragment = new JandBTourFragment();
                break;
            case 16:
                bottleFragment = new BulletTourFragment();
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                bottleFragment = new DonJulioBlancoTourFragment();
                break;
            case 20:
                bottleFragment = new DonJulioAnejoTourFragment();
                break;
            case 21:
                bottleFragment = new DonJulioReposadoTourFragment();
                break;
            case 22:
                bottleFragment = new DonJulio70TourFragment();
                break;
            case 23:
                bottleFragment = new DonJulio1942TourFragment();
                break;
            case 24:
                bottleFragment = new DonJulioRealTourFragment();
                break;
            case 25:
                break;
            case 26:
                bottleFragment = new ZacapaVeintitresTourFragment();
                break;
            case 27:
                bottleFragment = new CaptainMorganTourFragment();
                break;
            case 28:
                bottleFragment = new CaptainMorganBlackTourFragment();
                break;
            case 29:
                bottleFragment = new CaptainMorganWhiteTourFragment();
                break;
            case 30:
                bottleFragment = new CirocTourFragment();
                break;
            case 31:
                bottleFragment = new KetelOneTourFragment();
                break;
            case 32:
                bottleFragment = new SmirnoffTourFragment();
                break;
            case 33:
                bottleFragment = new TanquerayLondonTourFragment();
                break;
            case 34:
                bottleFragment = new TanquerayTenTourFragment();
                break;
            case 35:
                bottleFragment = new BaileysTourFragment();
                break;
            case 36:
                bottleFragment = new BaileysDulceTourFragment();
                break;
            default:
                return;
        }

        if (bottleFragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, bottleFragment, "tour");
            transaction.addToBackStack(null);
            transaction.commit();
        }


    }

    public void keyMessage() {

        Fragment keyMessageFragment = null;

        switch (positionExtras) {
            case 0:
                keyMessageFragment = new JwBlueLabelMensajesFragment();
                break;
            case 1:
                keyMessageFragment = new JwKingGeorgeMensajesFragment();
                break;
            case 2:
                keyMessageFragment = new JwDoubleBlackLabelMensajesFragment();
                break;
            case 3:
                keyMessageFragment = new JwPlatiniumMensajesFragment();
                ;
                break;
            case 4:
                keyMessageFragment = new JwRedLabelMensajesFragment();
                break;
            case 5:
                keyMessageFragment = new JwGoldLabelMensajesFragment();
                break;
            case 6:
                keyMessageFragment = new BuchanansRedSealMensajesFragment();
                break;
            case 7:
                keyMessageFragment = new JwBlackLabelMensajesFragment();
                break;
            case 8:
                keyMessageFragment = new BuchanansUnoOchoMensajesFragment();
                break;
            case 9:
                keyMessageFragment = new BuchanansMasterMensajesFragment();
                break;
            case 10:
                break;
            case 11:
                keyMessageFragment = new BuchanansDoceMensajesFragment();
                break;
            case 12:
                break;
            case 13:
                keyMessageFragment = new OldParMensajesFragment();
                break;
            case 14:
                keyMessageFragment = new OldParSilverMensajesFragment();
                break;
            case 15:
                keyMessageFragment = new JandBMensajesFragment();
                break;
            case 16:
                keyMessageFragment = new BulletMensajesFragment();
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                keyMessageFragment = new DonJulioBlancoMensajesFragment();
                break;
            case 20:
                keyMessageFragment = new DonJulioAnejoMensajesFragment();
                break;
            case 21:
                keyMessageFragment = new DonJulioReposadoMensajesFragment();
                break;
            case 22:
                keyMessageFragment = new DonJulio70MensajesFragment();
                break;
            case 23:
                keyMessageFragment = new DonJulio1942MensajesFragment();
                break;
            case 24:
                keyMessageFragment = new DonJulioRealMensajesFragment();
                break;
            case 25:
                break;
            case 26:
                keyMessageFragment = new ZacapaVeintitresMensajesFragment();
                break;
            case 27:
                keyMessageFragment = new CaptainMorganMensajesFragment();
                break;
            case 28:
                keyMessageFragment = new CaptainMorganBlackMensajesFragment();
                break;
            case 29:
                keyMessageFragment = new CaptainMorganWhiteMensajesFragment();
                break;
            case 30:
                keyMessageFragment = new CirocMensajesFragment();
                break;
            case 31:
                keyMessageFragment = new KetelOneMensajesFragment();
                break;
            case 32:
                keyMessageFragment = new SmirnoffMensajesFragment();
                break;
            case 33:
                keyMessageFragment = new TanquerayLondonMensajesFragment();
                break;
            case 34:
                keyMessageFragment = new TanquerayTenMensajesFragment();
                break;
            case 35:
                keyMessageFragment = new BaileysMensajesFragment();
                break;
            case 36:
                keyMessageFragment = new BaileysDulceMensajesFragment();
                break;
            default:
                return;
        }

        if (keyMessageFragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, keyMessageFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }

    public void openYoutube(String idVideo) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(idVideo));
        startActivity(intent);
    }

    public void hideList() {
        hidePopup();
        if (isHideMyListView) {
            listView.setVisibility(View.VISIBLE);
            btnHideList.setVisibility(View.VISIBLE);
            isHideMyListView = false;
        } else {
            listView.setVisibility(View.GONE);
            btnHideList.setVisibility(View.GONE);
            isHideMyListView = true;
        }
    }

    public void hideList(View view) {
        hidePopup();
        listView.setVisibility(View.GONE);
        btnHideList.setVisibility(View.GONE);
        isHideMyListView = true;
    }

    public int getPositionExtras() {
        return positionExtras;
    }

    public void playVideo() {

        Log.e("VIDEO", urlVideo);
        if (urlVideo.equals("NO VIDEO")) return;

        myVideoView = (VideoView) findViewById(R.id.video_view);
        rlVideoView = (RelativeLayout) findViewById(R.id.rl_video_view);
        btnClose = (Button) findViewById(R.id.btn_close);

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
        hideList();

    }

    public void hidePopup(){
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("tour");
        if (fragment != null)
            fragment.onPause();
    }

}
