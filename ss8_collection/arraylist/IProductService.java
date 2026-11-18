package ss8_collection.arraylist;

import java.util.List;

public interface IProductService {
    boolean addProduct(ss8_collection.product_management.entity.Product product);
    List<Product> findAllProducts();
    boolean deleteProductById(int id);
    Product findProductById(int id);
    Product findProductByName(String name);
    boolean updateProduct(Product product);
}
