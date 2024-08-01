package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BillBuilder implements Builder{

    // Create a Builder to create Bill instances programmatically

    // Declare the attributes to create a bill
    private String customer;
    private Map<String, BigDecimal> products;

    // Setters for those attributes
    @Override
    public void setCustomer(String customer) {
        this.customer=customer;
    }

    @Override
    public void setProducts(Map<String, BigDecimal> products) {
        this.products=products;
    }

    // Final method to create a new bill with the designed attributes
    public Bill getBill(){
        return new Bill(customer, products);
    }

    /*
    In this extra exercise you will implement your first design pattern: a Builder.
    I don't expect you to know what a Builder is, so you will need to read carefully
    the pattern specification in Refactoring Guru:

                https://refactoring.guru/design-patterns/builder.

    1. Understand the pattern.
    2. Read examples.
    3. Apply the pattern.
    4. Test it.

    You will have to explain your solution to the team once it is ready. Good luck! ;-D
     */

}
