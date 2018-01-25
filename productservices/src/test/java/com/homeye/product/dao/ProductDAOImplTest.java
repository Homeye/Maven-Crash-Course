package com.homeye.product.dao;

import com.homeye.product.dto.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDAOImplTest {

    @Test
    public void createShouldCreateAProduct() {
        ProductDAO dao = new ProductDAOImpl();
        dao.create(new Product(1, "iPhone", "It's awesome!", 800));
        Product result = dao.read(1);
        assertNotNull(result);
        assertEquals("iPhone", result.getName());
    }
}