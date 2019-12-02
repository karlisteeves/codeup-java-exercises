package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please enter a word: ");
        return scanner.nextLine();
    }

    //bonus asking for prompt
    public String getString(String prompt){
        if(prompt.isEmpty()){
            System.out.println("Please enter a word: ");
        }else {
            System.out.println(prompt);
        }
        return getString();
    }

    public boolean yesNo(){
        System.out.println("Please enter y/n");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Give me a number");
        int number = Integer.parseInt(this.scanner.nextLine());
        if (number >= min && number <= max) {
            return number;
        } else {
            System.out.println("out of range");
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Enter a number under 120: ");
        return Integer.parseInt(this.scanner.nextLine());
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a decimal number: ");
        double number = Double.parseDouble(scanner.nextLine());
        if (number >= min && number <= max){
            return number;
        } else {
            System.out.println("Out of range");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("please enter a decimal: ");
        return Double.parseDouble(scanner.nextLine());
    }
}