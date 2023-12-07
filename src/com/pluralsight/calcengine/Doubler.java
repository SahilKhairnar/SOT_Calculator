package com.pluralsight.calcengine;

public class Doubler extends CalculateBase{

    public Doubler() {
    }

    public Doubler(double leftVal, double rightVal, double result) {
        super(leftVal, rightVal, result);
    }

    public Doubler(double rightVal, double leftVal) {
        super(rightVal, leftVal);
    }
    @Override
    public void calculate() {
        double value = getRightVal() * 2;
        setResult(value);
    }
}
