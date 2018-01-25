package com.homeye.product.bo;

import com.homeye.product.dao.ProductDAO;
import com.homeye.product.dto.Product;

public class ProductBOImpl implements ProductBO {

    private ProductDAO dao;

    public ProductBOImpl(ProductDAO dao) {
        this.dao = dao;
    }

    public ProductDAO getDao() {
        return dao;
    }

    public void setDao(ProductDAO dao) {
        this.dao = dao;
    }

    @Override
    public void create(Product product) {
        dao.create(product);
    }

    @Override
    public Product findProduct(int id) {
        return dao.read(id);
    }
}
