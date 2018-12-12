package com.example.andreaperez.facetoface;

import android.content.Intent;
import android.graphics.Paint;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openAboutActivity (View view){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void openFingerPath (View view){
        Intent intent = new Intent(this, New.class);
        startActivity(intent);
    }
}
