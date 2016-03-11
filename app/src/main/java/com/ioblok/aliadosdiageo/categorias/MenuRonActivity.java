package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class MenuRonActivity extends AppCompatActivity {

    Button backButton_categorias_int,btn_captain_morgan,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ron);

        backButton_categorias_int = (Button)this.findViewById(R.id.backButton_categorias_int);
        backButton_categorias_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initialize();
        btn_captain_morgan.setOnClickListener(menu);

    }

    public void initialize(){
        btn_captain_morgan = (Button) findViewById(R.id.btn_captain_morgan);
    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_captain_morgan:
                    intent = new Intent(MenuRonActivity.this, CaptainMorganContainerActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };

}
