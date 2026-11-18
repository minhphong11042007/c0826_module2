package ss8_collection.product_management.controller;

import ss8_collection.product_management.entity.Product;

import java.util.List;

public interface IProductController {
    boolean addProduct(Product product); // SỬA: void -> boolean
    List<Product> findAllProducts();
    boolean deleteProductById(int id);
}
