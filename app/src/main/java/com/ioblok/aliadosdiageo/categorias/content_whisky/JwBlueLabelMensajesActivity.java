package com.ioblok.aliadosdiageo.categorias.content_whisky;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;

public class JwBlueLabelMensajesActivity extends AppCompatActivity {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text,textdos,texttres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jw_blue_label_mensajes);
        backButton_categorias_int = (Button)this.findViewById(R.id.backButton_categorias_int);
        backButton_categorias_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initialize();
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getAssets(), "acaslonpro-regular-webfont.ttf");
        text = getString(R.string.txt_bl_one);
        textdos = getString(R.string.txt_bl_two);
        texttres = getString(R.string.txt_bl_three);

        DocumentView documentView = (DocumentView)findViewById(R.id.txt_bl_one);
        DocumentView documentViewtwo = (DocumentView)findViewById(R.id.txt_bl_two);
        DocumentView documentViewthree = (DocumentView)findViewById(R.id.txt_bl_three);

        documentView.setText(text);
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentView.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentView.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewtwo.setText(textdos);
        documentViewtwo.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewtwo.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentViewtwo.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewthree.setText(texttres);
        documentViewthree.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewthree.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentViewthree.getDocumentLayoutParams().setTextTypeface(myFont);
    }

}
