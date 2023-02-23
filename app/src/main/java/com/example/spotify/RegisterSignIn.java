package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterSignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_sign_in);
        Button Register = findViewById(R.id.button2);
        Register.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent toRegister = new Intent(RegisterSignIn.this, Register.class);
                startActivity(toRegister);
            }
        });
    }
}