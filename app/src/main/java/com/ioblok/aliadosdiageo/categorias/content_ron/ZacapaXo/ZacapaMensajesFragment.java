package com.ioblok.aliadosdiageo.categorias.content_ron.ZacapaXo;

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

public class ZacapaMensajesFragment extends Fragment {
    String text,textdos,texttres, txt_title_uno, txt_title_dos, txt_title_tres;
    TextView title_zacapa_xo_one, title_zacapa_xo_dos, title_zacapa_xo_tres;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_zacapa_xo_mensajes, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");
        text = getString(R.string.title_zacapa_xo_content_uno);
        textdos = getString(R.string.title_zacapa_xo_content_dos);
        texttres = getString(R.string.title_zacapa_xo_content_tres);

        txt_title_uno  = getString(R.string.title_zacapa_xo_uno);;
        txt_title_dos  = getString(R.string.title_zacapa_xo_dos);;
        txt_title_tres  = getString(R.string.title_zacapa_xo_tres);;


        title_zacapa_xo_one = (TextView)v.findViewById(R.id.title_zacapa_uno);
        title_zacapa_xo_one.setText(txt_title_uno);

        title_zacapa_xo_dos = (TextView)v.findViewById(R.id.title_zacapa_dos);
        title_zacapa_xo_dos.setText(txt_title_dos);

        title_zacapa_xo_tres = (TextView)v.findViewById(R.id.title_zacapa_tres);
        title_zacapa_xo_tres.setText(txt_title_tres);



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
