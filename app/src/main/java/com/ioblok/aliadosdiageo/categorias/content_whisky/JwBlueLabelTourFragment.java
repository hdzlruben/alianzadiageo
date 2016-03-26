package com.ioblok.aliadosdiageo.categorias.content_whisky;

//import android.app.Fragment;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;

public class JwBlueLabelTourFragment extends Fragment {

    Button backButton_categorias_int,btn_family_zacapa,btn_family_walker,btn_family_buchanans,btn_family_tanqueray,btn_family_don_julio;
    String text_title_seccion,text_title_drink,text_content_drink,text_sub_title,text_content_subtitle;
    View v;
    String text_pop_uno,text_pop_dos,text_pop_tres,text_pop_cuatro,text_pop_cinco,text_pop_seis,text_pop_siete,text_pop_ocho;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_jw_blue_tour, null);


        final Button btnOpenPopupOcho = (Button)v.findViewById(R.id.ocho);
        final Button btnOpenPopupCuatro = (Button)v.findViewById(R.id.cuatro);
        final Button btnOpenPopupCinco = (Button)v.findViewById(R.id.cinco);
        final Button btnOpenPopupTres = (Button)v.findViewById(R.id.tres);
        final Button btnOpenPopupUno = (Button)v.findViewById(R.id.uno);
        final Button btnOpenPopupSeis = (Button)v.findViewById(R.id.seis);
        final Button btnOpenPopupDos = (Button)v.findViewById(R.id.dos);
        final Button btnOpenPopupSiete = (Button)v.findViewById(R.id.siete);

        final Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");

        btnOpenPopupOcho.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_ocho_blue, null);

                text_pop_ocho = getString(R.string.txt_pop_up_ocho_bl);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.ocho);
                text_uno.setText(text_pop_ocho);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                Button dismiss_ocho = (Button)popupView.findViewById(R.id.dismiss_ocho);
                dismiss_ocho.setOnClickListener(new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }});
                popupWindow.showAsDropDown(btnOpenPopupOcho, 10, -30);
            }
        });

        btnOpenPopupCuatro.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_cuatro_blue, null);


                text_pop_cuatro = getString(R.string.txt_pop_up_cuatro_bl);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.cuatro);
                text_uno.setText(text_pop_cuatro);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                Button dismiss_cuatro = (Button)popupView.findViewById(R.id.dismiss_cuatro);
                dismiss_cuatro.setOnClickListener(new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }});
                popupWindow.showAsDropDown(btnOpenPopupCuatro, 10, -30);
            }
        });

        btnOpenPopupCinco.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_cinco_blue, null);


                text_pop_cinco = getString(R.string.txt_pop_up_cinco_bl);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.cinco);
                text_uno.setText(text_pop_cinco);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                Button dismiss_cinco = (Button)popupView.findViewById(R.id.dismiss_cinco);
                dismiss_cinco.setOnClickListener(new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }});
                popupWindow.showAsDropDown(btnOpenPopupCinco, 10, -30);
            }
        });


        btnOpenPopupTres.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_tres_blue, null);


                text_pop_tres = getString(R.string.txt_pop_up_tres_bl);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.tres);
                text_uno.setText(text_pop_tres);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);


                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                Button dismiss_tres = (Button)popupView.findViewById(R.id.dismiss_tres);
                dismiss_tres.setOnClickListener(new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }});
                popupWindow.showAsDropDown(btnOpenPopupTres, 10, -30);
            }
        });

        btnOpenPopupUno.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_uno_blue, null);

                text_pop_uno = getString(R.string.txt_pop_up_uno_bl);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.uno);
                text_uno.setText(text_pop_uno);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);


                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                Button dismiss_uno = (Button)popupView.findViewById(R.id.dismiss_uno);
                dismiss_uno.setOnClickListener(new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }});
                popupWindow.showAsDropDown(btnOpenPopupUno, 10, -30);
            }
        });

        btnOpenPopupSeis.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_seis_blue, null);

                text_pop_seis = getString(R.string.txt_pop_up_seis_bl);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.seis);
                text_uno.setText(text_pop_seis);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                Button dismiss_seis = (Button)popupView.findViewById(R.id.dismiss_seis);
                dismiss_seis.setOnClickListener(new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }});
                popupWindow.showAsDropDown(btnOpenPopupSeis, 10, -30);
            }
        });

        btnOpenPopupDos.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_dos_blue, null);

                text_pop_dos = getString(R.string.txt_pop_up_dos_bl);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.dos);
                text_uno.setText(text_pop_dos);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                Button dismiss_dos = (Button)popupView.findViewById(R.id.dismiss_dos);
                dismiss_dos.setOnClickListener(new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }});
                popupWindow.showAsDropDown(btnOpenPopupDos, 10, -30);
            }
        });

        btnOpenPopupSiete.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_siete_blue, null);

                text_pop_siete = getString(R.string.txt_pop_up_siete_bl);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.siete);
                text_uno.setText(text_pop_siete);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                Button dismiss_siete = (Button)popupView.findViewById(R.id.dismiss_siete);
                dismiss_siete.setOnClickListener(new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }});
                popupWindow.showAsDropDown(btnOpenPopupSiete, 10, -30);
            }
        });



        return v;
    }

    public void initialize(){

    }

}
