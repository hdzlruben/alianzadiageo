package com.ioblok.aliadosdiageo.categorias.content_vodka.KetelOne;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;

public class KetelOneServirFragment extends Fragment {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text_title_seccion,text_title_drink,text_content_drink,text_sub_title,text_content_subtitle;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_ciroc_servir, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");

        text_title_seccion = getString(R.string.text_title_seccion);
        text_title_drink = getString(R.string.txt_title_servicio_ciroc);
        text_content_drink = getString(R.string.txt_desc_servicio_ciroc_uno);
        text_sub_title = getString(R.string.txt_subtitle_servicio_ciroc);
        text_content_subtitle =  getString(R.string.txt_content_subtitle_servicio_ciroc);



        DocumentView documentView = (DocumentView) v.findViewById(R.id.text_title_seccion);
        DocumentView documentViewtwo = (DocumentView)v.findViewById(R.id.text_title_drink);
        DocumentView documentViewthree = (DocumentView)v.findViewById(R.id.text_content_drink);
        DocumentView documentViewfour = (DocumentView)v.findViewById(R.id.text_sub_title);
        DocumentView documentViewfive = (DocumentView)v.findViewById(R.id.text_content_subtitle);

        documentView.setText(text_title_seccion);
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.CENTER);
        documentView.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentView.getDocumentLayoutParams().setTextSize(30);
        documentView.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewtwo.setText(text_title_drink);
        documentViewtwo.getDocumentLayoutParams().setTextAlignment(TextAlignment.CENTER);
        documentViewtwo.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewtwo.getDocumentLayoutParams().setTextSize(25);
        documentViewtwo.getDocumentLayoutParams().setTextTypeface(myFont);


        documentViewthree.setText(text_content_drink);
        documentViewthree.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewthree.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewthree.getDocumentLayoutParams().setTextTypeface(myFont);


        documentViewfour.setText(text_sub_title);
        documentViewfour.getDocumentLayoutParams().setTextAlignment(TextAlignment.CENTER);
        documentViewfour.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewfour.getDocumentLayoutParams().setTextSize(20);

        documentViewfour.getDocumentLayoutParams().setTextTypeface(myFont);


        documentViewfive.setText(text_content_subtitle);
        documentViewfour.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewfive.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewfive.getDocumentLayoutParams().setTextTypeface(myFont);





    }

}
