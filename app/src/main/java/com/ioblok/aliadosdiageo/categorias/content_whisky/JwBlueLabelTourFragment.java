package com.ioblok.aliadosdiageo.categorias.content_whisky;

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

    View v;
    String text_popup = "";
    Typeface myFont;
    PopupWindow popupWindow;
    int lasId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_jw_blue_tour, null);

        final Button btnOpenPopupOcho = (Button) v.findViewById(R.id.ocho);
        final Button btnOpenPopupCuatro = (Button) v.findViewById(R.id.cuatro);
        final Button btnOpenPopupCinco = (Button) v.findViewById(R.id.cinco);
        final Button btnOpenPopupTres = (Button) v.findViewById(R.id.tres);
        final Button btnOpenPopupUno = (Button) v.findViewById(R.id.uno);
        final Button btnOpenPopupSeis = (Button) v.findViewById(R.id.seis);
        final Button btnOpenPopupDos = (Button) v.findViewById(R.id.dos);
        final Button btnOpenPopupSiete = (Button) v.findViewById(R.id.siete);

        myFont = Typeface.createFromAsset(getActivity().getAssets(), "acaslonpro-regular-webfont.ttf");

        btnOpenPopupOcho.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                /**
                 * Se llama al método showPopup8(View view, int numberPopup) dónde arg0 es el botón que está siendo presionado
                 * y el 8 el popup que se desea mostrar
                 *
                 * posteriormente se asigna el valor del último id que se presionó, para que dentro del método
                 * showPopup8(View view, int numberPopup) se pueda usar el último presionado y al finalizar el método
                 * quede el último presionado actual
                 *
                 **/
                showPopup(arg0, 8);
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


        btnOpenPopupTres.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 3);
                lasId = arg0.getId();
            }
        });

        btnOpenPopupUno.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 1);
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

        btnOpenPopupDos.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                showPopup(arg0, 2);
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
                popupView = layoutInflater.inflate(R.layout.popup_uno_blue, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.uno);
                text_popup = getString(R.string.txt_pop_up_uno_bl);
                break;
            case 2:
                popupView = layoutInflater.inflate(R.layout.popup_dos_blue, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.dos);
                text_popup = getString(R.string.txt_pop_up_dos_bl);
                break;
            case 3:
                popupView = layoutInflater.inflate(R.layout.popup_tres_blue, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.tres);
                text_popup = getString(R.string.txt_pop_up_tres_bl);
                break;
            case 4:
                popupView = layoutInflater.inflate(R.layout.popup_cuatro_blue, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.cuatro);
                text_popup = getString(R.string.txt_pop_up_cuatro_bl);
                break;
            case 5:
                popupView = layoutInflater.inflate(R.layout.popup_cinco_blue, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.cinco);
                text_popup = getString(R.string.txt_pop_up_cinco_bl);
                break;
            case 6:
                popupView = layoutInflater.inflate(R.layout.popup_seis_blue, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.seis);
                text_popup = getString(R.string.txt_pop_up_seis_bl);
                break;
            case 7:
                popupView = layoutInflater.inflate(R.layout.popup_siete_blue, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.siete);
                text_popup = getString(R.string.txt_pop_up_siete_bl);
                break;
            case 8:
                popupView = layoutInflater.inflate(R.layout.popup_ocho_blue, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.ocho);
                text_popup = getString(R.string.txt_pop_up_ocho_bl);
                break;
            default:
                popupView = layoutInflater.inflate(R.layout.popup_uno_blue, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.uno);
                text_popup = getString(R.string.txt_pop_up_uno_bl);
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
        view.setTag("true");

    }

}
