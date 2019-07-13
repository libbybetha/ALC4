package com.example.libby.alc4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private android.widget.Button button1;
    private android.widget.Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (android.widget.Button) findViewById(R.id.button1);
        button1.setOnClickListener(new android.view.View.OnClickListener(){

            @Override
            public void onClick(android.view.View v ){
                openABOUTALC();

            }
        });
        button2 = (android.widget.Button) findViewById(R.id.button2);
        button2.setOnClickListener(new android.view.View.OnClickListener(){

            @Override
            public void onClick(android.view.View v ){
                openMYPROFILE();

            }
        });
    }
    public void openABOUTALC(){
        android.content.Intent intent = new android.content.Intent(this,ABOUTALC.class);
        startActivity(intent);
    }
 public void openMYPROFILE(){
        android.content.Intent intent = new android.content.Intent(this,MYPROFILE.class);
        startActivity(intent);
    }
}

