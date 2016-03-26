package com.ioblok.aliadosdiageo.categorias.content_vodka.Smirnoff;

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

public class SmirnoffServirFragment extends Fragment {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text_title_seccion,text_title_drink,text_content_drink,text_sub_title,text_content_subtitle;
    String text_pop_uno,text_pop_dos,text_pop_tres,text_pop_cuatro,text_pop_cinco,text_pop_seis,text_pop_siete,text_pop_ocho;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_smirnoff_servir, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");

        text_title_seccion = getString(R.string.text_title_seccion);
        text_title_drink = getString(R.string.txt_title_servicio_smirnoff);
        text_content_drink =  getString(R.string.txt_desc_servicio_smirnoff_uno);


        DocumentView documentView = (DocumentView) v.findViewById(R.id.text_title_seccion);
        DocumentView documentViewtwo = (DocumentView)v.findViewById(R.id.text_title_drink);
        DocumentView documentViewthree = (DocumentView)v.findViewById(R.id.text_content_drink);

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


    }

}
