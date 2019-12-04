package madlibs;

public class Version1 extends FillThisIn {
    public Version1(String [] words){
        this.name = words[0];
        this.color = words[1];
        this.randomObject = words[2];
        this.location = words[3];
    }

    public String greeting(){
        return "Well hi!";
    }

    public String goToLocation(){
        return "He went to the " + location;
    }

    public String playWithObject(){
        return "He played with the " + randomObject;
    }
}
