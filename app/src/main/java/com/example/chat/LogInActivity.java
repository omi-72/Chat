package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class LogInActivity extends AppCompatActivity {
    TextInputEditText edt_email, edt_password;
    AppCompatButton btn_logIn, btn_create_an_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        edt_email = findViewById(R.id.edt_email);
        edt_password = findViewById(R.id.edt_password);
        btn_logIn = findViewById(R.id.btn_logIn);
        btn_create_an_account = findViewById(R.id.btn_create_an_account);

        btn_logIn.setOnClickListener(v -> {

        });

        btn_create_an_account.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
            finish();
        });

    }
}