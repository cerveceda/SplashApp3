package com.example.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button btnJorge, btnIsrael, btnSalir, btnHisto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJorge = (Button) findViewById(R.id.btnJorge);
        mp = MediaPlayer.create(this, R.raw.click);
        btnIsrael = (Button) findViewById(R.id.btnIsrael);
        btnSalir = (Button) findViewById(R.id.btnSalir);
        btnHisto = (Button) findViewById(R.id.btnHisto);

        btnJorge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ijorge = new Intent(MainActivity.this, Splash.class);
                startActivity(ijorge);
                mp.start();
            }
        });

        btnIsrael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ijorge1 = new Intent(MainActivity.this, Splash2.class);
                startActivity(ijorge1);
                mp.start();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                mp.start();
            }
        });
        btnHisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }

    public void splash(View view){
        Intent ijorge = new Intent(MainActivity.this, Splash.class);
        startActivity(ijorge);
    }

    public void splash2(View view){
        Intent ijorge1 = new Intent(MainActivity.this, Splash2.class);
        startActivity(ijorge1);
    }

    public void sa(View view){
        finish();
    }
}