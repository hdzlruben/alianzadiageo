package com.ioblok.aliadosdiageo.categorias.content_whisky;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;

public class JwBlueLabelServirActivity extends AppCompatActivity {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text_title_seccion,text_title_drink,text_content_drink,text_sub_title,text_content_subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jw_blue_label_servir);
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
        text_title_seccion = getString(R.string.text_title_seccion);
        text_title_drink = getString(R.string.text_title_drink);
        text_content_drink =  getString(R.string.text_content_drink);
        text_sub_title =  getString(R.string.text_sub_title);
        text_content_subtitle =  getString(R.string.text_content_subtitle);


        DocumentView documentView = (DocumentView)findViewById(R.id.text_title_seccion);
        DocumentView documentViewtwo = (DocumentView)findViewById(R.id.text_title_drink);
        DocumentView documentViewthree = (DocumentView)findViewById(R.id.text_content_drink);
        DocumentView documentViewfour = (DocumentView)findViewById(R.id.text_sub_title);
        DocumentView documentViewfive = (DocumentView)findViewById(R.id.text_content_subtitle);

        documentView.setText(text_title_seccion);
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.CENTER);
        documentView.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentView.getDocumentLayoutParams().setTextSize(30);

        documentView.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewtwo.setText(text_title_drink);
        documentViewtwo.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewtwo.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewtwo.getDocumentLayoutParams().setTextSize(20);

        documentViewtwo.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewthree.setText(text_content_drink);
        documentViewthree.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewthree.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentViewthree.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewfour.setText(text_sub_title);
        documentViewfour.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewfour.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewfour.getDocumentLayoutParams().setTextSize(20);

        documentViewfour.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewfive.setText(text_content_subtitle);
        documentViewfive.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewfive.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentViewfive.getDocumentLayoutParams().setTextTypeface(myFont);
    }

}
