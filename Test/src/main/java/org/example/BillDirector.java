package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BillDirector {

    // Method to create a designed bill
    public void makeBill(BillBuilder billBuilder){
        String c = "Javier Carretero";
        Map<String, BigDecimal> p = new HashMap<>();
        p.put("Cebolla", new BigDecimal("1.4"));
        p.put("Tomate", new BigDecimal("2.5"));
        p.put("Pepino", new BigDecimal("3.7"));
        p.put("Patata", new BigDecimal("5.5"));
        p.put("Pimienta", new BigDecimal("3.4"));
        billBuilder.setCustomer(c);
        billBuilder.setProducts(p);
    }
}
