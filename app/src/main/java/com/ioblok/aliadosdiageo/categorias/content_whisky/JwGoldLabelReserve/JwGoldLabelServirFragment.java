package com.ioblok.aliadosdiageo.categorias.content_whisky.JwGoldLabelReserve;

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

public class JwGoldLabelServirFragment extends Fragment {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text_title_seccion,text_title_drink,text_content_drink,text_subtitle_drink,text_content_uno_drink,text_content_dosdrink;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_jw_gold_label_servir, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");
        text_title_seccion = getString(R.string.text_title_seccion);
        text_title_drink =  getString(R.string.txt_como_tomar_title_jw_gold_label);
        text_subtitle_drink =  getString(R.string.txt_como_tomar_subtitle_jw_gold_label);
        text_content_uno_drink =  getString(R.string.txt_como_tomar_contenido_jw_gold_label);
        text_content_dosdrink =  getString(R.string.txt_como_tomar_contenido_dos_jw_gold_label);

        DocumentView documentView = (DocumentView) v.findViewById(R.id.text_title_seccion);
        DocumentView documentViewone = (DocumentView)v.findViewById(R.id.text_title_content_drink);
        DocumentView documentViewtwo = (DocumentView)v.findViewById(R.id.text_first_subtitle_content_drink);
        DocumentView documentViewthree = (DocumentView)v.findViewById(R.id.text_content_uno_drink);
        DocumentView documentViewfour = (DocumentView)v.findViewById(R.id.text_content_dos_drink);

        documentView.setText(text_title_seccion);
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.CENTER);
        documentView.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentView.getDocumentLayoutParams().setTextSize(30);

        documentView.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewone.setText(text_title_drink);
        documentViewone.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewone.getDocumentLayoutParams().setTextSize(25);

        documentViewone.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewtwo.setText(text_subtitle_drink);
        documentViewtwo.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewtwo.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentViewtwo.getDocumentLayoutParams().setTextTypeface(myFont);


        documentViewthree.setText(text_content_uno_drink);
        documentViewthree.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewthree.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentViewthree.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewfour.setText(text_content_dosdrink);
        documentViewfour.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewfour.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentViewfour.getDocumentLayoutParams().setTextTypeface(myFont);

    }

}
