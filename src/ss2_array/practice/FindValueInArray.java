package ss2_array.practice;
import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {
                "Chánh", "Sơn", "Sâm", "Quân", "Tài",
                "Hoa", "Giang", "Việt", "Duy", "Phong"
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String name = sc.nextLine().trim();
        boolean found = false;
        for (String student : students) {
            if (student.equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found: " + name);
        } else {
            System.out.println("Not found: " + name);
        }

        sc.close();
    }
}