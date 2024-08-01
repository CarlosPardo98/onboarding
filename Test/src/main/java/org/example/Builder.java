package org.example;

import java.math.BigDecimal;
import java.util.Map;

public interface Builder {
    void setCustomer(String customer);
    void setProducts(Map<String, BigDecimal> products);
}
