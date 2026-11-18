package ss7_abstractclass_interface.colorable;

public class Square extends Shape implements IColorable {
    private double side = 1.0;

    public Square() {}

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() + ", Độ dài cạnh: " + side;
    }



    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
