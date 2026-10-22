package ss5_static_access_modifier.assignments.build_method;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {}

    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student: Name = " + name + ", Classes = " + classes + ".";
    }

}
