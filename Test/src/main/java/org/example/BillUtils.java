package src.main.java.org.example;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

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

    // Useful documentation: https://www.educative.io/answers/how-to-enforce-non-instantiability-in-a-class-in-java

    private BillUtils() {
        throw new UnsupportedOperationException("Class Instantiation not supported");
    }

    // TODO: Create a function that receives a Bill instance and returns the total amount of its products [ITERATIVE]

    public static BigDecimal calculateTotalAmountUsingIterativeModel(Bill bill) {
        BigDecimal totalAmount = new BigDecimal("0.0");
        for (BigDecimal productAmount: bill.getProductAndPrices().values()) {
            totalAmount = totalAmount.add(productAmount);
        }
        return totalAmount;
    }

    // TODO: Create a function that receives a Bill instance and returns the total amount of its products [STREAMS]

    public static BigDecimal calculateTotalAmountUsingStreamsBasedModel(Bill bill) {
        return bill.getProductAndPrices().values().stream().reduce(BigDecimal::add).get();
    }

    // TODO: Create a function that receives a Bill instance and returns the number of products that start with the letter A [ITERATIVE]

    public static Long calculateNumberOfProductsThatStartWithAUsingIterativeModel(Bill bill) {
        Long amount = 0L;
        for (String product: bill.getProductAndPrices().keySet()) {
            if (product.toLowerCase().startsWith("a")) {
                amount += 1L;
            }
        }
        return amount;
    }

    // TODO: Create a function that receives a Bill instance and returns the number of products that start with the letter A [ITERATIVE]

    public static Long calculateNumberOfProductsThatStartWithAUsingStreamsBasedModel(Bill bill) {
        return bill.getProductAndPrices().keySet().stream().map(String::toLowerCase).filter(p -> p.startsWith("a")).count();
    }

}
