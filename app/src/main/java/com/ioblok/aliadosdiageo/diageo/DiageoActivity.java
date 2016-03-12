package com.ioblok.aliadosdiageo.diageo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
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
import android.widget.Toast;

import com.ioblok.aliadosdiageo.MenuActivity;
import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.adapter.AdapterActivity;
import com.ioblok.aliadosdiageo.utilis.addItemNav;

import java.util.ArrayList;

public class DiageoActivity extends AppCompatActivity{
    Button backButton,menu_desplegable;

    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;

    AdapterActivity adapterActivity;

    private ArrayList navDrawerItems;
    public String[] values = {"DIAGEO", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    Integer[] imageId = {
            R.drawable.arrow_back,
            R.drawable.icon_home,
            R.drawable.close
    };
    //private String[] values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diageo);

        backButton = (Button)this.findViewById(R.id.backButton_diageo);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mDrawerOptions = (ListView) findViewById(R.id.left_drawer);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        adapterActivity = new AdapterActivity(this,values);
        mDrawerOptions.setAdapter(adapterActivity);

        mDrawerOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> item, View view, int posicion, long id) {
                Toast.makeText(getApplicationContext(), "Pulsado " + posicion, Toast.LENGTH_SHORT).show();
            }
        });

        /*mDrawerOptions.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values));
        mDrawerOptions.setOnItemClickListener(this);*/
        
    }

    /*@Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "Pulsado " + values[i], Toast.LENGTH_SHORT).show();
        mDrawer.closeDrawers();
    }*/

    /*@Override
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
    }*/

    public void openMenu(View v) {
        mDrawer.openDrawer(mDrawerOptions);
    }

}
