package com.pluralsight.calcengine;

public class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;
    public CalculateBase(){};
    public CalculateBase(double leftVal, double rightVal, double result) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.result = result;
    }

    public CalculateBase(double rightVal, double leftVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public double getLeftVal() { return leftVal; }
    public void setLeftVal(double leftVal) { this.leftVal = leftVal; }
    public double getRightVal() { return rightVal; }
    public void setRightVal(double rightVal) { this.rightVal = rightVal; }
    public double getResult() { return result; }
    public void setResult(double result) { this.result = result; }

    public void calculate(){}
}

