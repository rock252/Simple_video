package com.udnkhatola.simple_video;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private MediaController media_control;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        //Bundle extras = getIntent().getExtras();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // VideoView video_view = (VideoView) findViewById(R.id.myVideo);

        String videopath="android.resource://com.udnkhatola.simple_video/"+R.raw.sagar_ratna;
        Intent i = new Intent(getApplicationContext(), X.class);
        i.putExtra("url",videopath);
        startActivity(i);


    }
}
