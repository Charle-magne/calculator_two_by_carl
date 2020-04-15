package se.lexicon.carl;
import java.util.Scanner;

public class App
{
    private static double num1;
    private static double num2;
    private static String operand;
    private static double result;

    public static double addition(double num1, double num2){
        result = num1+num2;
        return result;
    }

    public static double subtraction(double num1, double num2){
        result = num1-num2;
        return result;
    }

    public static double multiplication(double num1, double num2){
        result = num1*num2;
        return result;
    }

    public static double division(double num1, double num2){
        result = num1/num2;
        return result;
    }

    public static double userInput() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static double calcResult(){

        System.out.println("This is the Calculator II. Be in awe.");

        System.out.println("First value:");
        num1 = userInput();
        System.out.println("Next value:");
        num2 = userInput();

        System.out.println("Pick operand (+ - * /):");
        Scanner op = new Scanner(System.in);
        operand = op.next();

        if (operand.equals("+")) {
            addition(num1, num2);
        } else if (operand.equals("-")) {
            subtraction(num1, num2);
        } else if (operand.equals("*")) {
            multiplication(num1, num2);
        } else if (operand.equals("/")) {
            division(num1, num2);
        }
        else {
            System.out.println("Not a valid operand.");
        }
        return result;
    }

    public static void main( String[] args )
    {
        System.out.println("The result is " + calcResult() + ".");
    }
}
