package ss5_static_access_modifier.project_products;

import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    Product[] productList = new Product[10];
    {
        productList[0] = new Product(101, "Egg", 3.02);
        productList[1] = new Product(102, "Fish", 45.99);
        productList[2] = new Product(103, "Meat", 98.89);
    }

    public void createProductList() {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] == null) {
                Product product = new Product();
                productList[i] = product;
                //Mình muốn nó thêm vào cuối mảng chứ không cho thêm tự do như bên project_student.
                productList[i].setId(productList[i - 1].getId() + 1);
                System.out.print("Enter product name: ");
                productList[i].setName(scanner.nextLine());
                System.out.print("Enter product price: ");
                productList[i].setPrice(scanner.nextDouble());

                System.out.println("Product added successfully.");
                break;
            }
        }

    }

    public void readProductList() {
        boolean hasProduct = false;
        System.out.println("\n===============PRODUCT LIST=================\n");
        System.out.printf("+--------+----------------------+----------------------+\n");
        System.out.printf("| %-6s | %-20s | %-20s |\n",
                "ID", "NAME", "PRICE");
        System.out.printf("+--------+----------------------+----------------------+\n");
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null) {
                System.out.printf("| %-6d | %-20s | %-20s |\n",
                        productList[i].getId(),
                        productList[i].getName(),
                        productList[i].getPrice());
                hasProduct = true;
            }
        }
        if (hasProduct) {
            System.out.printf("+--------+----------------------+----------------------+\n");
        } else {
            System.out.println("|                 Product list is empty!                 |");
            System.out.printf("+--------+----------------------+----------------------+\n");
        }
    }

    public boolean checkProductId(int id) { //Không cần excludedIndex giống project_student vì bài này mình mặc định không cho sửa id.
        //Nếu có thì cũng chỉ sử dụng trong update vì 1. Xác định có trùng id hong, 2. Bỏ qua i/index hiện tại đang sửa tránh nhận định trùng.
        boolean found = false;
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == id) {
                return found = true;
            }
        }
        return found;
    } //Muốn tối ưu thì update và delete cần stick [i]. Nên th, không sử dụng cni.

    public void updateProductList() {
        System.out.print("Enter product's id you want to update: ");
        int search = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == search) {
                System.out.printf("Product: ID - %d, NAME - %s, PRICE - %.2f\n", productList[i].getId(), productList[i].getName(), productList[i].getPrice());
                System.out.println("You just can change product's name or price!");
                System.out.print("Which you want: ");
                String str = scanner.nextLine();
                switch (str) {
                    case "name":
                        System.out.println("Enter new name: ");
                        productList[i].setName(scanner.nextLine());
                        break;
                    case "price":
                        System.out.println("Enter new price: ");
                        productList[i].setPrice(scanner.nextDouble());
                        break;
                }
                System.out.println("Product updated successfully.");
                return;
            }
        }

        System.out.println("Product's id not found!");
    }

    public void deleteProductList() {
        System.out.print("Enter product's id you want to delete: ");
        int search = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == search) {
                productList[i] = null;
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product is not exist!");
    }
    //Mỗi lần xóa thì sắp xếp lại id
    //Thêm search - hiển thị
    //Thêm data vào
}
