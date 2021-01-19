package com.example.fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class playVdeo extends AppCompatActivity {
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_vdeo);
        vid = (VideoView) findViewById(R.id.video_view);

    }

    public void play(View view) {
        MediaController m = new MediaController(this);
        vid.setMediaController(m);
        String path = "android.resource://com.example.fyp/" + R.raw.demo;
        Uri u = Uri.parse(path);
        vid.setVideoURI(u);
        vid.start();


    }
}