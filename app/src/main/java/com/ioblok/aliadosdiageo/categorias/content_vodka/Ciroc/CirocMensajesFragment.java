package com.ioblok.aliadosdiageo.categorias.content_vodka.Ciroc;

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

public class CirocMensajesFragment extends Fragment {

    String text;
    String textdos;
    String texttres;
    String title_uno_ciroc;
    String title_dos_ciroc;
    String title_tres_ciroc;

    TextView title_id_uno_ciroc, title_id_dos_ciroc, title_id_tres_ciroc ;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_ciroc_mensajes, null);
        initialize();
        return v;
    }

    public void initialize(){
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");
        text = getString(R.string.txt_mensaje_ciroc_uno);
        textdos = getString(R.string.txt_mensaje_ciroc_dos);
        texttres = getString(R.string.txt_mensaje_ciroc_tres);

        title_uno_ciroc = getString(R.string.txt_title_mensaje_ciroc_uno);
        title_dos_ciroc = getString(R.string.txt_title_mensaje_ciroc_dos);
        title_tres_ciroc = getString(R.string.txt_title_mensaje_ciroc_tres);

        title_id_uno_ciroc = (TextView)v.findViewById(R.id.title_one_ciroc);
        title_id_dos_ciroc = (TextView)v.findViewById(R.id.title_two_ciroc);
        title_id_tres_ciroc = (TextView)v.findViewById(R.id.title_three_ciroc);

        title_id_uno_ciroc.setText(title_uno_ciroc);
        title_id_uno_ciroc.setTypeface(myFont);
        title_id_uno_ciroc.setTextColor(0xFF333333);

        title_id_dos_ciroc.setText(title_dos_ciroc);
        title_id_dos_ciroc.setTypeface(myFont);
        title_id_dos_ciroc.setTextColor(0xFF333333);

        title_id_tres_ciroc.setText(title_tres_ciroc);
        title_id_tres_ciroc.setTypeface(myFont);
        title_id_tres_ciroc.setTextColor(0xFF333333);

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
