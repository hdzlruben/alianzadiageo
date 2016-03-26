package com.ioblok.aliadosdiageo.categorias.content_vodka.KetelOne;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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
        v = inflater.inflate(R.layout.fragment_ketel_one_servir, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");

        text_title_seccion = getString(R.string.text_title_seccion);
        text_title_drink = getString(R.string.txt_subtitle_servir_ko);
        text_content_drink = getString(R.string.txt_content_servir_ko);

        TextView text_title_seccion_ = (TextView)v.findViewById(R.id.text_title_seccion);
        text_title_seccion_.setText(text_title_seccion);
        text_title_seccion_.setTextSize(30);
        text_title_seccion_.setTextColor(0xFF333333);
        text_title_seccion_.setTypeface(myFont);

        DocumentView documentViewtwo = (DocumentView)v.findViewById(R.id.text_title_drink);
        DocumentView documentViewthree = (DocumentView)v.findViewById(R.id.text_content_drink);

        documentViewtwo.setText(text_title_drink);
        documentViewtwo.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewtwo.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewtwo.getDocumentLayoutParams().setTextSize(25);
        documentViewtwo.getDocumentLayoutParams().setTextTypeface(myFont);


        documentViewthree.setText(text_content_drink);
        documentViewthree.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewthree.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewthree.getDocumentLayoutParams().setTextTypeface(myFont);


    }

}
