package ss6_inheritance.point_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 4);
        MoveablePoint moveablePoint = new MoveablePoint(2, 4, 3, 6);

        System.out.println(point);
        System.out.println(moveablePoint);

        System.out.println(moveablePoint.move());
    }
}
