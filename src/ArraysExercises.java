import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] personArray, Person person) {
        Person[] personArrayTwo = Arrays.copyOf(personArray, personArray.length + 1);
        personArrayTwo[personArray.length] = person;
        return personArrayTwo;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        toString is necessary because otherwise its just the reference

        Person[] personArray = new Person[3];
        personArray[0] = new Person("Korra");
        personArray[1] = new Person("Nori");
        personArray[2] = new Person("Ruby");


        for (Person person : personArray) {
            System.out.println(person.name);
        }

        personArray = addPerson(personArray, new Person("Hocus Pocus"));

        for (Person person : personArray) {
            System.out.println(person.name);
        }

//        personArray = addPerson(personArray, new Person("Lu"));
//
//        for (Person person : personArray) {
//            System.out.println(person.name);
//        }


    }
}






