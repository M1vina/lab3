package Shape1;

abstract class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){}
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}