package com.ioblok.aliadosdiageo.categorias.content_ron.CaptainMorganBlack;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;

public class CaptainMorganBlackMensajesFragment extends Fragment {
    String text,textdos,texttres,title_zacapa_23_uno,title_zacapa_23_dos,title_zacapa_23_tres;
    TextView titleUno,titleDos,titleTres;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_captain_morgan_black_mensajes, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");

        text = getString(R.string.txt_captain_morgan_black_uno);
        textdos = getString(R.string.txt_captain_morgan_black_dos);
        texttres = getString(R.string.txt_captain_morgan_black_tres);


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