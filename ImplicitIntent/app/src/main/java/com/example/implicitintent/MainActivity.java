package com.example.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

   Intent intent,chooser=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openImplicitIntent(View view) {
        if(view.getId()== R.id.mapbtn){
            intent = new Intent(intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:10.067,76.869"));
            chooser = intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);

        }
        if(view.getId()== R.id.playstorebtn){
            intent = new Intent(intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://detials?id=com.king.candycrushsaga"));
            startActivity(intent);

        }
        if(view.getId()==R.id.mailbtn){
            intent = new Intent(intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto"));
            String to[]={"sumayyabeegam27@gmail.com"};
            intent.putExtra(intent.EXTRA_EMAIL,to);
            intent.putExtra(intent.EXTRA_SUBJECT,"From Emulator");
            intent.setType("message/rfc822");
            intent.putExtra(intent.EXTRA_TEXT,"I have attached an attachment");
            chooser = intent.createChooser(intent,"messenger");
            startActivity(chooser);
        }
    }

}