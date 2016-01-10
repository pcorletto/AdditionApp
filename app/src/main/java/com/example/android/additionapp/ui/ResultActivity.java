package com.example.android.additionapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.additionapp.R;
import com.example.android.additionapp.ui.model.Sum;

public class ResultActivity extends ActionBarActivity {

    private float firstNumber, secondNumber, sum;
    private EditText sumEditText;
    private Button returnButton, productButton;
    private Sum sumObject = new Sum();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        sumEditText = (EditText) findViewById(R.id.sumEditText);
        returnButton = (Button) findViewById(R.id.returnButton);
        productButton = (Button) findViewById(R.id.productButton);

        Intent intent = getIntent();
        firstNumber = intent.getFloatExtra(getString(R.string.first_number), 0);
        secondNumber = intent.getFloatExtra(getString(R.string.second_number), 0);
        sum = sumObject.add(firstNumber, secondNumber);

        sumEditText.setText(sum+"");

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        productButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ResultActivity.this, ProductActivity.class);
                intent2.putExtra(getString(R.string.first_number), firstNumber);
                intent2.putExtra(getString(R.string.second_number), secondNumber);
                startActivity(intent2);
            }
        });

    }





}
