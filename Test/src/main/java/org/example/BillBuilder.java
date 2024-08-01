package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BillBuilder implements Builder{

    // Create a Builder to create Bill instances programmatically
    private String customer;
    private Map<String, BigDecimal> products;

    @Override
    public void setCustomer(String customer) {
        this.customer=customer;
    }

    @Override
    public void setProducts(Map<String, BigDecimal> products) {
        this.products=products;
    }

    public Bill getResult(){
        return new Bill(customer, products);
    }

    public static void main(String[] args) {
        String c = "Javier Carretero";
        Map<String, BigDecimal> p = new HashMap<>();
        p.put("Cebolla", new BigDecimal("1.4"));
        p.put("Tomate", new BigDecimal("2.5"));
        p.put("Pepino", new BigDecimal("3.7"));
        p.put("Patata", new BigDecimal("5.5"));
        p.put("Pimienta", new BigDecimal("3.4"));
        BillBuilder b = new BillBuilder();
        b.setCustomer(c);
        b.setProducts(p);
        Bill bill = b.getResult();
        System.out.println(bill.toString());
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
