package Practice5;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by lapte on 30.06.2016.
 */
public class MyCalculator2 {
    public static void main(String[] args) throws IOException {
        double firstNumber;
        double secondNumber;
        String mathematicalOperation;
        String equalOperation;
        double result = 0.0;
        String resultString = "no calculations";

        String myChoise = "my choise";


        while (!(myChoise.equals("q"))) {
            System.out.println("Enter the first number, mathematic operation (\"+\", \"-\", \"*\" or \"/\"), the second number and \"=\"");
            firstNumber = enterTheNumber();

            boolean flag = false;
            do {
                mathematicalOperation = enterMathematicalOperation();
                if (mathematicalOperation.equals("+") || mathematicalOperation.equals("-")
                        || mathematicalOperation.equals("*") || mathematicalOperation.equals("/")) {

                    flag = true;
                } else {
                    System.out.println("Try again");
                }
            } while (!(flag));

            secondNumber = enterTheNumber();

            switch (mathematicalOperation) {
                case "+": {
                    result = firstNumber + secondNumber;
                    //resultString = String.valueOf(System.out.printf("%s + %s = %s%n", firstNumber, secondNumber, result));
                    break;
                }
                case "-": {
                    result = firstNumber - secondNumber;
                    //resultString = String.valueOf(System.out.printf("%s - %s = %s%n", firstNumber, secondNumber, result));
                    break;
                }
                case "*": {
                    result = firstNumber * secondNumber;
                    //resultString = String.valueOf(System.out.printf("%s * %s = %s%n", firstNumber, secondNumber, result));
                    break;
                }
                case "/": {
                    result = firstNumber / secondNumber;
                    //resultString = String.valueOf(System.out.printf("%s / %s = %s%n", firstNumber, secondNumber, result));
                    break;
                }

            }

            equalOperation = enterMathematicalOperation();
            if (equalOperation.equals("=")) {
                System.out.println(result);
                System.out.println(firstNumber + mathematicalOperation + secondNumber + equalOperation + result);
            } else {
                System.out.println("Error");
            }

            System.out.println("Do you want to calculate again? Enter: any word to continue or \"q\" for quit");

            myChoise = chooseToQuit();

        }
        System.out.println("Thank you!");
    }


    public static String enterMathematicalOperation() throws IOException {

        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static double enterTheNumber() throws IOException {
        double number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextDouble();
        return number;
    }

    public static String chooseToQuit() throws IOException {
        String myChoise;
        Scanner scanner = new Scanner(System.in);
        myChoise = scanner.nextLine();
        return myChoise;
    }
}
