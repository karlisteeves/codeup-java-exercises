package shapes;

public class Square extends Rectangle {
    public int side;

    Square(int side){
        super(side, side);
        this.side = side;
    }
}
