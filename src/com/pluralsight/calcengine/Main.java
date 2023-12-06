package com.pluralsight.calcengine;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {
        MathEquation[] equations = new MathEquation[5];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 115.0d, 9.0);
        equations[4] = new MathEquation('x', 9.0);


        for(MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println("Average result = " + MathEquation.getAverageResult());
        System.out.println();

        //Method overload check
        MathEquation methodOverLoadCheck = new MathEquation('m');
        double left = 5.0d;
        double right = 101.0d;
        methodOverLoadCheck.execute(left,right);
        System.out.println("The result of method overload is " + methodOverLoadCheck.getResult());
        System.out.println();

        //Method overload integer check
        MathEquation integerCheck = new MathEquation('d');
        int leftint = 20;
        int rightint = 3;
        integerCheck.execute(leftint, rightint);
        System.out.println("The result of operation on integers is: " + integerCheck.getResult());

        //Calculations using inheritances
        System.out.println();
        System.out.println("-----------Inheritance-------------");
        Adder adder = new Adder();
        adder.setLeftVal(10.0d);
        adder.setRightVal(5.0d);
        adder.calculate();
        System.out.println("The result of calculation is: " + adder.getResult());

    }
}
