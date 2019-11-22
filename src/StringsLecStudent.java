
import java.util.Scanner;

public class StringsLecStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter your name:");

        String input = sc.nextLine();

        String name = "Jane Doe";

        /*
         *  TO DO: Write the control statements below to check the input
         *  String using Java methods.
         */


        //  If the input is an exact match to String name...
        //  Print message: "Welcome Jane Doe!"

//        if(input.equals(name)){
//            System.out.println("Welcome Jane Doe!");
//        }

        //  If the input is not capitalized correctly...
        //  Print message: "Names are proper nouns."

        if(input.equals(name)){
            System.out.println("Welcome Jane Doe!");
        }else{
            System.out.println("Names with proper nouns.");
        }

        //  If the input starts with "Jane"...
        //  Print message: "Hi Jane!"
        if(input.startsWith("Jane")){
            System.out.println("Hi Jane!");
        }

        //  If the input ends with "Doe"...
        //  Print message: "Doe, a deer..."
        if(input.endsWith("Doe")){
            System.out.println("Doe, a deer...");
        }

        /*
         *  TO DO TOGETHER: Uncomment each line and view the results of each
         *  String manipulation method.
         */

        System.out.println(name.charAt(3));
        //print 'e'

        System.out.println(name.indexOf("Doe"));
        //print 5

        System.out.println(name.lastIndexOf("e"));

        //prints 7

        System.out.println(name.length());

        //returns the length of the string

        System.out.println(name.replace("Doe", "Smith"));
        //changes the last name

        System.out.println(name.substring(3));
        //returns e Doe

        System.out.println(name.substring(0,3));
        //returns Jan

//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());


        // trim is really useful for catching user errors on input.
//        String trimThis = "    too many spaces   ";

//        System.out.println(trimThis);
//        System.out.println(trimThis.trim());

        // How would we fix this?
        System.out.println("Here is a backslash \\");
      //by adding a backslash

    }
}