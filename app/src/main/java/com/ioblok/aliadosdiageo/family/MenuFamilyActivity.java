package com.ioblok.aliadosdiageo.family;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

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
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;
import com.ioblok.aliadosdiageo.utilis.Constants;

import java.util.ArrayList;

public class MenuFamilyActivity extends AppCompatActivity {

    Button backButton,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    private ArrayList navDrawerItems;
    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    CustomMenuAdapter adapterActivity;
    public View lastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_family);

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
                    Intent intent = new Intent(MenuFamilyActivity.this, DiageoActivity.class);
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
                    Intent intent = new Intent(MenuFamilyActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();
                } else if (position == 6) {
                    Intent intent = new Intent(MenuFamilyActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

        initialize();

        btn_family_zacapa.setOnClickListener(menuFamily);
        btn_family_walker.setOnClickListener(menuFamily);
        btn_family_buchanans.setOnClickListener(menuFamily);
        btn_family_tanqueray.setOnClickListener(menuFamily);
        btn_family_don_julio.setOnClickListener(menuFamily);
        backButton = (Button)this.findViewById(R.id.backButton_diageo);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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


    public void initialize(){
        btn_family_zacapa = (Button) findViewById(R.id.btn_family_zacapa);
        btn_family_walker = (Button) findViewById(R.id.btn_family_walker);
        btn_family_buchanans = (Button) findViewById(R.id.btn_family_buchanans);
        btn_family_tanqueray = (Button) findViewById(R.id.btn_family_tanqueray);
        btn_family_don_julio = (Button) findViewById(R.id.btn_family_don_julio);

    }

    View.OnClickListener menuFamily = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {

                case R.id.btn_family_zacapa:
                    intent = new Intent(MenuFamilyActivity.this, ZacapaActivity.class);
                    break;
                case R.id.btn_family_walker:
                    intent = new Intent(MenuFamilyActivity.this, WalkerActivity.class);
                    break;
                case R.id.btn_family_buchanans:
                    intent = new Intent(MenuFamilyActivity.this, BuchanansActivity.class);
                    break;
                case R.id.btn_family_tanqueray:
                    intent = new Intent(MenuFamilyActivity.this, TanquerayActivity.class);
                    break;
                case R.id.btn_family_don_julio:
                    intent = new Intent(MenuFamilyActivity.this, DonJulioActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_menu_whisky:
                    intent = new Intent(MenuFamilyActivity.this, MenuWhiskyActivity.class);
                    break;
                case R.id.btn_menu_tequila:
                    intent = new Intent(MenuFamilyActivity.this, MenuTequilaActivity.class);
                    break;
                case R.id.btn_menu_ron:
                    intent = new Intent(MenuFamilyActivity.this, MenuRonActivity.class);
                    break;
                case R.id.btn_menu_vodka:
                    intent = new Intent(MenuFamilyActivity.this, MenuVodkaActivity.class);
                    break;
                case R.id.btn_menu_gin:
                    intent = new Intent(MenuFamilyActivity.this, MenuGinActivity.class);
                    break;
                case R.id.btn_menu_licor:
                    intent = new Intent(MenuFamilyActivity.this, MenuLicorActivity.class);
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
                customIntent = new Intent(MenuFamilyActivity.this, MenuActivity.class);
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
                customIntent = new Intent(MenuFamilyActivity.this, ZacapaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_jw:
                customIntent = new Intent(MenuFamilyActivity.this, WalkerActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_b:
                customIntent = new Intent(MenuFamilyActivity.this, BuchanansActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_t:
                customIntent = new Intent(MenuFamilyActivity.this, TanquerayActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_dj:
                customIntent = new Intent(MenuFamilyActivity.this, DonJulioActivity.class);
                startActivity(customIntent);
                finish();
                break;


            //listeners for categories submenu
            case R.id.menu_item_whisky:
                customIntent = new Intent(MenuFamilyActivity.this, MenuWhiskyActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_tequila:
                customIntent = new Intent(MenuFamilyActivity.this, MenuTequilaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_ron:
                customIntent = new Intent(MenuFamilyActivity.this, MenuRonActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_vodka:
                customIntent = new Intent(MenuFamilyActivity.this, MenuVodkaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_gin:
                customIntent = new Intent(MenuFamilyActivity.this, MenuGinActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_licor:
                customIntent = new Intent(MenuFamilyActivity.this, MenuLicorActivity.class);
                startActivity(customIntent);
                finish();
                break;


            //listeners for process submenu
            case R.id.menu_item_intro:
                customIntent = new Intent(MenuFamilyActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_introduccion");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_cognac:
                customIntent = new Intent(MenuFamilyActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_cognac");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_ginebra:
                customIntent = new Intent(MenuFamilyActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_ginebra");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_ron:
                customIntent = new Intent(MenuFamilyActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_ron");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_vodka:
                customIntent = new Intent(MenuFamilyActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_vodka");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_whisky:
                customIntent = new Intent(MenuFamilyActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_whisky");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_tequila:
                customIntent = new Intent(MenuFamilyActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_tequila");
                startActivity(customIntent);
                finish();
                break;

        }

    }

}
