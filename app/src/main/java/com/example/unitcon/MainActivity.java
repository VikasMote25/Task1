package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText entername;
    Button miles;
    Button meter;
    Button centimeter;
    Button kilometer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output=findViewById(R.id.output);
        entername=findViewById(R.id.editTextNumberDecimal);
        miles=findViewById(R.id.miles);
        meter=findViewById(R.id.meter);
        centimeter=findViewById(R.id.centimeter);
        kilometer=findViewById(R.id.kilometer);
        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=entername.getText().toString();
                int number=Integer.parseInt(num);
                float meter=(number*1000);
                output.setText("values in meter :"+meter);
            }
        });

        centimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=entername.getText().toString();
                int number=Integer.parseInt(num);
                float centimeter=(number*100);
                output.setText("values in centimeter :"+centimeter);
            }
        });

        kilometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=entername.getText().toString();
                int number=Integer.parseInt(num);
                double kilometer=(number/1000);
                output.setText("values in kilometer :"+kilometer);
            }
        });

        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=entername.getText().toString();
                int number=Integer.parseInt(num);
                double miles=(number/1.609);
                output.setText("values in miles :"+miles);
            }
        });
    }
}