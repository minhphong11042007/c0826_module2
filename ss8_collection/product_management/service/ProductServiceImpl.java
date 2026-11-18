package ss8_collection.product_management.service;

import ss8_collection.product_management.entity.Product;
import ss8_collection.product_management.repository.IProductRepository;
import ss8_collection.product_management.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final IProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(int id) {
        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean addProduct(Product product) {
        if (findProductById(product.getId()) != null) {
            return false;
        }

        List<Product> products = productRepository.findAll();
        products.add(product);
        productRepository.saveAll(products);
        return true;
    }

    @Override
    public boolean deleteProductById(int id) {
        List<Product> products = productRepository.findAll();
        int index = -1;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            products.remove(index);
            productRepository.saveAll(products);
            return true;
        }
        return false;
    }
}