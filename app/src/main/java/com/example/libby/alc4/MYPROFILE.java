package com.example.libby.alc4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MYPROFILE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
        getSupportActionBar().setTitle("myprofile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
