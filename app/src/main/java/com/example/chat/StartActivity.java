package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    AppCompatButton btn_register, btn_logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btn_register = findViewById(R.id.btn_register);
        btn_logIn = findViewById(R.id.btn_logIn);

        btn_register.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
        });

        btn_logIn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),LogInActivity.class));
        });

    }
}