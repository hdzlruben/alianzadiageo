package com.ioblok.aliadosdiageo.diageo;

import android.content.Intent;
import android.graphics.Color;
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
import com.ioblok.aliadosdiageo.utilis.addItemNav;

import java.util.ArrayList;

public class DiageoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    Button backButton,menu_desplegable;
    private DrawerLayout mDrawer;
    private ListView mDrawerOptions;
    private ArrayList navDrawerItems;
    private static final String[] values = {"Diageo", "Familias", "Categorias" ,"Proceso de Elaboracion","Plataformas","Servicio Responsable"};
    private int[] colors = new int[] { 0x30FF0000, 0x300000FF };
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

}
