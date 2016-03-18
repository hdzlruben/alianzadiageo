package com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganBlack;

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

public class CaptainMorganBlackServirFragment extends Fragment {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text_title_seccion,text_subtitle_seccion,text_subtitle_seccion_dos,text_content_subtitle_dos,text_content_drink,text_sub_title,text_content_subtitle;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_captain_morgan_black_servir, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");
        text_title_seccion = getString(R.string.text_title_seccion);
        text_subtitle_seccion =  getString(R.string.text_subtitle_seccion_capitan_morgan_black);


        DocumentView documentView = (DocumentView) v.findViewById(R.id.text_title_seccion);
        DocumentView documentViewTwo = (DocumentView) v.findViewById(R.id.text_subtitle_seccion);

        documentView.setText(text_title_seccion);
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.CENTER);
        documentView.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentView.getDocumentLayoutParams().setTextSize(30);

        documentView.getDocumentLayoutParams().setTextTypeface(myFont);

        documentViewTwo.setText(text_subtitle_seccion);
        documentViewTwo.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentViewTwo.getDocumentLayoutParams().setTextColor(0xFF333333);
        documentViewTwo.getDocumentLayoutParams().setTextSize(20);

        documentViewTwo.getDocumentLayoutParams().setTextTypeface(myFont);

    }

}
