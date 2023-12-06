package com.pluralsight.calcengine;

public class Substractor extends CalculateBase {
    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
