package com.example.android.additionapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.additionapp.R;
import com.example.android.additionapp.ui.model.Product;

public class ProductActivity extends ActionBarActivity {

    private EditText productEditText;
    private Button previousButton;
    private float firstNumber, secondNumber, product;
    private Product productObject = new Product();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        productEditText = (EditText) findViewById(R.id.productEditText);
        previousButton = (Button) findViewById(R.id.previousButton);

        Intent intent2 = getIntent();
        firstNumber = intent2.getFloatExtra(getString(R.string.first_number), 0);
        secondNumber = intent2.getFloatExtra(getString(R.string.second_number), 0);
        product = productObject.multiply(firstNumber, secondNumber);
        productEditText.setText(product+"");

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }





}
