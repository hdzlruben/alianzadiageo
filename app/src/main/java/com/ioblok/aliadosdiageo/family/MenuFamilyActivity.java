package com.ioblok.aliadosdiageo.family;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.MenuActivity;
import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.diageo.DiageoActivity;

public class MenuFamilyActivity extends AppCompatActivity {

    Button btn_back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_family);
        initialize();

        btn_back_home.setOnClickListener(menu);
    }


    public void initialize(){
        btn_back_home = (Button) findViewById(R.id.btn_back_home);
    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_back_home:
                    intent = new Intent(MenuFamilyActivity.this, MenuActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };

}
