package com.pluralsight.calcengine;

public class Multiplier extends CalculateBase {

    public Multiplier() {}
    public Multiplier(double leftVal, double rightVal, double result) {
        super(leftVal, rightVal, result);
    }
    public Multiplier(double rightVal, double leftVal) {
        super(rightVal, leftVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
