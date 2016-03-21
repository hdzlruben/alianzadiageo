package com.ioblok.aliadosdiageo.utilis;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.ioblok.aliadosdiageo.R;

/**
 * Created by kreativeco on 19/03/16.
 */
public class WebViewManager extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.activity_web_view);

        WebView myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.loadUrl("http://aliadosdiageotraining.interactivevalley.com");

    }

}
