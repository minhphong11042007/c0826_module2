package ss7_abstractclass_interface.resizeable;

public class Circle extends Shape implements IResizeable {
    private double radius;

    public Circle() {}

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }

    @Override
    public void resize(double percent) {
        this.radius *= (1 + percent / 100);
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}
