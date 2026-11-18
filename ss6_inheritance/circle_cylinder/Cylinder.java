package ss6_inheritance.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " - " +
                "Chiều cao: " + this.height;
    }

    public double getLateralSurfaceArea() {
        return 2 * Math.PI * this.height;
    }

    public double getBaseArea() {
        return super.getRadius() * super.getRadius() * Math.PI;
    }

    public double getTotalSurfaceArea() {
        return getBaseArea() + getLateralSurfaceArea();
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}
