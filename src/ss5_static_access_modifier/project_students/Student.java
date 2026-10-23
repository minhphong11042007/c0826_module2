package ss5_static_access_modifier.project_students;

public class Student {

    int id;
    String name;
    String address;

    // Method Declaration = Constructor
    public Student(int id, String name,  String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return "id: " + id + ", name: " + name + ", address: " + address;
    }
}
