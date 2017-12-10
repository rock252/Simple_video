package com.udnkhatola.simple_video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Shivam_Gupta on 10-10-2017.
 */

public class X extends Activity {
    private MediaController media_control;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        VideoView video_view = (VideoView) findViewById(R.id.myVideo);
        Bundle extras = getIntent().getExtras();


        String videopath=(extras.getString("url"));
        Uri uri = Uri.parse(videopath);

        media_control = new MediaController(this);
        video_view.setMediaController(media_control);

        video_view.setVideoURI(uri);
        video_view.start();
    }
}



