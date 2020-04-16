package se.lexicon.carl;
import java.util.Scanner;

public class App
{
    public static double num1;
    public static double num2;
    public static double result;

    public static void calcResult() {

        boolean keepTrying = true;
        System.out.println("Welcome to the calculator.");

        do {

            System.out.println("Start calculating (1) or Exit (9)?");
            double choice = getNumber();

            if (choice == 1) {

                String operator;

                System.out.println("Enter the first number: ");
                num1 = getNumber();
                System.out.println("Enter the second number: ");
                num2 = getNumber();

                Scanner op = new Scanner(System.in);
                System.out.println("And just how do you want to calculate this mess? (+-*/)");

                operator = op.next();

                if (operator.equals("+")) {
                    System.out.println("The result is " + add(num1, num2) + ".");
                } else if (operator.equals("-")) {
                    System.out.println("The result is " + subtract(num1, num2) + ".");
                } else if (operator.equals("*")) {
                    System.out.println("The result is " + multiply(num1, num2) + ".");
                } else if (operator.equals("/")) {
                    System.out.println("The result is " + divide(num1, num2) + ".");
                } else {
                    System.out.println("Not a valid operator. Try again.");
                }
            } else if (choice == 9) {
                System.out.println("Bye.");
                keepTrying = false;
            } else {
                System.out.println("Please use the proper numbers.");
            }
        } while (keepTrying);
    }

    public static double add(double num1, double num2) {
        result = (num1 + num2);
        return result;
    }

    public static double subtract(double num3, double num4) {
        result = (num3 - num4);
        return result;
    }

    public static double multiply(double num1, double num2) {
        result = (num1 * num2);
        return result;
    }

    public static double divide(double num1, double num2) {
        result = (num1 / num2);
        return result;
    }

    static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static double getNumber() {   // This part I had help with.
        boolean valid = false;
        double number = 0;
        while (!valid) {
            try {
                number = Double.parseDouble(getStringFromUser().trim().replace(',', '.'));
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Try again.");
            }
        }
        return number;
    }

    public static void main( String[] args )
    {
        calcResult();
    }
}
