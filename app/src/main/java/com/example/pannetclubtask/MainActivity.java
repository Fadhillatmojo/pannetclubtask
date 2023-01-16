package com.example.pannetclubtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.usernameinp);
        password = findViewById(R.id.passwordinp);
        loginButton = findViewById(R.id.btn_login);

//        button click listener untuk login
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(username.getText().toString().equals("netclub") && password.getText().toString().equals("netclubpan2022")){
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                    openActivityHome();
                }else{
                    Toast.makeText(MainActivity.this,"Username or Password is wrong",Toast.LENGTH_SHORT).show();
                }
            }
        });

//        untuk hide the top bar
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
    }

    public void openActivityHome(){
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
        finish();
    }
}