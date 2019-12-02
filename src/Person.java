import org.w3c.dom.ls.LSOutput;

public class Person {

    public String name;

    public Person(String nameExt){
        this.name = nameExt;
    }

    // returns the person's name
    public String getName() {
        return name;
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello from %s%n", this.name);
    }

    public static void main(String[] args) {

//    Person rick = new Person("Rick Sanchez");
//        System.out.println("rick.name = " + rick.name);
//        rick.getName();
//        rick.sayHello();
//
//        rick.setName("Pickle Rick");
//
//        System.out.println("rick.name = " + rick.name);
//        rick.getName();
//        rick.sayHello();


//        TEST 1
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        TEST 2
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        TEST 3
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        john, john, jana, jane
//        would have thought john john john jane




    }





//
//    //Attributes**************************
//    public String firstName;
//    public String lastName;
//    public static boolean liveOnEarth = true;
//    public static long worldPopulation = 7_500_000_000L;
//    private String ssn;
//
//
////Constructor**************************
//    //    executes every time a new person is made
////    public Person() {
////        this.worldPopulation++;
////    }
//
//    public Person(String firstNameExternal, String lastNameExternal, String ssnExternal) {
//        this.firstName = firstNameExternal;
//        this.lastName = lastNameExternal;
//        this.ssn = ssnExternal;
//        this.worldPopulation++;
//    }
//
//
//    //Methods******************************
//    public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }
//
////    commonly known as a getter
//    public String getSsn() {
//        System.out.println("authorization process");
//        System.out.println("verification process");
//        System.out.println("email confirmation");
//        return this.ssn;
//    }
//
//
// public void provideDocuments(String docs, double price){
//        if(docs.equalsIgnoreCase("birthCertificate")){
//            this.makePayment(price);
//        } else {
//            System.out.println("call security on " + this.firstName + "!");
//        }
// }
//
//// since makepayment is private, can be accessed through another function(above)
//    private void makePayment(double money){
//        System.out.println(this.firstName + " paid $" + money + ". Thank you!");
//    }

}