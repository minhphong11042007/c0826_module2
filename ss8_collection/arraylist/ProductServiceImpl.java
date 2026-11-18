package ss8_collection.arraylist;

import ss8_collection.product_management.entity.Product;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    @Override
    public List<ss8_collection.arraylist.Product> findAllProducts() {
        return List.of();
    }

    @Override
    public boolean deleteProductById(int id) {
        return false;
    }

    @Override
    public ss8_collection.arraylist.Product findProductById(int id) {
        return null;
    }

    @Override
    public ss8_collection.arraylist.Product findProductByName(String name) {
        return null;
    }

    @Override
    public boolean updateProduct(ss8_collection.arraylist.Product product) {
        return false;
    }
}
