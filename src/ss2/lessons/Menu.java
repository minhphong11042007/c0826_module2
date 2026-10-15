package ss2.lessons;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {   // Procedure of module 2 coming soon will be a big project.
            System.out.println("------Student Menu------"
                    + "\n1. List" // Show student list
                    + "\n2. Add"
                    + "\n3. Delete"
                    + "\n4. Adjust"
                    + "\n5. Quit");
            System.out.print("Enter your choose: ");
            int chosse = Integer.parseInt(sc.nextLine());
            switch (chosse) {
                case 1:
                    System.out.println("List");
                    break;
                case 2:
                    System.out.println("Add");
                    break;
                case 3:
                    System.out.println("Delete");
                    break;
                case 4:
                    System.out.println("Adjust");
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }
}
