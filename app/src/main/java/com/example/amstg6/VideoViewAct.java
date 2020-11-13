package com.example.amstg6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VideoViewAct extends AppCompatActivity {
    private Button btnAtras;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        btnAtras = (Button) findViewById(R.id.btnAtras);
        video = (VideoView) findViewById(R.id.videov);
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=JJY3wqCp28c");
        video.setVideoURI(uri);
        video.start();

    }

    public void regresar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}