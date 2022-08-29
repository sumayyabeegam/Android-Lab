package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String default_username="Sumayya";
    String default_password="123";

    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart function", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause function", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop function", Toast.LENGTH_SHORT).show();
    }

    public void validateLogin(View view) {
        EditText username = (EditText) findViewById(R.id.uname);
        EditText password = (EditText) findViewById(R.id.password);
        EditText emailaddress = (EditText) findViewById(R.id.email_address);

        String user_name = username.getText().toString();
        String pass_word = password.getText().toString();
        String email_address = emailaddress.getText().toString();

        String message= "Invalid credentials";
        if(user_name.equals(default_username) && pass_word.equals(default_password)) {
            message = "Login successful";
            Toast.makeText(this,message,Toast.LENGTH_LONG).show();

            sp = getSharedPreferences("UserInfo",MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();

            editor.putString("user_name",user_name);
            editor.putString("email_address",email_address);
            editor.commit();

            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

    }
}