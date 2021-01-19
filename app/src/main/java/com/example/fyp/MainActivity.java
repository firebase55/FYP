package com.example.fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView) findViewById(R.id.image);
        TextView textView = (TextView) findViewById(R.id.app_name);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.animated);
        image.startAnimation(animation);
        Animation slide_ani = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.animated);
        textView.setAnimation(slide_ani);
        final MediaPlayer ring = MediaPlayer.create(MainActivity.this, R.raw.ring);
        ring.start();
        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep(10 * 1000);

                    // After 5 seconds redirect to another intent
                    Intent i = new Intent(getBaseContext(), Main_screenn.class);
                    startActivity(i);
                    ring.stop();

                    //Remove activity
                    finish();
                } catch (Exception e) {

                }
            }
        };
        // start thread
        background.start();
    }
}