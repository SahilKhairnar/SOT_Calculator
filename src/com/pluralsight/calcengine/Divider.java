package com.pluralsight.calcengine;

public class Divider extends CalculateBase {
    public Divider() {
    }

    public Divider(double leftVal, double rightVal, double result) {
        super(leftVal, rightVal, result);
    }

    public Divider(double rightVal, double leftVal) {
        super(rightVal, leftVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
