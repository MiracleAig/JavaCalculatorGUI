package CalculatorGUI;


public class CalculatorGUI {

    private MathOperator operators;
    public void ShowMenu(){
        System.out.println("--- Java Calculator ---");
        System.out.println("Options:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n**ALL VALUES MUST BE A DOUBLE**");
    }

    public MathOperator getOperators() {return operators;}

    public void getMathOperations(){
        switch (getOperators()){
            case ADDITION -> addition();
            case SUBTRACTION -> subtraction();
            case MULTIPLICATION -> multiplication();
            case DIVISION -> division();
        }
    }

    private double addition(){
        System.out.println("You have picked addition.");
        return 0.0;
    }
    private double subtraction(){
        System.out.println("You have picked subtraction.");
        return 0.0;

    }
    private double multiplication(){
        return 0.0;

    }
    private double division(){
        return 0.0;

    }



}

enum MathOperator{
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION
}
