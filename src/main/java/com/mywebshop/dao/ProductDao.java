package com.mywebshop.dao;

import com.mywebshop.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.setProductId("p123");
        product1.setProductName("Samsung GalaxyS10");
        product1.setProductCategory("Phone");
        product1.setProductDescription("This is the latest of iPhone phone of 2019 ");
        product1.setPrice(1000);
        product1.setProductCondition("Latest 2019");
        product1.setProductStatus("Active");
        product1.setUnitInStock(5);
        product1.setProductManufacturer("Samsung");

        product2.setProductId("p124");
        product2.setProductName("iPhone 11 Pro");
        product2.setProductCategory("Phone");
        product2.setProductDescription("This is the latest of iPhone phone of 2019 ");
        product2.setPrice(1400);
        product2.setProductCondition("Latest 2019");
        product2.setProductStatus("Active");
        product2.setUnitInStock(15);
        product2.setProductManufacturer("Apple");

        product3.setProductId("p125");
        product3.setProductName("Huawei P20 Pro");
        product3.setProductCategory("Phone");
        product3.setProductDescription("This is the latest Huawei phone of 2019 ");
        product3.setPrice(600);
        product3.setProductCondition("Latest 2019");
        product3.setProductStatus("Active");
        product3.setUnitInStock(9);
        product3.setProductManufacturer("Huawei");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

    public  Product getProductById(String productId) throws IOException {
        for (Product product:getProductList()) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
            throw new IOException("No product found.");
    }

}
