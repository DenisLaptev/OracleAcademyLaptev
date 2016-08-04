package webproject.com.lap.dao.impl;

import webproject.com.lap.dao.api.ProductDao;
import webproject.com.lap.entity.Product;

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
