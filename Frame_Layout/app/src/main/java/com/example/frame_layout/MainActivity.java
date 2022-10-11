package com.example.frame_layout;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.frame_layout.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  {

    ImageView img1,img2,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void swapimage(View view) {
        img1=(ImageView) findViewById(R.id.img1);
        img2=(ImageView) findViewById(R.id.img2);
        img3=(ImageView) findViewById(R.id.img3);

        if(view.getId()==R.id.img1){
            img1.setVisibility(view.GONE);
            img2.setVisibility(view.VISIBLE);
            img3.setVisibility(view.VISIBLE);
        }
        else{
            img1.setVisibility(view.VISIBLE);
            img2.setVisibility(view.GONE);
            img3.setVisibility(view.GONE);
        }

    }
}