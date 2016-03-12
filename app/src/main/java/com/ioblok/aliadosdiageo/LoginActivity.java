package com.ioblok.aliadosdiageo;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
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
import com.ioblok.aliadosdiageo.utilis.Constants;
import com.ioblok.aliadosdiageo.utilis.URLVideosDataBase;

import java.io.File;
import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class LoginActivity extends AppCompatActivity {

    EditText pass_user;
    Button btn_init_sesion, btn_register;

    Realm realm;
    Boolean showAlert = true;
    ProgressDialog mProgressDialog;

    /**
     * Add video URL
     **/

    private long enqueue;
    private DownloadManager dm;
    public String url_video = "";
    public ArrayList<URLVideosDataBase> arrayVideos;
    public String base_url = "http://ioblok.com.mx/Testing/video/";
    public String[] videos =
            {"file.txt",
                    "categorias_bc_12",
                    "categorias_bc_master",
                    "categorias_bulleit",
                    "categorias_jb",
                    "categorias_old_par",
                    "categorias_whisky_bc_18",
                    "categorias_whisky_bl",
                    "categorias_whisky_db",
                    "categorias_whisky_kg",
                    "categorias_whisky_pl",
                    "categorias_whisky_rl",
                    "consumo_responsable",
                    "diajeo_aliados",
                    "diajeo_aliados_new",
                    "familia_bn",
                    "familia_jw",
                    "familia_tr",
                    "plataforma",
                    "proceso_cognac",
                    "proceso_ginebra",
                    "proceso_introduccion",
                    "proceso_ron",
                    "proceso_tequila",
                    "proceso_vodka",
                    "proceso_whisky",
                    "video_dj_video"};

    public ArrayList<String> replaceURLVideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mProgressDialog = new ProgressDialog(LoginActivity.this);
        mProgressDialog.setMessage(this.getString(R.string.txt_download_videos));

        arrayVideos = new ArrayList<>();
        replaceURLVideos = new ArrayList<>();

        realm = Realm.getInstance(getBaseContext());
        realm.beginTransaction();

        //for (int i = 0; i < videos.length; i--) {
        for (int i = 0; i < 2; i++) {
            File file = new File(getBaseContext().getFilesDir(), "video" + Integer.toString(i));
            //Log.e("FILE", file.toString());

            RealmResults<URLVideosDataBase> validate = realm.where(URLVideosDataBase.class)
                    .equalTo("urlVideo", videos[i]).findAll();

            if (validate.isEmpty()) {
                URLVideosDataBase urlVideos = realm.createObject(URLVideosDataBase.class);
                urlVideos.setDownloaded(false);
                urlVideos.setUrlVideo(base_url + videos[i]);
                urlVideos.setUrlFileStorage(videos[i]);
            }
            //http://ioblok.com.mx/Testing/video/video.mp4
        }
        realm.commitTransaction();

        RealmResults<URLVideosDataBase> results = realm.where(URLVideosDataBase.class).equalTo("downloaded", false).findAll();

        for (int i = 0; i < results.size(); i++) {

            URLVideosDataBase u = results.get(i);
            Log.e("URL", u.getUrlVideo());
            Log.e("boolena", u.isDownloaded() + "");
            Log.e("STORAGE", u.getUrlFileStorage());
            arrayVideos.add(u);
            // ... do something with the object ...
        }

        BroadcastReceiver receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                Log.e("ACTION", action);

                if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action)) {
                    long downloadId = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, 0);
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(enqueue);
                    Cursor c = dm.query(query);
                    if (c.moveToFirst()) {
                        int columnIndex = c
                                .getColumnIndex(DownloadManager.COLUMN_STATUS);
                        if (DownloadManager.STATUS_SUCCESSFUL == c
                                .getInt(columnIndex)) {
                            //ImageView view = (ImageView) findViewById(R.id.imageView1);
                            String uriString = c.getString(c
                                    .getColumnIndex(DownloadManager.COLUMN_LOCAL_URI));
                            Log.e("String path", uriString);
                            replaceURLVideos.add(uriString);
                            Constants.setBaseURL(uriString);
                            //view.setImageURI(Uri.parse(uriString));
                        }
                    }
                }
            }



        };

        registerReceiver(receiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));

        initialize();
    }

    public void showProgress(boolean show, boolean flag) {

        if (show && flag) {
            mProgressDialog.setCancelable(false);
            if (!mProgressDialog.isShowing())
                mProgressDialog.show();
        } else {
            Log.e("TAG", " " + mProgressDialog.isShowing());
            mProgressDialog.setCancelable(true);
            if (mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }
        }

        if(!show && !flag){
            Intent btns_home = new Intent(LoginActivity.this, MenuActivity.class);
            startActivity(btns_home);
        }
    }

    /*private void displayAlert()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("La funcionalidad de videos sólo estará disponible hasta que la descarga termine").setCancelable(
                false).setPositiveButton("SI",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }*/

    public void initialize() {
        pass_user = (EditText) findViewById(R.id.pass_user);
        btn_init_sesion = (Button) findViewById(R.id.btn_init_sesion);
        btn_register = (Button) findViewById(R.id.btn_register);

    }

    public void initSesion(View v) {

        Intent btns_home = new Intent(LoginActivity.this, MenuActivity.class);
        //dowloadVideos();
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

    public void dowloadVideos() {
        dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);

        if (!arrayVideos.isEmpty()) {

            showProgress(true, true);

            for (URLVideosDataBase videos : arrayVideos) {


                DownloadManager.Request request = new DownloadManager.Request(
                        Uri.parse(videos.getUrlVideo()));
                enqueue = dm.enqueue(request);
                
            }

            //showProgress(false, false);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }

}
