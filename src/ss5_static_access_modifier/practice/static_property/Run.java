package ss5_static_access_modifier.practice.static_property;

public class Run {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
    }
}
