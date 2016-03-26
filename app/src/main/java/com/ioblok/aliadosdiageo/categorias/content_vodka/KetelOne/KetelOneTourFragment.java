package com.ioblok.aliadosdiageo.categorias.content_vodka.KetelOne;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;

public class KetelOneTourFragment extends Fragment {

    View v;
    String text_pop_uno,text_pop_dos,text_pop_tres,text_pop_cuatro,text_pop_cinco,text_pop_seis,text_pop_siete,text_pop_ocho;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v = inflater.inflate(R.layout.fragment_ketel_one_tour, null);

        final Button btnOpenPopup = (Button)v.findViewById(R.id.uno);
        final Button btnOpenPopupDos = (Button)v.findViewById(R.id.dos);
        final Button btnOpenPopupTres = (Button)v.findViewById(R.id.tres);
        final Button btnOpenPopupCuatro = (Button)v.findViewById(R.id.cuatro);
        final Button btnOpenPopupCinco = (Button)v.findViewById(R.id.cinco);
        final Button btnOpenPopupSeis = (Button)v.findViewById(R.id.seis);
        final Button btnOpenPopupSiete = (Button)v.findViewById(R.id.siete);

        final Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");


        btnOpenPopup.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_uno_ko, null);

                text_pop_uno = getString(R.string.txt_pop_up_uno_kt);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.uno);
                text_uno.setText(text_pop_uno);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss_uno);
                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(btnOpenPopup, 10, -30);

            }});

        btnOpenPopupDos.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_dos_ko, null);

                text_pop_dos = getString(R.string.txt_pop_up_dos_kt);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.dos);
                text_uno.setText(text_pop_dos);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);



                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismissDos = (Button)popupView.findViewById(R.id.dismiss_dos);
                btnDismissDos.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(btnOpenPopupDos, 10, -30);

            }});

        btnOpenPopupTres.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_tres_ko, null);

                text_pop_tres = getString(R.string.txt_pop_up_tres_kt);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.tres);
                text_uno.setText(text_pop_tres);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);


                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismissTres = (Button)popupView.findViewById(R.id.dismiss_tres);
                btnDismissTres.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(btnOpenPopupTres, 10, -30);

            }});

        btnOpenPopupCuatro.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_cuatro_ko, null);

                text_pop_cuatro = getString(R.string.txt_pop_up_cuatro_kt);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.cuatro);
                text_uno.setText(text_pop_cuatro);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismissCuatro = (Button)popupView.findViewById(R.id.dismiss_cuatro);
                btnDismissCuatro.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(btnOpenPopupCuatro, 10, -30);

            }});

        btnOpenPopupCinco.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_cinco_ko, null);

                text_pop_cinco = getString(R.string.txt_pop_up_cinco_kt);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.cinco);
                text_uno.setText(text_pop_cinco);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismissCinco = (Button)popupView.findViewById(R.id.dismiss_cinco);
                btnDismissCinco.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(btnOpenPopupCinco, 50, -30);

            }});

        btnOpenPopupSeis.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_seis_ko, null);

                text_pop_seis = getString(R.string.txt_pop_up_seis_kt);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.seis);
                text_uno.setText(text_pop_seis);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);



                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismissSeis = (Button)popupView.findViewById(R.id.dismiss_seis);
                btnDismissSeis.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(btnOpenPopupSeis, 50, -30);

            }});

        btnOpenPopupSiete.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_siete_ko, null);

                text_pop_siete = getString(R.string.txt_pop_up_siete_kt);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.siete);
                text_uno.setText(text_pop_siete);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);


                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismissSiete = (Button)popupView.findViewById(R.id.dismiss_siete);
                btnDismissSiete.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(btnOpenPopupSiete, 50, -30);

            }});


        return v;
    }
}

