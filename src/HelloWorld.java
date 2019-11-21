
import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
//        System.out.println("Hello World!");

        int myFavoriteNumber = 5;
        System.out.println(myFavoriteNumber);

        String myString = "My name is Karli";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

//    Scanner scanner = new Scanner(System.in);

//    System.out.println("hey there friend. What is on your mind?");
//    String input = scanner.nextLine();
//
//    System.out.printf("%s", input);


//        double pi = 3.14159;
//        System.out.format("%.2f%n", pi);
//


        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println(userInput);

//        scanner.nextLine();


//        System.out.print("Enter three words: ");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);


//        scanner.nextLine();

        System.out.println("hey there friend. What is on your mind?");
        String input = scanner.nextLine();

        System.out.printf("%s", input);

        scanner.nextLine();

        System.out.println("Please enter the length and width of CodeUp classroom:");
        String width = scanner.next();
        int w = Integer.parseInt(width);
        String height = scanner.next();
        int h = Integer.parseInt(height);

        System.out.println("the perimeter is :" + ((2 * w)) + ((2 * h)));
        System.out.println("the area is :" + ((h * w)));

    }
}


