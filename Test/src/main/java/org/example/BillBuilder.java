package src.main.java.org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BillBuilder {
    private String name;
    private Map<String, BigDecimal> productAndPrices;

    // TODO: Create a Builder to create Bill instances programmatically

    public void setName(String name) {
        this.name = name;
    }

    public void setProductAndPrices(Map<String, BigDecimal> productAndPrices) {
        this.productAndPrices = productAndPrices;
    }

    public Bill getResult() {
        return new Bill(name, productAndPrices);
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
