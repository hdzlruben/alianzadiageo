package com.ioblok.aliadosdiageo.contentfamily;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;

public class DonJulioActivity extends AppCompatActivity {


    Button backButton_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_don_julio);

        backButton_desc = (Button)this.findViewById(R.id.btn_back_desc);
        backButton_desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
