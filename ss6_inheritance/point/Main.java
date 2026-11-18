package ss6_inheritance.point;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        Point3D point3D = new Point3D(4, 5, 8);

        System.out.println(point2D);
        System.out.println(point3D);

        point3D.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println("Point3D sau khi setXYZ: " + point3D);
    }
}
