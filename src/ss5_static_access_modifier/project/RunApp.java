package ss5_static_access_modifier.project;

import java.util.Scanner;

public class RunApp {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("\n------ Student Manager ------"
                    + "\n1. Display Student List"
                    + "\n2. Add Student"
                    + "\n3. Delete Student"
                    + "\n4. Update Student"
                    + "\n5. Search Student"
                    + "\n6. Exit Program");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    studentManager.showList();
                    break;

                case 2:
                    studentManager.addStudent();
                    break;

                case 3:
                    studentManager.deleteStudent();
                    break;

                case 4:
                    studentManager.updateStudent();
                    break;

                case 5:
                    studentManager.searchStudent();
                    break;

                case 6:
                    flag = false;
                    System.out.println("Program exited successfully!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
