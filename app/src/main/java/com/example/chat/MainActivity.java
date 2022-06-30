package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.chat.adapter.FragAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager =getSupportFragmentManager();
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("ChatON");
        setSupportActionBar(toolbar);

        FragAdapter fragAdapter = new FragAdapter(fragmentManager);

        viewPager= findViewById(R.id.fragmentViewPager);
        tabLayout=findViewById(R.id.tabLayout);

        viewPager.setAdapter(fragAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void SignOut(View view) {

        FirebaseAuth firebaseAuth= FirebaseAuth.getInstance();
        firebaseAuth.signOut();

        startActivity(new Intent(getApplicationContext(), StartActivity.class));
    }
}