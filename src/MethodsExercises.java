import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//
        System.out.println(multiplyWithLoop(7, 7));
        System.out.println(multiplyWithRecursion(7, 7));
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);

//        boolean continuing = true;
//        Scanner input = new Scanner(System.in);
//
//        do {
//            System.out.print("Enter a number between 1 and 39: ");
//            int factorialInput = getInteger(1, 39);
//
//            long factorial = recursiveFactorial(factorialInput);
//            System.out.println(factorialInput + "! = " + factorial);
//
//            System.out.println("Would you like to continue? y/n");
//            if (input.nextLine().equals("n")) {
//                continuing = false;
//            }
//        } while (continuing);

//        boolean continuing = true;
//        do {
//            System.out.println("How many sides on a pair of dice");
//            int sides = Integer.parseInt(input.nextLine());
//            System.out.println("Would you like to roll the dice? y/n");
//
//            if (input.nextLine().equals("y")) {
//                int side1 = (int) (Math.random() * sides) + 1;
//                int side2 = (int) (Math.random() * sides) + 1;
//                System.out.println("side1 = " + side1);
//                System.out.println("side2 = " + side2);
//            }
//            System.out.println("Would you like to roll again? y/n");
//            if (input.nextLine().equals("n")) {
//                continuing = false;
//            }
//        } while (continuing);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int multiplyWithLoop(int num1, int num2) {
        int output = 0;
        for (int i = 0; i < num2; i++) {
            output += num1;
        }
        return output;
    }

    public static int multiplyWithRecursion(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 + multiplyWithRecursion(num1, num2 - 1);
        }
    }

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);

        System.out.print(String.format("Enter a number between %d and %d: ", min, max));
        int num = Integer.parseInt(input.nextLine());

        if (num > min && num < max) {
            return num;
        } else {
            System.out.println("Invalid input");
            return getInteger(min, max);
        }
    }

    public static long factorial(int num) {

        long output = 1;
        for (int i = 1; i <= num; i++) {
            output *= i;
        }
        return output;
    }

    public static long recursiveFactorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }
}