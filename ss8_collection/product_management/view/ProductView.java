package ss8_collection.product_management.view;

import ss8_collection.product_management.controller.IProductController;
import ss8_collection.product_management.controller.ProductControllerImpl;
import ss8_collection.product_management.entity.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private IProductController productController = new ProductControllerImpl();
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Display Product List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        deleteProduct();
                        break;
                    case 3:
                        displayProduct();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice");
            }
        }
    }

    public void addProduct() {
        try {
            System.out.print("Enter product id: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = Double.parseDouble(scanner.nextLine());

            boolean isAdded = productController.addProduct(new Product(id, name, price));

            if (isAdded) {
                System.out.println("Product added successfully.");
            } else {
                System.out.println("Error: Product ID already exists!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }

    public void displayProduct() {
        System.out.println("----List of products----");
        List<Product> list = productController.findAllProducts();
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        int choice = 1;
        for (Product product : list) {
            System.out.println(choice + ". " + product);
            choice++;
        }
    }

    public Product findProductById() {
        List<Product> list = productController.findAllProducts();
        System.out.print("Id you want: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            for (Product product : list) {
                if (product.getId() == id) {
                    return product;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
        return null;
    }

    public void deleteProduct() {
        System.out.print("Nhập ID sản phẩm muốn xóa: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());

            List<Product> list = productController.findAllProducts();
            Product target = null;
            for (Product p : list) {
                if (p.getId() == id) {
                    target = p;
                    break;
                }
            }

            if (target == null) {
                System.out.println("Không tìm thấy sản phẩm có ID = " + id);
                return;
            }

            System.out.println("Sản phẩm cần xóa: " + target);
            System.out.print("Bạn có chắc chắn muốn xóa (Yes/No): ");
            String answer = scanner.nextLine();

            if (answer.trim().equalsIgnoreCase("Yes")) {
                boolean result = productController.deleteProductById(id);
                if (result) {
                    System.out.println("Xóa sản phẩm thành công.");
                } else {
                    System.out.println("Xóa sản phẩm thất bại.");
                }
            } else {
                System.out.println("Đã hủy thao tác xóa.");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID phải là số nguyên!");
        }
    }
}
