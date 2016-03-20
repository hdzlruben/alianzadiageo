package com.ioblok.aliadosdiageo;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.adapter.AdapterActivity;
import com.ioblok.aliadosdiageo.categorias.MenuCategoriasActivity;
import com.ioblok.aliadosdiageo.diageo.DiageoActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;
import com.ioblok.aliadosdiageo.plataformas.procesos.MenuPlataformasActivity;
import com.ioblok.aliadosdiageo.procesos.MenuProcesosActivity;
import com.ioblok.aliadosdiageo.servicio.MenuServicioActivity;
import com.ioblok.aliadosdiageo.utilis.Constants;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class HelpActivity extends AppCompatActivity {

    Button backButton;

    String text,textdos,texttres,textcuatro,textcinco,textseis,textsiete;

    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    public String[] values = {"DIAGEO", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    AdapterActivity adapterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        backButton = (Button)this.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


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
                    Intent intent = new Intent(HelpActivity.this, HelpActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 1)
                {
                    Intent intent = new Intent(HelpActivity.this, MenuFamilyActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 2)
                {
                    Intent intent = new Intent(HelpActivity.this, MenuCategoriasActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (position == 3)
                {
                    Intent intent = new Intent(HelpActivity.this, MenuProcesosActivity.class);
                    startActivity(intent);
                    finish();

                }
                else if (position == 4)
                {
                    Intent intent = new Intent(HelpActivity.this, MenuPlataformasActivity.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    Intent intent = new Intent(HelpActivity.this, MenuServicioActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

        initialize();

    }

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getAssets(), "acaslonpro-regular-webfont.ttf");

        text = getString(R.string.txt_help_content_video);
        textdos = getString(R.string.txt_help_content_mensajes);
        texttres = getString(R.string.txt_help_content_tour);
        textcuatro = getString(R.string.txt_help_content_servir);
        textcinco = getString(R.string.txt_help_content_regresar);
        textseis = getString(R.string.txt_help_content_inicio);
        textsiete = getString(R.string.txt_help_content_navegador);

        TextView uno = (TextView)findViewById(R.id.txt_help_uno);
        uno.setText(text);
        uno.setTypeface(myFont);
        uno.setTextColor(0xFF333333);

        TextView dos = (TextView)findViewById(R.id.txt_help_dos);
        dos.setText(text);
        dos.setTypeface(myFont);
        dos.setTextColor(0xFF333333);

        TextView tres = (TextView)findViewById(R.id.txt_help_tres);
        tres.setText(text);
        tres.setTypeface(myFont);
        tres.setTextColor(0xFF333333);

        TextView cuatro = (TextView)findViewById(R.id.txt_help_cuatro);
        cuatro.setText(text);
        cuatro.setTypeface(myFont);
        cuatro.setTextColor(0xFF333333);

        TextView cinco = (TextView)findViewById(R.id.txt_help_cinco);
        cinco.setText(text);
        cinco.setTypeface(myFont);
        cinco.setTextColor(0xFF333333);

        TextView seis = (TextView)findViewById(R.id.txt_help_seis);
        seis.setText(text);
        seis.setTypeface(myFont);
        seis.setTextColor(0xFF333333);

        TextView siete = (TextView)findViewById(R.id.txt_help_siete);
        siete.setText(text);
        siete.setTypeface(myFont);
        siete.setTextColor(0xFF333333);

    }

}
