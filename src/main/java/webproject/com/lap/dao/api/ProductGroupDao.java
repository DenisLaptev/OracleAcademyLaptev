package webproject.com.lap.dao.api;

import webproject.com.lap.entity.ProductGroup;


import java.util.List;

/**
 * Created by lapte on 14.07.2016.
 */
public interface ProductGroupDao {
    List<ProductGroup> findAll();

    ProductGroup findById(long id);

    void delete(long id);

    boolean create(ProductGroup productGroup);
}
