package ss7_abstractclass_interface.resizeable;

public class Square extends Shape implements IResizeable{
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
    public void resize(double percent) {
        this.side *= (1 + percent/100);
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }
}
