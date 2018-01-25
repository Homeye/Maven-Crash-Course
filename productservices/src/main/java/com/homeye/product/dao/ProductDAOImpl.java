package com.homeye.product.dao;

import com.homeye.product.dto.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDAOImpl implements ProductDAO {

    private Map<Integer, Product> products = new HashMap<>();

    @Override
    public void create(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product read(int id) {
        return products.get(id);
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
