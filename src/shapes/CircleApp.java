package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();

        do {
            double radius = input.getDouble("Enter a radius for the circle");

            Circle circle = new Circle(radius);

            System.out.println(String.format("The area of the circle is %.2f", circle.getArea()));
            System.out.println(String.format("The circumference of the circle is %.2f", circle.getCircumference()));
        } while (input.yesNo("Would you like to continue y/n?"));

        System.out.println("The total number of circles created is: " + Circle.getNumCreated());
    }
}