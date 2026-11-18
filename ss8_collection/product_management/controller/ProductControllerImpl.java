package ss8_collection.product_management.controller;

import ss8_collection.product_management.entity.Product;
import ss8_collection.product_management.service.IProductService;
import ss8_collection.product_management.service.ProductServiceImpl;

import java.util.List;

public class ProductControllerImpl implements IProductController {
    private final IProductService productService = new ProductServiceImpl();

    @Override
    public boolean addProduct(Product product) {
        return productService.addProduct(product);
    }

    @Override
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @Override
    public boolean deleteProductById(int id) {
        return productService.deleteProductById(id);
    }
}