package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Bill {

    /*
    In this exercise you will need to create a class that represents a Bill.
    This class will be used in the rest of the project.
     */

    // TODO: Add instance variables
    public String customer;
    public Map<String, BigDecimal> products;

    // TODO: Implement two constructors (default [no params] and with params [HINT: Look at the tests ;-D])


    public Bill(String customer, Map<String, BigDecimal> products) {
        this.customer = customer;
        this.products = products;
    }

    public Bill() {
    }
// TODO: Implement getters and setters

    public Map<String, BigDecimal> getProducts() {
        return products;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setProducts(Map<String, BigDecimal> products) {
        this.products = products;
    }
    // TODO: Override toString - Expected output:

    @java.lang.Override
    public java.lang.String toString() {
        String productsstring = products.entrySet().stream().map(entry -> entry.getKey()+": $"+entry.getValue()).collect(Collectors.joining("\n"));

        return "Customer: " + customer + '\n'+ '\n'  +
                 productsstring+ '\n';
    }

    /*
    Customer: John Doe

    Apple: $2.0
    Apricot: $1.5
    Meat: $8.0
    Milk: $4.5

     */

}
