package ss5_static_access_modifier.assignments.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getCircumference() {
        return 2*Math.PI*radius;
    }
}
