package com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReposado;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class DonJulioReposadoContainerActivity extends AppCompatActivity {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dj_r);
        backButton_categorias_int = (Button)this.findViewById(R.id.backButton_categorias_int);
        backButton_categorias_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void initialize(){

    }

}
