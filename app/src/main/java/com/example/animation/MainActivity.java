package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public int tracker = 1;
    public float angle = 180f;
    public float tracker()
    {
        float simple = 180f;
        if (tracker <= 1){
            tracker++;
            return simple;
        }
        else
        {
            angle += 180f;
            return angle;
        }
    }
    public void fade(View view){
        //ImageView full = findViewById(R.id.full);
        //full.animate().alpha(1f).setDuration(2000);
        ImageView small = findViewById(R.id.small);
        //small.animate().alpha(0f).setDuration(2000);
        //small.animate().translationXBy(1000f).setDuration(2000);
        small.animate().rotation(tracker()).setDuration(1000);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        ImageView small = findViewById(R.id.small);
        small.setTranslationX(-1000f);
        small.animate().translationXBy(1000f).setDuration(2000);
*/

    }
}
