package webproject.com.kov.dao.impl;

import webproject.com.kov.dao.api.ProductDao;
import webproject.com.kov.entity.Product;

import java.util.List;

/**
 * Created by lapte on 14.07.2016.
 */
public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public boolean create(Product product) {
        return false;
    }
}
