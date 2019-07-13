package com.example.libby.alc4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ABOUTALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutalc);
        getSupportActionBar().setTitle("aboutalc");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
