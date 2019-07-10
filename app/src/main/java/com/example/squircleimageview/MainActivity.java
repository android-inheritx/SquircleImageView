package com.example.squircleimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.squircleview.SquircleView;

public class MainActivity extends AppCompatActivity {

    SquircleView sqProfile, sqProfileBorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqProfile = findViewById(R.id.sqProfile);
        sqProfileBorder = findViewById(R.id.sqProfileBorder);


        Glide.with(this)
                .load("https://avatars3.githubusercontent.com/u/17440971?s=400&u=b0d8df93a2e45812e577358cd66849e9d7cf0f90&v=4")
                .centerCrop()
                .into(sqProfile);

        Glide.with(this)
                .load("https://avatars3.githubusercontent.com/u/17440971?s=400&u=b0d8df93a2e45812e577358cd66849e9d7cf0f90&v=4")
                .centerCrop()
                .into(sqProfileBorder);


    }
}
