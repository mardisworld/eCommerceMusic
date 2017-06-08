package com.musicshoppe2.dao;

import com.musicshoppe2.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marissa on 6/4/17.
 */
public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();
        product1.setProductId("P123");
        product1.setProductName("Guitar1");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a Fender strat guitar!");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender");


        Product product2 = new Product();
        product2.setProductId("P124");
        product2.setProductName("Audioslave 2002");
        product2.setProductCategory("CD");
        product2.setProductDescription("Audioslave's First Recorded CD!");
        product2.setProductPrice(14.95);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(3);
        product2.setProductManufacturer("Sony");


        Product product3 = new Product();
        product3.setProductId("P125");
        product3.setProductName("Multimedia Speakers");
        product3.setProductCategory("Electronics");
        product3.setProductDescription("Logitech Multimedia Speakers Z200 with Stereo Sound");
        product3.setProductPrice(19.99);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitInStock(6);
        product3.setProductManufacturer("Logitech");


        productList=new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);


        return productList;

    }


    public Product getProductById(String productId) throws IOException {
        for (Product product: getProductList()) {
            if(product.getProductId().equals(productId)) {
                return product;
            }

        }
            throw new IOException("No product with this ID found.");
    }



}
