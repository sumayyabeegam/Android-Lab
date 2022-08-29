package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView username = (TextView) findViewById(R.id.user_name);
        TextView emailaddress = (TextView) findViewById(R.id.email_address);

        sp = getSharedPreferences("UserInfo",MODE_PRIVATE);

        String user_name = sp.getString("user_name","");
        String email_address = sp.getString("email_address","");

        username.setText(user_name);
        emailaddress.setText(email_address);

        Button logoutBtn = (Button) findViewById(R.id.logout);

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}