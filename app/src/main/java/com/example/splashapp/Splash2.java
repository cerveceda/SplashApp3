package com.example.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Splash2 extends AppCompatActivity {

    MediaPlayer mp;
    ImageButton btnInstaJ2;
    Button btnRecordj2, btnBioj2,btnAtras2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        btnInstaJ2 = (ImageButton) findViewById(R.id.btnInstaJ2);
        mp = MediaPlayer.create(this, R.raw.click);
        btnRecordj2 = (Button) findViewById(R.id.btnRecordj2);
        btnBioj2 = (Button) findViewById(R.id.btnBioj2);
        btnAtras2 = (Button) findViewById(R.id.btnAtras2);

        btnInstaJ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri ins = Uri.parse("https://www.instagram.com/stylebender/?hl=es-la");
                Intent intent = new Intent(Intent.ACTION_VIEW,ins);
                startActivity(intent);
                mp.start();
            }
        });

        btnAtras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                mp.start();
            }
        });

        btnRecordj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recordi = new Intent(Splash2.this, Splash2_1.class);
                startActivity(recordi);
                mp.start();
            }
        });

        btnBioj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bioi = new Intent(Splash2.this, Splash2_2.class);
                startActivity(bioi);
                mp.start();
            }
        });
    }

    public void recordi(View view){
        Intent recordi = new Intent(Splash2.this, Splash2_1.class);
        startActivity(recordi);
    }

    public void biografiai(View view){
        Intent bioi = new Intent(Splash2.this, Splash2_2.class);
        startActivity(bioi);
    }

    public void atras1(View view){
        finish();
    }
}