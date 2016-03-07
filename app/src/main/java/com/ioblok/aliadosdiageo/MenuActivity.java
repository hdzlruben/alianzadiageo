package com.ioblok.aliadosdiageo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.ioblok.aliadosdiageo.diageo.DiageoActivity;
import com.ioblok.aliadosdiageo.family.MenuFamilyActivity;

public class MenuActivity extends AppCompatActivity {

    Button btn_diageo,btn_family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initialize();

        btn_diageo.setOnClickListener(menu);
        btn_family.setOnClickListener(menu);
    }


    public void initialize(){
        btn_diageo = (Button) findViewById(R.id.btn_diageo);
        btn_family = (Button) findViewById(R.id.btn_family);
    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_diageo:
                    intent = new Intent(MenuActivity.this, DiageoActivity.class);
                    break;

                case R.id.btn_family:
                    intent = new Intent(MenuActivity.this, MenuFamilyActivity.class);
                    break;
            }

            startActivity(intent);

        }
    };

}
