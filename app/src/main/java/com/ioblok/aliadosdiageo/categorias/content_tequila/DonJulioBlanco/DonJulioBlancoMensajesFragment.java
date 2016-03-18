package com.ioblok.aliadosdiageo.categorias.content_tequila.DonJulioBlanco;

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

public class DonJulioBlancoMensajesFragment extends Fragment {
    String text,textdos,texttres,title_zacapa_23_uno,title_zacapa_23_dos,title_zacapa_23_tres,title_zacapa_24_tres;
    TextView titleUno;
    TextView titleDos;
    TextView titleTres,titleCuatro;
    String textcuatro;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_don_julio_blanco_mensajes, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");

        text = getString(R.string.title_don_julio_blanco_content_uno);
        textdos = getString(R.string.title_don_julio_blanco_content_dos);
        texttres = getString(R.string.title_don_julio_blanco_content_tres);

        title_zacapa_23_uno = getString(R.string.title_don_julio_blanco_one);
        title_zacapa_23_dos = getString(R.string.title_don_julio_blanco_dos);
        title_zacapa_23_tres = getString(R.string.title_don_julio_blanco_tres);

        titleUno = (TextView)v.findViewById(R.id.title_zacapa_23_one);
        titleUno.setText(title_zacapa_23_uno);
        titleUno.setTextColor(0xFF333333);
        titleUno.setTypeface(myFont);

        titleDos = (TextView)v.findViewById(R.id.title_zacapa_23_dos);
        titleDos.setText(title_zacapa_23_dos);
        titleDos.setTextColor(0xFF333333);
        titleDos.setTypeface(myFont);

        titleTres = (TextView)v.findViewById(R.id.title_zacapa_23_tres);
        titleTres.setText(title_zacapa_23_tres);
        titleTres.setTextColor(0xFF333333);
        titleTres.setTypeface(myFont);


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
