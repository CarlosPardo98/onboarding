package src.main.java.org.example;

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

    private String name;
    private Map<String, BigDecimal> productAndPrices;

    // TODO: Implement two constructors (default [no params] and with params [HINT: Look at the tests ;-D])

    public Bill() {
    }

    public Bill(String name, Map<String, BigDecimal> productAndPrices) {
        this.name = name;
        this.productAndPrices = productAndPrices;
    }

    // TODO: Implement getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, BigDecimal> getProductAndPrices() {
        return this.productAndPrices;
    }

    public void setProductAndPrices(Map<String, BigDecimal> productAndPrices) {
        this.productAndPrices = productAndPrices;
    }

    // TODO: Override toString - Expected output:


    public String toString() {
        String customerName = "Customer: " + this.name + "\n";
        String productsAndPricesString = this.productAndPrices.keySet().stream()
                .map(p -> p + ": $" + this.productAndPrices.get(p).toString() + "\n")
                .collect(Collectors.joining(""));
        return customerName + "\n" + productsAndPricesString;
    }

    /*
    Customer: John Doe

    Apple: $2.0
    Apricot: $1.5
    Meat: $8.0
    Milk: $4.5

     */

}
