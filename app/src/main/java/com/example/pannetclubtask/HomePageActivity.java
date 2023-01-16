package com.example.pannetclubtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePageActivity extends AppCompatActivity {
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        logout = findViewById(R.id.btn_logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutClickGas();
            }
        });

        //        untuk hide the top bar
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
    }

    public void logoutClickGas(){
        Intent intent2 = new Intent(this, MainActivity.class);
        Toast.makeText(HomePageActivity.this,"You have been logged out",Toast.LENGTH_SHORT).show();
        startActivity(intent2);
        finish();
    }
}