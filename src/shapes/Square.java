package shapes;

public class Square extends Rectangle {
    public int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }
}
