package ss7_abstractclass_interface.resizeable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", true, 5.0);
        shapes[1] = new Rectangle("Blue", false, 4.0, 6.0);
        shapes[2] = new Square("Yellow", true, 3.0);

        Random random = new Random();

        for (Shape shape : shapes) {
            System.out.println("Hình hiện tại: " + shape.getClass().getSimpleName());
            System.out.println("Diện tích trước: " + shape.getArea());

            if (shape instanceof IResizeable) {
                double randomPercent = random.nextInt(100) + 1;
                ((IResizeable) shape).resize(randomPercent);

                System.out.println("Random percent: " + randomPercent + "%");
            }

            System.out.println("Diện tích sau: " + shape.getArea());
        }
    }
}