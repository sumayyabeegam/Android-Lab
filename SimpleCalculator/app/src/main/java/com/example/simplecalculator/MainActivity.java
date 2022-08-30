package com.example.simplecalculator;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.simplecalculator.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
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
        int number1,number2,sum,sub,mul,div;
        num1=(EditText) findViewById(R.id.numb1);
        num2=(EditText) findViewById(R.id.numb2);
           number1 = Integer.parseInt(num1.getText().toString());
           number2 = Integer.parseInt(num2.getText().toString());
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
    }
}