package com.ioblok.aliadosdiageo.categorias.content_whisky.JwRedLabel;

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

public class JwRedLabelServirFragment extends Fragment {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text_title_seccion,text_title_drink,txt_como_tomar_jw_red_label,txt_como_tomar_jw_red_label_cuatro,txt_como_tomar_jw_red_label_tres,txt_como_tomar_jw_red_label_dos;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_jw_red_label_servir, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");
        text_title_seccion = getString(R.string.text_title_seccion);
        txt_como_tomar_jw_red_label =  getString(R.string.txt_como_tomar_jw_red_label);
        txt_como_tomar_jw_red_label_dos =  getString(R.string.txt_como_content_title_jw_red_label);
        txt_como_tomar_jw_red_label_tres =  getString(R.string.txt_como_subtitle_jw_red_label);
        txt_como_tomar_jw_red_label_cuatro =  getString(R.string.txt_como_content_subtitle_jw_red_label);

        DocumentView documentView = (DocumentView) v.findViewById(R.id.text_title_seccion);
        DocumentView documentViewone = (DocumentView)v.findViewById(R.id.text_title_drink);
        DocumentView documentViewtwo = (DocumentView)v.findViewById(R.id.text_title_content_drink);
        DocumentView documentViewthree = (DocumentView)v.findViewById(R.id.text_subtitle_drink);
        DocumentView documentViewfour = (DocumentView)v.findViewById(R.id.text_subtitle_content_drink);


        documentView.setText(text_title_seccion);
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.CENTER);
        documentView.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentView.getDocumentLayoutParams().setTextSize(30);
        documentView.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewone.setText(txt_como_tomar_jw_red_label);
        documentViewone.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewone.getDocumentLayoutParams().setTextTypeface(myFont);
        documentViewone.getDocumentLayoutParams().setTextSize(28);

        documentViewtwo.setText(txt_como_tomar_jw_red_label_dos);
        documentViewtwo.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewtwo.getDocumentLayoutParams().setTextTypeface(myFont);


        documentViewthree.setText(txt_como_tomar_jw_red_label_tres);
        documentViewthree.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewthree.getDocumentLayoutParams().setTextTypeface(myFont);
        documentViewthree.getDocumentLayoutParams().setTextSize(25);


        documentViewfour.setText(txt_como_tomar_jw_red_label_cuatro);
        documentViewfour.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewfour.getDocumentLayoutParams().setTextTypeface(myFont);

    }

}
