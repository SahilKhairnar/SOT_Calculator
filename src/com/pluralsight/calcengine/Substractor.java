package com.pluralsight.calcengine;

public class Substractor extends CalculateBase {
    public Substractor() {
    }

    public Substractor(double leftVal, double rightVal, double result) {
        super(leftVal, rightVal, result);
    }

    public Substractor(double rightVal, double leftVal) {
        super(rightVal, leftVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
