package school;

interface Human {
    void getName();
    void getCCCD();
}

interface Officer {
    void getOfficerCode();
    void getSalary();
}

class Office implements Human, Officer {
    private String name, code, id;
    private int timeShift;

    public Office() {
        name = code = id = "";
        timeShift = 0;
    }

    public Office(String name, String code, String id, int timeShift) {
        this.name = name;
        this.code = code;
        this.id = id;
        this.timeShift = timeShift;
    }

    @Override
    public void getName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void getCCCD() {
        System.out.println("ID: " + id);
    }

    @Override
    public void getOfficerCode() {
        System.out.println("Code: " + code);
    }

    @Override
    public void getSalary() {
        System.out.println("Salary: " + timeShift * 1.5 * 75000);
    }
}
public class ExampleInterface {
    public static void main(String[] args) {
        Office o = new Office("An", "NV01", "012345678901", 8);
        o.getName();
        o.getCCCD();
        o.getOfficerCode();
        o.getSalary();

        //public static void readFile(String fileName) {}
        //build data sử dụng

    }
}