package com.example.custom_toast;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        findViewById(R.id.submit).setOnClickListener(view -> {
            Toast toast = new Toast(this);
            toast.setView(LayoutInflater.from(this).inflate(R.layout.toast,null));
            toast.show();
        });
    }
}