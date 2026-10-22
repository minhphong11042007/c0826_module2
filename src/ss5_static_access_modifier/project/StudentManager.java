package ss5_static_access_modifier.project;

import java.util.Scanner;

public class StudentManager {

    public Student[] studentList = new Student[100];
    {
        studentList[0] = new Student(101, "Phong", "Da Nang");
        studentList[1] = new Student(102, "Son", "Ha Noi");
        studentList[2] = new Student(103, "Danh", "Ho Chi Minh");
    }
    public Scanner sc = new Scanner(System.in);

    public boolean isIdExists(int id, int excludedIndex) {
        for (int i = 0; i < studentList.length; i++) {
            if (i != excludedIndex
                    && studentList[i] != null
                    && studentList[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void showList() {
        boolean hasStudent = false;

        System.out.println("\n====================== STUDENT LIST ======================\n");

        System.out.printf("+--------+----------------------+----------------------+\n");
        System.out.printf("| %-6s | %-20s | %-20s |\n",
                "ID", "Name", "Address");
        System.out.printf("+--------+----------------------+----------------------+\n");

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                System.out.printf("| %-6d | %-20s | %-20s |\n",
                        studentList[i].getId(),
                        studentList[i].getName(),
                        studentList[i].getAddress());

                hasStudent = true;
            }
        }

        if (hasStudent) {
            System.out.printf("+--------+----------------------+----------------------+\n");
        } else {
            System.out.println("|                 Student list is empty!                 |");
            System.out.printf("+--------+----------------------+----------------------+\n");
        }
    }

    public void addStudent() {
        System.out.print("Enter student's id: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (isIdExists(id, -1)) {
            System.out.println("This ID already exists!");
            return;
        }

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter student's address: ");
        String address = sc.nextLine();

        Student student = new Student(id, name, address);

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                System.out.println("Student added successfully!");
                return;
            }
        }

        System.out.println("Student list is full!");
    }

    public void deleteStudent() {
        System.out.print("Enter student's id: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null
                    && studentList[i].getId() == id) {

                studentList[i] = null;

                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    public void updateStudent() {
        System.out.print("Enter student's id: ");
        int id = sc.nextInt();
        sc.nextLine();

        int index = -1;

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null
                    && studentList[i].getId() == id) {

                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print(
                "What do you want to update? [id, name, address]: "
        );

        String update = sc.nextLine().trim().toLowerCase();

        switch (update) {
            case "id":
                System.out.print("Enter student's new id: ");
                int idUpdate = sc.nextInt();
                sc.nextLine();

                if (isIdExists(idUpdate, index)) {
                    System.out.println(
                            "This ID already belongs to another student!"
                    );
                } else {
                    studentList[index].setId(idUpdate);
                    System.out.println("Student ID updated successfully!");
                }

                break;

            case "name":
                System.out.print("Enter student's new name: ");
                String nameUpdate = sc.nextLine();

                studentList[index].setName(nameUpdate);

                System.out.println("Student name updated successfully!");
                break;

            case "address":
                System.out.print("Enter student's new address: ");
                String addressUpdate = sc.nextLine();

                studentList[index].setAddress(addressUpdate);

                System.out.println("Student address updated successfully!");
                break;

            default:
                System.out.println();
        }
    }

    public void searchStudent() {
        System.out.print("Enter student's id: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentList[i].getId() == id) {
                System.out.println(studentList[i].getInfo());
                return;
            }
        }
        System.out.println("Student not found!");
    }
}