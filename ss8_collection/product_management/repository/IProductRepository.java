package ss8_collection.product_management.repository;

import ss8_collection.product_management.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void saveAll(List<Product> products);

}
