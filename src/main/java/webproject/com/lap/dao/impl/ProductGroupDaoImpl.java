package webproject.com.lap.dao.impl;

import webproject.com.lap.dao.api.ProductGroupDao;
import webproject.com.lap.entity.ProductGroup;

import java.util.List;

/**
 * Created by lapte on 14.07.2016.
 */
public class ProductGroupDaoImpl implements ProductGroupDao {
    @Override
    public List<ProductGroup> findAll() {
        return null;
    }

    @Override
    public ProductGroup findById(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public boolean create(ProductGroup productGroup) {
        return false;
    }
}
