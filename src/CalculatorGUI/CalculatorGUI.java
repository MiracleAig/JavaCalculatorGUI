package CalculatorGUI;


import java.util.Scanner;

public class CalculatorGUI {

    private boolean check;
    Scanner s = new Scanner(System.in);
    private MathOperator operators;
    private int userSelection;

    public void ShowMenu(){
        System.out.println("--- Java Calculator ---");
        System.out.println("Options:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n**ALL VALUES MUST BE A DOUBLE**");
        MakeSelection();
        System.out.println();



    }

    public MathOperator getOperators() {return operators;}

    public void ThrowError(){
        System.out.println("Please enter a number 1 - 4 as a int.");
        System.out.println();
        MakeSelection();

    }

    public void processUserSelection(int userSelection) {

    }



    public void CheckSelection(int userInput){
        if(userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4){
            // continue program
        } else ThrowError();
    }
    public void MakeSelection(){
        System.out.print("Make your selection now: ");
        userSelection = s.nextInt();
        CheckSelection(userSelection);
    }

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
