package com.ioblok.aliadosdiageo.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio1942.DonJulio1942ContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulio70.DonJulio70ContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioAnejo.DonJulioAnejoContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioBlanco.DonJulioBlancoContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReal.DonJulioRealContainerActivity;
import com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioReposado.DonJulioReposadoContainerActivity;

public class MenuTequilaActivity extends AppCompatActivity {

    Button backButton_categorias_int,btn_donjulio_anejado,btn_donjulio_blanco,btn_donjulio_reposado,btn_donjulio_70,btn_donjulio_1942,btn_donjulio_real;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tequila);

        backButton_categorias_int = (Button)this.findViewById(R.id.backButton_categorias_int);
        backButton_categorias_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        initialize();

        btn_donjulio_blanco.setOnClickListener(menu);
        btn_donjulio_reposado.setOnClickListener(menu);
        btn_donjulio_70.setOnClickListener(menu);
        btn_donjulio_1942.setOnClickListener(menu);
        btn_donjulio_real.setOnClickListener(menu);
        btn_donjulio_anejado.setOnClickListener(menu);


    }

    public void initialize(){
        btn_donjulio_blanco = (Button) findViewById(R.id.btn_donjulio_blanco);
        btn_donjulio_anejado = (Button) findViewById(R.id.btn_donjulio_anejado);
        btn_donjulio_reposado = (Button) findViewById(R.id.btn_donjulio_reposado);
        btn_donjulio_70 = (Button) findViewById(R.id.btn_donjulio_70);
        btn_donjulio_1942 = (Button) findViewById(R.id.btn_donjulio_1942);
        btn_donjulio_real = (Button) findViewById(R.id.btn_donjulio_real);

    }

    View.OnClickListener menu = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();

            switch (v.getId()) {
                case R.id.btn_donjulio_blanco:
                    intent = new Intent(MenuTequilaActivity.this, DonJulioBlancoContainerActivity.class);
                    break;
                case R.id.btn_donjulio_anejado:
                    intent = new Intent(MenuTequilaActivity.this, DonJulioAnejoContainerActivity.class);
                    break;
                case R.id.btn_donjulio_reposado:
                    intent = new Intent(MenuTequilaActivity.this, DonJulioReposadoContainerActivity.class);
                    break;
                case R.id.btn_donjulio_70:
                    intent = new Intent(MenuTequilaActivity.this, DonJulio70ContainerActivity.class);
                    break;
                case R.id.btn_donjulio_1942:
                    intent = new Intent(MenuTequilaActivity.this, DonJulio1942ContainerActivity.class);
                    break;
                case R.id.btn_donjulio_real:
                    intent = new Intent(MenuTequilaActivity.this, DonJulioRealContainerActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };
}
