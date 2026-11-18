package ss6_inheritance.circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.2, "Red");
        Cylinder cylinder = new Cylinder(2.3, "Blue", 3.2);

        System.out.println(circle);
        System.out.println(cylinder);

        System.out.println("Circle's area: " + circle.getArea());

        System.out.println("Cylinder's area: " + cylinder.getTotalSurfaceArea());
        System.out.println("Cylinder's volume: " + cylinder.getVolume());
    }
}
