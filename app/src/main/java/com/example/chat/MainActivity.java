package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SignOut(View view) {

        FirebaseAuth firebaseAuth= FirebaseAuth.getInstance();
        firebaseAuth.signOut();

        startActivity(new Intent(getApplicationContext(), StartActivity.class));
    }
}