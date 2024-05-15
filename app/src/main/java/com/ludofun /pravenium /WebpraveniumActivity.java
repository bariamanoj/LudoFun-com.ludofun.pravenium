package com.ludofun.pravenium;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class WebpraveniumActivity extends AppCompatActivity {


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_web_pravenium);
  
        WebView ludofun_web = findViewById(R.id.web_pravenium_view);

        ludofun_web.setWebViewClient(new WebViewClient());
        ludofun_web.getSettings().setJavaScriptEnabled(true);
        ludofun_web.getSettings().setUseWideViewPort(true);
        ludofun_web.getSettings().setLoadWithOverviewMode(true);
        ludofun_web.getSettings().setDomStorageEnabled(true);
        ludofun_web.getSettings().setPluginState(WebSettings.PluginState.ON);
        ludofun_web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        ludofun_web.loadUrl("https://g.vseigru.net/11/igra-ludo-klassik/");
    }
}