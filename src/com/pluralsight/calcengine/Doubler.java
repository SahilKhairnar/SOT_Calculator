package com.pluralsight.calcengine;

public class Doubler extends CalculateBase{
    @Override
    public void calculate() {
        double value = getRightVal() * 2;
        setResult(value);
    }
}
