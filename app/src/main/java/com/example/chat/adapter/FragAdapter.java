package com.example.chat.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chat.fragments.ChatFragment;
import com.example.chat.fragments.StatusFragment;
import com.example.chat.fragments.UserFragment;

public class FragAdapter extends FragmentPagerAdapter {

    String[] names = {"Status", "User", "Chat"};


     public FragAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

         switch (position){
             case 0:
                 return new StatusFragment();

             case 1:
                 return new UserFragment();

             case 2:
                 return new ChatFragment();
         }

         return null;
    }

    @Override
    public int getCount() {
        return names.length;
    }
}
