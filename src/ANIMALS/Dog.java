package ANIMALS;

import java.sql.SQLOutput;

public class Dog extends Animals {
    public Dog(boolean isAlive, int age, String food, String habitat) {
        this.isAlive = isAlive;
        this.age = age;
        this.food = food;
        this.habitat = habitat;

    }

    public String sound() {
        return "AwwOOOOOOOoooOO";
    }

    public String movement() {
        return "Run, Roll, Wag Tail, DESTROY";
    }

    public static void main(String[] args) {
        Dog Korra = new Dog(true, 8, "animals", "couch and naughty girl kennel");


     //I'm doing something wrong because all of my examples can't access the super class. :(

//        System.out.println(Korra.sound());
    }


}
