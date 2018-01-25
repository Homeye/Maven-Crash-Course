package com.homeye.product.bo;

import com.homeye.product.dto.Product;

public interface ProductBO {

    void create(Product product);

    Product findProduct(int id);
}
