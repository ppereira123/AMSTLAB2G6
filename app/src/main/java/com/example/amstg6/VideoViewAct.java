package com.example.amstg6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.VideoView;

public class VideoViewAct extends AppCompatActivity {
    private Button btnAtras;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        btnAtras = (Button) findViewById(R.id.btnAtras);
        webview = (WebView) findViewById(R.id.webv);
        WebSettings conf = webview.getSettings();
        conf.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.youtube.com/watch?v=JJY3wqCp28c&t=2s");

    }

    public void regresar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}