package com.example.grades;


import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView percent,msg;


        percent = (TextView) findViewById(R.id.percentage);
        msg = (TextView) findViewById(R.id.message);


        SharedPreferences sp = getSharedPreferences("MarkDetails",MODE_PRIVATE);
        int percentage = sp.getInt("percentage",0);
        String message = sp.getString("message","Message");
        String percent_message = percentage + "%";

        percent.setText(percent_message);
        msg.setText(message);

        if (percentage < 50)
            msg.setTextColor(getResources().getColor(R.color.danger));
    }
}