package ss8_collection.product_management.service;

import ss8_collection.product_management.entity.Product;
import java.util.List;

public interface IProductService {
    boolean addProduct(Product product);
    List<Product> findAllProducts();
    boolean deleteProductById(int id);
    Product findProductById(int id);
}