package com.example.android.additionapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.additionapp.R;


public class MainActivity extends ActionBarActivity {

    private float firstNumber, secondNumber;
    private EditText firstNumberEditText, secondNumberEditText;
    private Button addButton, resetButton;
    //private Sum sumObject = new Sum();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumberEditText = (EditText) findViewById(R.id.firstNumberEditText);
        secondNumberEditText = (EditText) findViewById(R.id.secondNumberEditText);
        addButton = (Button) findViewById(R.id.addButton);
        resetButton = (Button) findViewById(R.id.resetButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Float.parseFloat(firstNumberEditText.getText().toString());
                secondNumber = Float.parseFloat(secondNumberEditText.getText().toString());
                //sum = sumObject.add(firstNumber, secondNumber);

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra(getString(R.string.first_number), firstNumber);
                intent.putExtra(getString(R.string.second_number), secondNumber);
                startActivity(intent);

            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumberEditText.setText("");
                secondNumberEditText.setText("");
            }
        });
    }





}
