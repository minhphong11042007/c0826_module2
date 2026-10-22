package ss5_static_access_modifier.assignments.build_method;

public class Run {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        student.setName("Jack");
        student.setClasses("A01");

        System.out.println(student);
    }
}
