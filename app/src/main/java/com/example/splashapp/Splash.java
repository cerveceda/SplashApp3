package com.example.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Splash extends AppCompatActivity {

    MediaPlayer mp;
    ImageButton btnInstaJ, btnYouj;
    Button btnRecordj, btnBioj,btnAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        btnInstaJ = (ImageButton) findViewById(R.id.btnInstaJ);
        btnYouj = (ImageButton) findViewById(R.id.btnYouj);
        mp = MediaPlayer.create(this, R.raw.click);
        btnRecordj = (Button) findViewById(R.id.btnRecordj);
        btnBioj = (Button) findViewById(R.id.btnBioj);
        btnAtras = (Button) findViewById(R.id.btnAtras);

        btnInstaJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri ins = Uri.parse("https://www.instagram.com/gamebredfighter/?hl=es-la");
                Intent intent = new Intent(Intent.ACTION_VIEW,ins);
                startActivity(intent);
                mp.start();
            }
        });

        btnYouj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri you = Uri.parse("https://www.youtube.com/channel/UCLqPsB0IEfj_oEn3rhEM3xQ");
                Intent intent = new Intent(Intent.ACTION_VIEW,you);
                startActivity(intent);
                mp.start();
            }
        });

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                mp.start();
            }
        });

        btnRecordj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recordj = new Intent(Splash.this, Splash1_1.class);
                startActivity(recordj);
                mp.start();
            }
        });

        btnBioj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bioj = new Intent(Splash.this, Splash1_2.class);
                startActivity(bioj);
                mp.start();
            }
        });
    }

    public void recordj(View view){
        Intent recordj = new Intent(Splash.this, Splash1_1.class);
        startActivity(recordj);
    }

    public void biografiaj(View view){
        Intent bioj = new Intent(Splash.this, Splash1_2.class);
        startActivity(bioj);
    }

    public void atras(View view){
        finish();
    }
}