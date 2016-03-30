package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.ioblok.aliadosdiageo.MenuActivity;
import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.adapter.AdapterActivity;
import com.ioblok.aliadosdiageo.adapter.CustomMenuAdapter;
import com.ioblok.aliadosdiageo.contentfamily.BuchanansActivity;
import com.ioblok.aliadosdiageo.contentfamily.DonJulioActivity;
import com.ioblok.aliadosdiageo.contentfamily.TanquerayActivity;
import com.ioblok.aliadosdiageo.contentfamily.WalkerActivity;
import com.ioblok.aliadosdiageo.contentfamily.ZacapaActivity;
import com.ioblok.aliadosdiageo.diageo.DiageoActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;
import com.ioblok.aliadosdiageo.models.ListModelMenu;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;
import com.ioblok.aliadosdiageo.utilis.Constants;
import com.ioblok.aliadosdiageo.utilis.CustomTextViewMenu;

import java.util.ArrayList;

public class MenuCategoriasActivity extends AppCompatActivity {

    Button btn_back_home, btn_menu_whisky, btn_menu_tequila, btn_menu_ron, btn_menu_vodka, btn_menu_gin, btn_menu_licor;

    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    CustomMenuAdapter adapterActivity;
    public View lastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_categorias);

        btn_back_home = (Button) this.findViewById(R.id.backButton_categorias);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

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
                    Intent intent = new Intent(MenuCategoriasActivity.this, DiageoActivity.class);
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
                    Intent intent = new Intent(MenuCategoriasActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();
                } else if (position == 6) {
                    Intent intent = new Intent(MenuCategoriasActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

        initialize();

        btn_menu_whisky.setOnClickListener(menu);
        btn_menu_tequila.setOnClickListener(menu);
        btn_menu_ron.setOnClickListener(menu);
        btn_menu_vodka.setOnClickListener(menu);
        btn_menu_gin.setOnClickListener(menu);
        btn_menu_licor.setOnClickListener(menu);

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

    public void initialize() {
        btn_menu_whisky = (Button) findViewById(R.id.btn_menu_whisky);
        btn_menu_tequila = (Button) findViewById(R.id.btn_menu_tequila);
        btn_menu_ron = (Button) findViewById(R.id.btn_menu_ron);
        btn_menu_vodka = (Button) findViewById(R.id.btn_menu_vodka);
        btn_menu_gin = (Button) findViewById(R.id.btn_menu_gin);
        btn_menu_licor = (Button) findViewById(R.id.btn_menu_licor);
    }

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_menu_whisky:
                    intent = new Intent(MenuCategoriasActivity.this, MenuWhiskyActivity.class);
                    break;
                case R.id.btn_menu_tequila:
                    intent = new Intent(MenuCategoriasActivity.this, MenuTequilaActivity.class);
                    break;
                case R.id.btn_menu_ron:
                    intent = new Intent(MenuCategoriasActivity.this, MenuRonActivity.class);
                    break;
                case R.id.btn_menu_vodka:
                    intent = new Intent(MenuCategoriasActivity.this, MenuVodkaActivity.class);
                    break;
                case R.id.btn_menu_gin:
                    intent = new Intent(MenuCategoriasActivity.this, MenuGinActivity.class);
                    break;
                case R.id.btn_menu_licor:
                    intent = new Intent(MenuCategoriasActivity.this, MenuLicorActivity.class);
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
                customIntent = new Intent(MenuCategoriasActivity.this, MenuActivity.class);
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
                customIntent = new Intent(MenuCategoriasActivity.this, ZacapaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_jw:
                customIntent = new Intent(MenuCategoriasActivity.this, WalkerActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_b:
                customIntent = new Intent(MenuCategoriasActivity.this, BuchanansActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_t:
                customIntent = new Intent(MenuCategoriasActivity.this, TanquerayActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_dj:
                customIntent = new Intent(MenuCategoriasActivity.this, DonJulioActivity.class);
                startActivity(customIntent);
                finish();
                break;


            //listeners for categories submenu
            case R.id.menu_item_whisky:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuWhiskyActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_tequila:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuTequilaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_ron:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuRonActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_vodka:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuVodkaActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_gin:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuGinActivity.class);
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_licor:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuLicorActivity.class);
                startActivity(customIntent);
                finish();
                break;


            //listeners for process submenu
            case R.id.menu_item_intro:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_introduccion");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_cognac:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_cognac");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_ginebra:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_ginebra");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_ron:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_ron");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_vodka:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_vodka");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_whisky:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_whisky");
                startActivity(customIntent);
                finish();
                break;
            case R.id.menu_item_process_tequila:
                customIntent = new Intent(MenuCategoriasActivity.this, MenuProcesosActivity.class);
                customIntent.putExtra("videoID", "proceso_tequila");
                startActivity(customIntent);
                finish();
                break;

        }

    }

}
