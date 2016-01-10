package com.example.android.additionapp.ui.model;

/**
 * Created by hernandez on 1/9/2016.
 */
public class Sum {

    private float mFirstNumber, mSecondNumber, mSum;

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

    public float getSum() {
        return mSum;
    }

    public void setSum(float sum) {
        mSum = sum;
    }

    public float add(float a, float b){
        mSum = a + b;
        return mSum;
    }
}
