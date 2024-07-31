package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Bill {

    /*
    In this exercise you will need to create a class that represents a Bill.
    This class will be used in the rest of the project.
     */

    // Add instance variables
    public String customer;
    public Map<String, BigDecimal> products;

    // Implement two constructors (default [no params] and with params [HINT: Look at the tests ;-D])

    public Bill(){}

    public  Bill(String customer, Map<String, BigDecimal> products){
        this.customer = customer;
        this.products = products;
    }

    // Implement getters and setters

    public String getCustomer(){
      return this.customer;
    }

    public void setCustomer(String customer){
        this.customer = customer;
    }

    public Map<String, BigDecimal> getProducts(){
        return this.products;
    }

    public void setProducts(Map<String, BigDecimal> products){
        this.products = products;
    }

    // Override toString - Expected output:
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Customer: ").append(getCustomer()).append("\n\n");
        for(String product: getProducts().keySet()){
            String productString = product + ": $" + getProducts().get(product) + "\n";
            res.append(productString);
        }
        return String.valueOf(res);
    }
    /*
    Customer: John Doe

    Apple: $2.0
    Apricot: $1.5
    Meat: $8.0
    Milk: $4.5

     */

}
