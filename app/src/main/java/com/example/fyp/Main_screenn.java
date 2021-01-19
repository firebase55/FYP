package com.example.fyp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.TokenWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Main_screenn extends AppCompatActivity {
private CardView Game_card, Cartoon_card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screenn);
        Game_card = (CardView)findViewById(R.id.game_id);
        Cartoon_card = (CardView)findViewById(R.id.cartoon_id);
        Game();
        Cartoon_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                newActivity();

            }
        });

    }
    public void newActivity()
    {
        Intent selectClass= new Intent(getApplicationContext(), com.example.fyp.videoplayer.class);
        startActivity(selectClass);

    }
    public void Game()
    {
        Game_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dilog_box();
            }
        });

    }


    public void dilog_box()
    {
        final Dialog dialog = new Dialog(this);
        View view = LayoutInflater.from(this).inflate(R.layout.cartoon_box , null);
        dialog.setContentView(view);
        Button mBtnSubmit = view.findViewById(R.id.buttonSubmit);
        ImageView cross = view.findViewById(R.id.cross_screen);
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setCancelable(true);
            }
        });
        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectClass= new Intent(getApplicationContext(), com.example.fyp.videoplayer.class);
                startActivity(selectClass);
            }
        });
        dialog.setCancelable(true);
        dialog.show();
    }

    public void video_demo(View view)
    {
        final Dialog dialog = new Dialog(this);
        View view1 = LayoutInflater.from(this).inflate(R.layout.video_demoapp , null);
        dialog.setContentView(view1);
        Button mBtnSubmit = view1.findViewById(R.id.buttonSubmit);
        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


            }
        });
        dialog.setCancelable(true);
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        new SweetAlertDialog(Main_screenn.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want closed App")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        sDialog.dismissWithAnimation();
                        finish();

                    }
                })
                .setCancelText("No")
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        sDialog.dismissWithAnimation();

                    }
                })
                .show();
    }
}