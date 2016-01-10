package com.example.android.additionapp.ui.model;

/**
 * Created by hernandez on 1/10/2016.
 */
public class Product {

    private float mFirstNumber;
    private float mSecondNumber;
    private float mProduct;

    public float getFirstNumber() {
        return mFirstNumber;
    }

    public void setFirstNumber(float firstNumber) {
        mFirstNumber = firstNumber;
    }

    public float getSecondNumber() {
        return mSecondNumber;
    }

    public void setSecondNumber(float secondNumber) {
        mSecondNumber = secondNumber;
    }

    public float getProduct() {
        return mProduct;
    }

    public void setProduct(float product) {
        mProduct = product;
    }

    public float multiply(float a, float b){

        mProduct = a * b;
        return mProduct;
    }
}
