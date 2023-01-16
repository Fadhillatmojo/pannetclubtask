package com.example.pannetclubtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.window.SplashScreen;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

//        hide action bar
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
//        TIME DELAYED
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent( Splashscreen.this, MainActivity.class));
                finish();
            }
        }, 3000);
    }
}