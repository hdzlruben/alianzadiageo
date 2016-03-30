package com.ioblok.aliadosdiageo.servicio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.ioblok.aliadosdiageo.MenuActivity;
import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.adapter.AdapterActivity;
import com.ioblok.aliadosdiageo.adapter.CustomMenuAdapter;
import com.ioblok.aliadosdiageo.categorias.MenuCategoriasActivity;
import com.ioblok.aliadosdiageo.categorias.MenuGinActivity;
import com.ioblok.aliadosdiageo.categorias.MenuLicorActivity;
import com.ioblok.aliadosdiageo.categorias.MenuRonActivity;
import com.ioblok.aliadosdiageo.categorias.MenuTequilaActivity;
import com.ioblok.aliadosdiageo.categorias.MenuVodkaActivity;
import com.ioblok.aliadosdiageo.categorias.MenuWhiskyActivity;
import com.ioblok.aliadosdiageo.contentfamily.BuchanansActivity;
import com.ioblok.aliadosdiageo.contentfamily.DonJulioActivity;
import com.ioblok.aliadosdiageo.contentfamily.TanquerayActivity;
import com.ioblok.aliadosdiageo.contentfamily.WalkerActivity;
import com.ioblok.aliadosdiageo.contentfamily.ZacapaActivity;
import com.ioblok.aliadosdiageo.diageo.DiageoActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.utilis.Constants;

import java.util.ArrayList;

import io.realm.Realm;

public class MenuServicioActivity extends AppCompatActivity {

    private ArrayList navDrawerItems;
    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    CustomMenuAdapter adapterActivity;
    public View lastView;

    ViewPager viewPager;
    Button backButton;
    TabLayout tabLayout;
    Realm realm;
    LinearLayout llHeader;
    RelativeLayout rlHeaderBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio);

        backButton = (Button)this.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        llHeader = (LinearLayout) findViewById(R.id.header);
        rlHeaderBack = (RelativeLayout) findViewById(R.id.header_back);

        /* Menu list */
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
                    Intent intent = new Intent(MenuServicioActivity.this, DiageoActivity.class);
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
                    Intent intent = new Intent(MenuServicioActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();
                } else if (position == 6) {
                    Intent intent = new Intent(MenuServicioActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });


        viewPager = (ViewPager) findViewById(R.id.view_pager);

        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 40, getResources().getDisplayMetrics());

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(px, px);

        realm = Realm.getInstance(getBaseContext());
        //realm.beginTransaction();

        ImageButton tabVideos    = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_videos, null);
        ImageButton tabsr1       = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_sr1, null);
        ImageButton tabsr2       = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_sr2, null);
        ImageButton tabsr3       = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_sr3, null);
        ImageButton tabsr4       = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_sr4, null);
        ImageButton tabLogo      = (ImageButton) LayoutInflater.from(this).inflate(R.layout.tab_logo_service, null);

        tabVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        tabsr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        tabsr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

        tabsr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        tabsr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(4);
            }
        });

        tabLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.actuandomejor.com.mx/saberservir/app/index.php"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tabVideos.setLayoutParams(params);
        tabsr1.setLayoutParams(params);
        tabsr2.setLayoutParams(params);
        tabsr3.setLayoutParams(params);
        tabsr4.setLayoutParams(params);
        tabLogo.setLayoutParams(params);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabVideos));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabsr1));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabsr2));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabsr3));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabsr4));
        tabLayout.addTab(tabLayout.newTab().setCustomView(tabLogo));

        final FragmentAdapterServices adapterServices = new FragmentAdapterServices
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapterServices);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    public Realm getRealm(){
        return realm;
    }

    public TabLayout getTabLayout(){
        return tabLayout;
    }

    public RelativeLayout getRlHeaderBack(){
        return  rlHeaderBack;
    }

    public LinearLayout getLlHeader(){
        return llHeader;
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
                    intent = new Intent(MenuServicioActivity.this, MenuWhiskyActivity.class);
                    break;
                case R.id.btn_menu_tequila:
                    intent = new Intent(MenuServicioActivity.this, MenuTequilaActivity.class);
                    break;
                case R.id.btn_menu_ron:
                    intent = new Intent(MenuServicioActivity.this, MenuRonActivity.class);
                    break;
                case R.id.btn_menu_vodka:
                    intent = new Intent(MenuServicioActivity.this, MenuVodkaActivity.class);
                    break;
                case R.id.btn_menu_gin:
                    intent = new Intent(MenuServicioActivity.this, MenuGinActivity.class);
                    break;
                case R.id.btn_menu_licor:
                    intent = new Intent(MenuServicioActivity.this, MenuLicorActivity.class);
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
                customIntent = new Intent(MenuServicioActivity.this, MenuActivity.class);
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
                customIntent = new Intent(MenuServicioActivity.this, ZacapaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_jw:
                customIntent = new Intent(MenuServicioActivity.this, WalkerActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_b:
                customIntent = new Intent(MenuServicioActivity.this, BuchanansActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_t:
                customIntent = new Intent(MenuServicioActivity.this, TanquerayActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_dj:
                customIntent = new Intent(MenuServicioActivity.this, DonJulioActivity.class);
                startActivity(customIntent);
                finish();
                break;


            //listeners for categories submenu
            case R.id.menu_item_whisky:
                customIntent = new Intent(MenuServicioActivity.this, MenuWhiskyActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_tequila:
                customIntent = new Intent(MenuServicioActivity.this, MenuTequilaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_ron:
                customIntent = new Intent(MenuServicioActivity.this, MenuRonActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_vodka:
                customIntent = new Intent(MenuServicioActivity.this, MenuVodkaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_gin:
                customIntent = new Intent(MenuServicioActivity.this, MenuGinActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_licor:
                customIntent = new Intent(MenuServicioActivity.this, MenuLicorActivity.class);
                startActivity(customIntent);
                finish();
                break;


            //listeners for process submenu
            case R.id.menu_item_intro:
                customIntent = new Intent(MenuServicioActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_introduccion");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_cognac:
                customIntent = new Intent(MenuServicioActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_cognac");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_ginebra:
                customIntent = new Intent(MenuServicioActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_ginebra");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_ron:
                customIntent = new Intent(MenuServicioActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_ron");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_vodka:
                customIntent = new Intent(MenuServicioActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_vodka");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_whisky:
                customIntent = new Intent(MenuServicioActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_whisky");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_tequila:
                customIntent = new Intent(MenuServicioActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_tequila");
                startActivity(customIntent);
                finish();
                break;

        }

    }



}
