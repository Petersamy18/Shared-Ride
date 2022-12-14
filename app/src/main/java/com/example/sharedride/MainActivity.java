package com.example.sharedride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import user.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello World!");
    }

}