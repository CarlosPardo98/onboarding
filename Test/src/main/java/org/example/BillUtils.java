package org.example;

import java.math.BigDecimal;
import java.util.Map;

public final class BillUtils {

    /*
    In this exercise you have to create a type of class that is really common in OOP: a utility class.

    The first thing you will need to do is to understand what a utility class is and why they exist:

                https://www.baeldung.com/java-helper-vs-utility-classes#java-utility-classes

    Once everything is clear, you will have to:

    1. Build the utility class appropriately.
    2. Implement different functions that perform operation with Bill objects.
     */

    // TODO: Prevent this class from being instantiated - HINTS: Inheritance? Exposed constructors?

    private BillUtils() {
    }

    // Useful documentation: https://www.educative.io/answers/how-to-enforce-non-instantiability-in-a-class-in-java

    // TODO: Create a function that receives a Bill instance and returns the total amount of its products [ITERATIVE]
    public static BigDecimal calculateTotalAmountUsingIterativeModel(Bill bill){
        BigDecimal totalAmount = new BigDecimal("0.0");
        Map<String, BigDecimal> products = bill.getProducts();
        for(Map.Entry<String, BigDecimal> producto : products.entrySet()){
            totalAmount=totalAmount.add(producto.getValue());
        }
        return totalAmount.setScale(1,BigDecimal.ROUND_DOWN);
    }

    // TODO: Create a function that receives a Bill instance and returns the total amount of its products [STREAMS]
    public static BigDecimal calculateTotalAmountUsingStreamsBasedModel(Bill bill){
        Map<String, BigDecimal> products = bill.getProducts();
        BigDecimal totalAmountUsingStream = products.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

        return totalAmountUsingStream.setScale(1,BigDecimal.ROUND_DOWN);

    }

    // TODO: Create a function that receives a Bill instance and returns the number of products that start with the letter A [ITERATIVE]
    public static Long calculateNumberOfProductsThatStartWithAUsingIterativeModel(Bill bill){
        Long numberOfProductsThatStartWithA = 0L;
        Map<String, BigDecimal> products = bill.getProducts();
        for(Map.Entry<String, BigDecimal> producto : products.entrySet()){
            if(producto.getKey().startsWith("A")){
                numberOfProductsThatStartWithA = numberOfProductsThatStartWithA + 1;
            }
        }
        return numberOfProductsThatStartWithA;
    }

    // TODO: Create a function that receives a Bill instance and returns the number of products that start with the letter A [ITERATIVE]
    public static Long calculateNumberOfProductsThatStartWithAUsingStreamsBasedModel(Bill bill){
        Map<String, BigDecimal> products = bill.getProducts();
        Long numberOfProductsThatStartWithA = products.keySet().stream().filter(key -> key.startsWith("A")).count();
        return numberOfProductsThatStartWithA;
    }
}
