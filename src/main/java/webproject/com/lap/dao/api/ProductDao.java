package webproject.com.lap.dao.api;

import webproject.com.lap.entity.Product;


import java.util.List;

/**
 * Created by lapte on 14.07.2016.
 */
public interface ProductDao {
    List<Product> findAll();

    Product findById(long id);

    void delete(long id);

    boolean create(Product product);
}
