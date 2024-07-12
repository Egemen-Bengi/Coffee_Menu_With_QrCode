package com.example.firstWebJava.dao;

import com.example.firstWebJava.MyJDBC.MyJDBC;
import com.example.firstWebJava.entity.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDao{
    public static List<Product> getAllProduct() {
        Connection connection = MyJDBC.getConnection();
        List<Product> products = new ArrayList<Product>();
        String sql = "SELECT productClass, productName, productPrice FROM coffee.products";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                products.add(new Product(
                        resultSet.getString("productClass"),
                        resultSet.getString("productName"),
                        resultSet.getInt("productPrice"))
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    public static List<Product> getFilteredProduct(String productClassFilting) {
        List<Product> filteredList = (List<Product>) getAllProduct().stream().
                filter(product -> product.getProductClass().equals(productClassFilting)).
                collect(Collectors.toList());
        return filteredList;
    }

    public static List<String> getProductsName(String productClass){
        List<String> productsName = new ArrayList<String>();
        List<Product> products = getFilteredProduct(productClass);
        for (Product product: products){
            productsName.add(product.getProductName());
        }
        return productsName;
    }

    public static List<Integer> getProductsPrice(String productClass){
        List<Integer> productsPrice = new ArrayList<Integer>();
        List<Product> products = getFilteredProduct(productClass);
        for (Product product: products){
            productsPrice.add(product.getProductPrice());
        }
        return productsPrice;
    }
}
