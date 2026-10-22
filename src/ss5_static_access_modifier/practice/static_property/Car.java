package ss5_static_access_modifier.practice.static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public String getInfo() {
        return name + " " + engine + " " + numberOfCars;
    }
}
