
import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bob looks eagerly, pressing for a conversation:");
        boolean continuing = true;
        do {

            String input = sc.nextLine();

            if (input.endsWith("?")) {
                System.out.println("Bob says : \"sure\". ");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa man! Chill out!");
            } else if (input.trim().equals("")) {
                System.out.println("Fine! Be that way!");
            }else if(input.equals("no")){
                System.out.println("Nice talking to you!");
            } else {
                System.out.println("Whatever.");
            }
            if (input.equals("no")) {
                continuing = false;
            }
        } while (continuing);
        }
    }

