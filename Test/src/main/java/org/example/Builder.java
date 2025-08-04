package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public interface Builder {
    //void setSeats(int seats);
    void setCustomer(String customer);
    void setProducts(Map<String,BigDecimal> products);
}