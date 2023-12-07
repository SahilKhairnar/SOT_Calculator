package com.pluralsight.calcengine;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        performCalculations();
        executeInteractively();
        //dynamicInteractivity();
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

    //Implementing Enums

    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void dynamicInteractivity() {
        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
                new Adder()
        });

        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        helper.process(userInput);
    }
    private static void performOperation(String[] parts) {
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        CalculateBase calculation = CreateCalculation(operation, leftVal, rightVal);
        calculation.calculate();
        System.out.println("Operation performed: " + operation);
        System.out.println(calculation.getResult());
    }


    private static CalculateBase CreateCalculation(MathOperation operation, double rightVal, double leftVal){
        CalculateBase calculation = null;

        switch(operation){
            case ADD:
                calculation = new Adder(rightVal, leftVal);
                break;
            case SUBTRACT:
                calculation = new Substractor(leftVal, rightVal);
                break;
            case MULTIPLY:
                calculation = new Multiplier(leftVal, rightVal);
                break;
            case DIVIDE:
                calculation = new Divider(leftVal, rightVal);
                break;
            case DOUBLE:
                calculation = new Doubler(leftVal, rightVal);
                break;
        }
        return calculation;
    }

}
