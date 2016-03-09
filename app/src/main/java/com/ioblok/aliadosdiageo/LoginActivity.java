package com.ioblok.aliadosdiageo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;

public class LoginActivity extends AppCompatActivity {

    EditText pass_user;
    Button btn_init_sesion,btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
    }

    public void initialize(){
        pass_user = (EditText) findViewById(R.id.pass_user);
        btn_init_sesion = (Button) findViewById(R.id.btn_init_sesion);
        btn_register = (Button) findViewById(R.id.btn_register);

    }

    public void initSesion(View v) {

        Intent btns_home = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(btns_home);

       /*if (pass_user.getText().toString().equals("123Abc!")){

           Intent btns_home = new Intent(LoginActivity.this, MenuActivity.class);
           startActivity(btns_home);

       } else {
           Log.e("Fuera", pass_user.getText().toString());
           new MaterialDialog.Builder(this)
                   .title(R.string.txt_error)
                   .content(R.string.txt_error_pass)
                   .positiveText(R.string.txt_cerrar)
                   .theme(Theme.LIGHT)
                   .show();
       }*/
    }

}
