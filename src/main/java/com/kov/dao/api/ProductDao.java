package com.kov.dao.api;

import com.kov.entity.Product;


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
