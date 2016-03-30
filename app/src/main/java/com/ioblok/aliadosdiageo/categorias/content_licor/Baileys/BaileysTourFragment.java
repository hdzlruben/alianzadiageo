package com.ioblok.aliadosdiageo.categorias.content_licor.Baileys;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.view.ViewGroup.LayoutParams;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;
import com.ioblok.aliadosdiageo.R;

public class BaileysTourFragment  extends Fragment {

    //View v;
    //String text_pop_uno,text_pop_dos,text_pop_tres,text_pop_cuatro,text_pop_cinco,text_pop_seis,text_pop_siete,text_pop_ocho;

    View v;
    String text_popup = "";
    Typeface myFont;
    PopupWindow popupWindow;
    int lasId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_baileys_tour, null);

        final Button btnOpenPopup = (Button)v.findViewById(R.id.uno);
        final Button btnOpenPopupDos = (Button)v.findViewById(R.id.dos);
        final Button btnOpenPopupTres = (Button)v.findViewById(R.id.tres);
        final Button btnOpenPopupCuatro = (Button)v.findViewById(R.id.cuatro);

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
                popupView = layoutInflater.inflate(R.layout.popup_uno_bls, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.uno);
                text_popup = getString(R.string.txt_pop_up_uno_bls);
                break;
            case 2:
                popupView = layoutInflater.inflate(R.layout.popup_dos_bls, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.dos);
                text_popup = getString(R.string.txt_pop_up_dos_bls);
                break;
            case 3:
                popupView = layoutInflater.inflate(R.layout.popup_tres_bls, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.tres);
                text_popup = getString(R.string.txt_pop_up_tres_bls);
                break;
            case 4:
                popupView = layoutInflater.inflate(R.layout.popup_cuatro_bls, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.cuatro);
                text_popup = getString(R.string.txt_pop_up_cuatro_bls);
                break;
            default:
                popupView = layoutInflater.inflate(R.layout.popup_uno_bls, null);
                textPopupDV = (DocumentView) popupView.findViewById(R.id.uno);
                text_popup = getString(R.string.txt_pop_up_uno_bls);
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

        /*btnOpenPopup.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_uno_bls, null);

                text_pop_uno = getString(R.string.txt_pop_up_uno_bls);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.text_uno_tl);
                text_uno.setText(text_pop_uno);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss_uno);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopup, 50, -30);

            }
        });

        btnOpenPopupDos.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_dos_bls, null);

                text_pop_dos = getString(R.string.txt_pop_up_dos_bls);
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
                View popupView = layoutInflater.inflate(R.layout.popup_tres_bls, null);

                text_pop_tres = getString(R.string.txt_pop_up_tres_bls);
                DocumentView text_uno = (DocumentView)popupView.findViewById(R.id.tres);
                text_uno.setText(text_pop_tres);
                text_uno.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
                text_uno.getDocumentLayoutParams().setTextColor(0xFF333333);
                text_uno.getDocumentLayoutParams().setTextTypeface(myFont);

                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismisstres = (Button)popupView.findViewById(R.id.dismiss_tres);
                btnDismisstres.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(btnOpenPopupTres, 50, -30);

            }});

        btnOpenPopupCuatro.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getActivity().getBaseContext()
                        .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_cuatro_bls, null);

                text_pop_cuatro = getString(R.string.txt_pop_up_cuatro_bls);
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

        return v;
    }
}
*/
