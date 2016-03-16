package com.ioblok.aliadosdiageo.categorias.content_whisky;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;

public class JwBlueLabelMensajesFragment extends Fragment {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text,textdos,texttres;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_jw_blue_label_mensajes, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");
        text = getString(R.string.txt_bl_one);
        textdos = getString(R.string.txt_bl_two);
        texttres = getString(R.string.txt_bl_three);

        DocumentView documentView = (DocumentView)v.findViewById(R.id.txt_bl_one);
        DocumentView documentViewtwo = (DocumentView)v.findViewById(R.id.txt_bl_two);
        DocumentView documentViewthree = (DocumentView)v.findViewById(R.id.txt_bl_three);

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
