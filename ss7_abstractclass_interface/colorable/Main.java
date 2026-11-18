package ss7_abstractclass_interface.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square("Yellow", true, 3.0);
        shapes[1] = new Circle("Red", true, 5.0);
        shapes[2] = new Rectangle("Blue", false, 4.0, 6.0);
        shapes[3] = new Square("Yellow", true, 3.0);

        for (Shape shape : shapes) {
            System.out.println("Hình hiện tại: " + shape.getClass().getSimpleName());
            System.out.println("Diện tích: " + shape.getArea());


            if (shape instanceof IColorable) {
                ((IColorable) shape).howToColor();
            }
        }
    }
}
