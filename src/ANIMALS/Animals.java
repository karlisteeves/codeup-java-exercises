package ANIMALS;

abstract class Animals {
    public boolean isAlive;
    public int age;
    public String food;
    public String habitat;


    public abstract String sound();
    public int getOlder(){
       return age + 1;
    }
    public abstract String movement();

}
