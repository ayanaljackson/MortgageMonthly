package com.example.mortgagemonthly;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    //Ayana Jackson
    //purpose: mortgage calculator
    //11-14-2022

    //declare variables
    TextView textView;
    EditText loanAmount;
    EditText interestRate;
    EditText timeline;
    TextView monthlyPayment;
    Button btnSolve;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assign variables
        textView = (TextView) findViewById(R.id.textView);
        loanAmount = (EditText) findViewById(R.id.loanAmount);
        interestRate = (EditText) findViewById(R.id.interestRate);
        timeline = (EditText) findViewById(R.id.timeline);
        monthlyPayment = (TextView) findViewById(R.id.monthlyPayment);

        //button clicker for monthly payment event
        btnSolve.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                double loan = Integer.parseInt(loanAmount.getText().toString());
                double rate = Integer.parseInt(interestRate.getText().toString());
                double time = Integer.parseInt(timeline.getText().toString());

                double monthPayment = loan * (rate*Math.pow(1+rate, time) / Math.pow(1+rate, time) + 1);
                monthlyPayment.setText(Double.toString(monthPayment));
            }
        });

        if (loanAmount.length() == 0){
            loanAmount.setError("empty");
        }
        if (interestRate.length() == 0){
            interestRate.setError("empty");
        }
        if (timeline.length() == 0)
                timeline.setError("empty");
        }


    }
