package ss5_static_access_modifier.assignments.access_modifier;

public class Run {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle 1 - Bán kính: " + c1.getRadius() + " | Diện tích: " + c1.getArea() + " | Chu vi: " + c1.getCircumference());

        Circle c2 = new Circle(2.5);
        System.out.println("Circle 2 - Bán kính: " + c2.getRadius() + " | Diện tích: " + c2.getArea() + " | Chu vi: " + c2.getCircumference());
    }
}
