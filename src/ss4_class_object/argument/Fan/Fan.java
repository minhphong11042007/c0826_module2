package ss4_class_object.argument.Fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override //Nếu không ghi đề thi khi xuất nó sẽ dùng toString của lớp cha cao nhất Object khi chỉ gọi ex. fan1,...// Mặc định gọi toString - underground JV.// long-term.
    //Trong Run gọi sau .toString nhằm làm theo đề, chứ ghi không fan1, fan2 thì JV vẫn sẽ gọi toString!
    //Override sử dụng trong extends [inheritance] - Overload sử dụng trong khai báo parameter list. Wonderful! -> Polymorphism.
    public String toString() {
        if (this.on) {
            return "Speed: " + this.speed + ", Color: " + this.color + ", Radius: " + this.radius + " - fan is on";
        } else {
            return "Color: " + this.color + ", Radius: " + this.radius + " - fan is off";
        }
    }
}