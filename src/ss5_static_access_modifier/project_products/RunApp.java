package ss5_static_access_modifier.project_products;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        productManager.readProductList();
        boolean flag = true;
        while (flag) {
            System.out.println("\n--Product Manager--"
            + "\n1. Create"
            + "\n2. Read"
            + "\n3. Update"
            + "\n4. Delete"
            + "\n5. Exit");
        System.out.print("Enter your choice: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                productManager.createProductList();
                productManager.readProductList();
                break;
            case 2:
                productManager.readProductList();
                break;
            case 3:
                productManager.updateProductList();
                break;
            case 4:
                productManager.deleteProductList();
                break;
            case 5:
                flag = false;
                break;
        }
        }
        sc.close();
    }
}
