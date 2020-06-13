package vn.codegym.productmanagement.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vn.codegym.productmanagement.models.Product;
import vn.codegym.productmanagement.services.ProductService;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;
    private static int autoID;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iPhone 8", "9.999.000", "Bảo hành 1 năm", "Apple"));
        products.put(2, new Product(2, "iPhone 8 Plus", "12.999.000", "Bảo hành 1 năm", "Apple"));
        products.put(3, new Product(3, "iPhone X", "14.999.000", "Bảo hành 1 năm", "Apple"));
        products.put(4, new Product(4, "iPhone XS", "16.999.000", "Bảo hành 1 năm", "Apple"));
        autoID = products.size();
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product t) {
        autoID++;
        t.setId(autoID);
        products.put(autoID, t);
    }

    @Override
    public void update(int id, Product t) {
        products.put(id, t);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

}
