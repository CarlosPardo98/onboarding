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

    // Prevent this class from being instantiated - HINTS: Inheritance? Exposed constructors?
    private BillUtils(){
        throw new UnsupportedOperationException("Class Instantiation not supported");
    }

    // Useful documentation: https://www.educative.io/answers/how-to-enforce-non-instantiability-in-a-class-in-java

    // Create a function that receives a Bill instance and returns the total amount of its products [ITERATIVE]
    public static BigDecimal calculateTotalAmountUsingIterativeModel(Bill bill){
        BigDecimal totalAmount = new BigDecimal("0.0");
        for(BigDecimal amount : bill.getProducts().values()){
            totalAmount = totalAmount.add(amount);
        }
        return totalAmount;
    }

    // Create a function that receives a Bill instance and returns the total amount of its products [STREAMS]
    public static BigDecimal calculateTotalAmountUsingStreamsBasedModel(Bill bill){
        BigDecimal totalAmount = BigDecimal.valueOf(0.0);
        return bill.getProducts().values().stream().reduce(totalAmount, BigDecimal::add);
    }

    // Create a function that receives a Bill instance and returns the number of products that start with the letter A [ITERATIVE]
    public static long calculateNumberOfProductsThatStartWithAUsingIterativeModel(Bill bill){
        long numberOfProductsStartingWithA = 0;
        for (String product: bill.getProducts().keySet()){
            if(product.startsWith("A")){
                numberOfProductsStartingWithA += 1;
            }
        }
        return numberOfProductsStartingWithA;
    }

    // Create a function that receives a Bill instance and returns the number of products that start with the letter A [STREAMS]
    public static long calculateNumberOfProductsThatStartWithAUsingStreamsBasedModel(Bill bill){
        return bill.products.keySet().stream().filter(x -> x.startsWith("A")).count();
    }
}
