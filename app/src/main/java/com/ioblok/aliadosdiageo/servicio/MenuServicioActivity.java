package com.ioblok.aliadosdiageo.servicio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class MenuServicioActivity extends AppCompatActivity {

    Button backButton_servicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_servicio);
        backButton_servicio = (Button)this.findViewById(R.id.backButton_servicio);

        backButton_servicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
