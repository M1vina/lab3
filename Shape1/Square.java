package Shape1;

abstract class Square extends Rectangle {
    protected double side;

    public Square() {
    }

    public Square(double side) {
    }

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}