
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {


//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

        //not right
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("fizz");
                if (i % 5 == 0){
                    System.out.println("buzz");
                    if (i % 5 ==0 && i % 3 ==0){
                        System.out.println("fizzbuzz");
                    } else{
                        System.out.println(i);
                    }

                }
            }

        }


        int q = 100;
        do
        {
            q =q-5;
            System.out.print(q+" ");
            if (q % 5 == 0) System.out.println();
        }
        while (q > 0);

        System.out.println();


        String wordOne = scanner.next();



     //   3 Table of users

//        Scanner input = new Scanner(System.in);
//        boolean continuing = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//
//            int number = Integer.parseInt(input.nextLine());
//
//            System.out.println("Here is your table: ");
//            System.out.println("Number \t| Squared \t| Cubed");
//            System.out.println("----------------------------");
//
//            for (int i = 1; i <= number; i++) {
//                System.out.printf("%d \t\t| %d \t\t| %d\n", i, i * i, i * i * i);
//            }
//
//            System.out.println("Would you like to continue? y/n");
//            if (input.nextLine().equals("n")){
//                continuing = false;
//            }
//       }while(continuing);

        Scanner input = new Scanner(System.in);
        boolean continuing = true;
        do {
            System.out.println("Enter a numerical grade from 0 to 100: ");
            int grade = Integer.parseInt(input.nextLine());

            if (grade <= 59) {
                System.out.println("F");

            } else if (grade <= 66) {
                System.out.println("D");
            } else if (grade <= 79) {
                System.out.println("C");
            } else if (grade <= 87) {
                System.out.println("B");
            } else if (grade <= 100) {
                System.out.println("A");
            } else {
                System.out.println("Invalid number");
            }

            System.out.println("Would you like to continue? y/n");
            if (input.nextLine().equals("n")) {
                continuing = false;
            }
        } while (continuing);

    }
}
