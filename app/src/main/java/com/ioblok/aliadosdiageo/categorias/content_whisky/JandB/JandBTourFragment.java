package com.ioblok.aliadosdiageo.categorias.content_whisky.JandB;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;

public class JandBTourFragment extends Fragment {

    View v, lastPopup;
    String text_popup = "";
    Typeface myFont;
    PopupWindow popupWindow;
    int lasId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        v = inflater.inflate(R.layout.fragment_j_and_b_tour, null);

        final Button btnOpenPopup = (Button)v.findViewById(R.id.uno);
        final Button btnOpenPopupDos = (Button)v.findViewById(R.id.dos);
        final Button btnOpenPopupTres = (Button)v.findViewById(R.id.tres);
        final Button btnOpenPopupCuatro = (Button)v.findViewById(R.id.cuatro);
        final Button btnOpenPopupCinco = (Button)v.findViewById(R.id.cinco);
        final Button btnOpenPopupSeis = (Button)v.findViewById(R.id.seis);
        final Button btnOpenPopupSiete = (Button)v.findViewById(R.id.siete);

        myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");

        btnOpenPopup.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 1);
                lasId = arg0.getId();
            }
        });

        btnOpenPopupDos.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 2);
                lasId = arg0.getId();
            }
        });

        btnOpenPopupTres.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 3);
                lasId = arg0.getId();
            }
        });

        btnOpenPopupCuatro.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 4);
                lasId = arg0.getId();
            }
        });

        btnOpenPopupCinco.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 5);
                lasId = arg0.getId();
            }
        });

        btnOpenPopupSeis.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 6);
                lasId = arg0.getId();
            }
        });

        btnOpenPopupSiete.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 7);
                lasId = arg0.getId();
            }
        });

        return v;
    }

    public void initialize() {

    }

    public void showPopup(View view, int numberPopup) {
        // Inflate para crear nuestra vista dinámica
        LayoutInflater layoutInflater = (LayoutInflater) getActivity().getBaseContext().getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);

        // el nuevo popupView
        View popupView;

        //Nuestro texto a desplegar en el popupView
        DocumentView textPopupDV;

        //Este switch infla el popup, el DocumentView e inicializa el string dependiendo el boton seleccionado
        switch (numberPopup) {
            case 1:
                popupView = layoutInflater.inflate(R.layout.popup_uno_jandb, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.uno);
                text_popup = getString(R.string.txt_pop_up_uno_jandb);
                break;
            case 2:
                popupView = layoutInflater.inflate(R.layout.popup_dos_jandb, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.dos);
                text_popup = getString(R.string.txt_pop_up_dos_jandb);
                break;
            case 3:
                popupView = layoutInflater.inflate(R.layout.popup_tres_jandb, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.tres);
                text_popup = getString(R.string.txt_pop_up_tres_jandb);
                break;
            case 4:
                popupView = layoutInflater.inflate(R.layout.popup_cuatro_jandb, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.cuatro);
                text_popup = getString(R.string.txt_pop_up_cuatro_jandb);
                break;
            case 5:
                popupView = layoutInflater.inflate(R.layout.popup_cinco_jandb, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.cinco);
                text_popup = getString(R.string.txt_pop_up_cinco_jandb);
                break;
            case 6:
                popupView = layoutInflater.inflate(R.layout.popup_seis_jandb, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.seis);
                text_popup = getString(R.string.txt_pop_up_seis_jandb);
                break;
            case 7:
                popupView = layoutInflater.inflate(R.layout.popup_siete_jandb, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.siete);
                text_popup = getString(R.string.txt_pop_up_siete_jandb);
                break;
            default:
                popupView = layoutInflater.inflate(R.layout.popup_uno_jandb, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.uno);
                text_popup = getString(R.string.txt_pop_up_uno_jandb);
                break;
        }

        //Si popup != null, es decir, ya se presionó por lo menos una vez, entonces se oculta el último popup
        if (popupWindow != null) {
            popupWindow.dismiss();

            //Si el botón que se presionó ya se está mostrando un popup entonces pone el tag a false y sale del método
            if (view.getTag().equals("true")) {
                view.setTag("false");
                return;
            }

            //En caso de no ocurrir lo anterior es decir que se presione otro botton y que ya se esté mostrando un popup
            //entonces setea el último tag del button seleccionado a false
            getActivity().findViewById(lasId).setTag("false");
        }

        //Crea el nuevo popup y resuleve el crash de la memoria usando solo un objeto popupWindow

        popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textPopupDV.setText(text_popup);
        textPopupDV.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        textPopupDV.getDocumentLayoutParams().setTextColor(0xFF333333);
        textPopupDV.getDocumentLayoutParams().setTextTypeface(myFont);
        popupWindow.showAsDropDown(view, 10, -30);

        //Aquí indica que ya se está mostrando un popup
        lastPopup = view;
        view.setTag("true");

    }

    //Fragment lifeCycle

    @Override
    public void onPause(){
        super.onPause();
        Log.e("onPause", "onPause");
        if (popupWindow != null) {
            popupWindow.dismiss();
            //Si el botón que se presionó ya se está mostrando un popup entonces pone el tag a false y sale del método
            if (lastPopup.getTag().equals("true")) {
                lastPopup.setTag("false");
                return;
            }
        }
    }

}/*
        btnOpenPopup.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_uno_jandb, null);

                text_pop_uno = getString(R.string.txt_pop_up_uno_jandb);
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
                View popupView = layoutInflater.inflate(R.layout.popup_dos_jandb, null);

                text_pop_dos = getString(R.string.txt_pop_up_dos_jandb);
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
                View popupView = layoutInflater.inflate(R.layout.popup_tres_jandb, null);

                text_pop_tres = getString(R.string.txt_pop_up_tres_jandb);
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
                View popupView = layoutInflater.inflate(R.layout.popup_cuatro_jandb, null);

                text_pop_cuatro = getString(R.string.txt_pop_up_cuatro_jandb);
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
                View popupView = layoutInflater.inflate(R.layout.popup_cinco_jandb, null);


                text_pop_cinco = getString(R.string.txt_pop_up_cinco_jandb);
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
                View popupView = layoutInflater.inflate(R.layout.popup_seis_jandb, null);

                text_pop_seis = getString(R.string.txt_pop_up_seis_jandb);
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
                View popupView = layoutInflater.inflate(R.layout.popup_siete_jandb, null);

                text_pop_siete = getString(R.string.txt_pop_up_siete_jandb);
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
*/
