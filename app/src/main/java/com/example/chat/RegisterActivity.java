package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

        TextInputEditText edt_username, edt_email, edt_password;
        AppCompatButton btn_register, btn_have_an_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edt_username = findViewById(R.id.edt_username);
        edt_email = findViewById(R.id.edt_email);
        edt_password = findViewById(R.id.edt_password);
        btn_register = findViewById(R.id.btn_register);
        btn_have_an_account = findViewById(R.id.btn_have_an_account);

        btn_register.setOnClickListener(v -> {

        });

        btn_have_an_account.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),LogInActivity.class));
            finish();
        });
    }
}