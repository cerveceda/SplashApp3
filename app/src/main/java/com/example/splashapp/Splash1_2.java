package com.example.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Splash1_2 extends AppCompatActivity {

    VideoView vdJorge, vdJorge1;
    MediaController mediaController, mediaController1;
    int position=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1_2);

        vdJorge = (VideoView) findViewById(R.id.vdJorge);
        vdJorge1 = (VideoView) findViewById(R.id.vdJorge1);

        String path = "android.resource://"+getPackageName()+"/"+R.raw.jorgevid;
        vdJorge.setVideoURI(Uri.parse(path));
        vdJorge.start();
        String path1 = "android.resource://"+getPackageName()+"/"+R.raw.jorgeti;
        vdJorge1.setVideoURI(Uri.parse(path1));
        vdJorge1.start();

        if(this.mediaController==null){
            this.mediaController = new MediaController(Splash1_2.this);
            this.mediaController.setAnchorView(vdJorge);
            this.vdJorge.setMediaController(mediaController);
        }
        if(this.mediaController1==null){
            this.mediaController1 = new MediaController(Splash1_2.this);
            this.mediaController1.setAnchorView(vdJorge1);
            this.vdJorge1.setMediaController(mediaController1);
        }

        this.vdJorge.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                vdJorge.seekTo(position);
                if(position==0){
                    vdJorge.start();
                }
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        mediaController.setAnchorView(vdJorge);
                    }
                });
            }
        });
        this.vdJorge1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp1) {
                vdJorge1.seekTo(position);
                if(position==0){
                    vdJorge1.start();
                }
                mp1.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        mediaController1.setAnchorView(vdJorge1);
                    }
                });
            }
        });
    }
}