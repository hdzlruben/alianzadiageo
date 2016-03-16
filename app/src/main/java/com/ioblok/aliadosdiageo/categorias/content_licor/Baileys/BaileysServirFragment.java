package com.ioblok.aliadosdiageo.categorias.content_licor.Baileys;

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

public class BaileysServirFragment extends Fragment {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text_title_seccion,text_title_drink,text_content_drink,text_sub_title,text_content_subtitle;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_baileys_servir, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");
        text_title_seccion = getString(R.string.text_title_seccion);
        text_content_drink =  getString(R.string.parrafo_uno_como_servir_baileys);
        text_content_subtitle =  getString(R.string.parrafo_dos_como_servir_baileys);


        DocumentView documentView = (DocumentView) v.findViewById(R.id.text_title_seccion);
        DocumentView documentViewthree = (DocumentView)v.findViewById(R.id.text_content_drink);
        DocumentView documentViewfive = (DocumentView)v.findViewById(R.id.text_content_subtitle);

        documentView.setText(text_title_seccion);
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.CENTER);
        documentView.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentView.getDocumentLayoutParams().setTextSize(30);

        documentView.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewthree.setText(text_content_drink);
        documentViewthree.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewthree.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentViewthree.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewfive.setText(text_content_subtitle);
        documentViewfive.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewfive.getDocumentLayoutParams().setTextColor(0xFF333333);

        documentViewfive.getDocumentLayoutParams().setTextTypeface(myFont);
    }

}
