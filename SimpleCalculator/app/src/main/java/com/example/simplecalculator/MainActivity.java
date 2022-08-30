package com.example.simplecalculator;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   EditText num1,num2;
   TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        double number1,number2,sum,sub,mul,div;
        num1=(EditText) findViewById(R.id.numb1);
        num2=(EditText) findViewById(R.id.numb2);
           number1 = Double.parseDouble(num1.getText().toString());
           number2 = Double.parseDouble(num2.getText().toString());
           result =  (TextView) findViewById(R.id.res);
           if(view.getId()==R.id.add){
               sum=number1+number2;
               result.setText(Double.toString(sum));
           }

           if (view.getId()==R.id.sub){
               sub=number1-number2;
               result.setText(Double.toString(sub));
           }

           if(view.getId()==R.id.mult){
               mul=number1*number2;
               result.setText(Double.toString(mul));
           }
           if(view.getId()==R.id.div){
               div=number1/number2;
               result.setText(Double.toString(div));
           }
           if(view.getId()==R.id.clr){
               num1.setText(" ");
               num2.setText(" ");
               result.setText(" ");
           }
    }
}