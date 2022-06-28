package com.example.chat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

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
            String email= edt_email.getText().toString().trim();
            String password= edt_password.getText().toString().trim();

           loginUser(email, password);

        });

        btn_create_an_account.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
            finish();
        });

    }

    private void loginUser(String email, String password) {

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        firebaseAuth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
}