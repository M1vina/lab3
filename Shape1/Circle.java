package Shape1;

abstract class Circle extends Shape {
    protected double radius;

    public Circle(){}
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
