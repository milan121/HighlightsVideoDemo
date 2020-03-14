package com.milanapp.bccihighlightsdemo;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PictureInPictureParams;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Main2Activity extends AppCompatActivity {
    private VideoView videoView;
    PictureInPictureParams.Builder pictureInPictureParamsBuilder = new PictureInPictureParams.Builder();
    private Button pip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String video = (getIntent().getExtras().getString("video"));

        videoView = findViewById(R.id.video);
        pip = findViewById(R.id.pip);

        final MediaController mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(videoView);


        videoView.setMediaController(mediacontroller);
        videoView.setVideoPath(video);
        videoView.requestFocus();
        videoView.start();


        pip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPictureInPictureFeature();
            }
        });

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        videoView.setMediaController(mediacontroller);
                        mediacontroller.setAnchorView(videoView);

                    }
                });
            }
        });

    }

    private void startPictureInPictureFeature() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            Rational aspectRatio = new Rational(videoView.getWidth(), videoView.getHeight());
            pictureInPictureParamsBuilder.setAspectRatio(aspectRatio).build();
            enterPictureInPictureMode(pictureInPictureParamsBuilder.build());
        }
    }


    @Override
    public void onUserLeaveHint() {
        if (!isInPictureInPictureMode()) {
            Rational aspectRatio = new Rational(videoView.getWidth(), videoView.getHeight());
            pictureInPictureParamsBuilder.setAspectRatio(aspectRatio).build();
            enterPictureInPictureMode(pictureInPictureParamsBuilder.build());
        }
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode,
                                              Configuration newConfig) {
        if (isInPictureInPictureMode) {
            pip.setVisibility(View.GONE);

        } else {
            pip.setVisibility(View.VISIBLE);

        }



    }

    @Override
    public void onNewIntent(Intent i) {
        super.onNewIntent(i);
        updateVideoView(i);
    }

    private void updateVideoView(Intent i) {
        String video = (getIntent().getExtras().getString("video"));

        videoView.setVideoPath(video);
        videoView.requestFocus();
    }

}
