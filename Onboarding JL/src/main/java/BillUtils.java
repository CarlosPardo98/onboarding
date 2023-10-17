import java.math.BigDecimal;


public class BillUtils {


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

    // TODO: Create a function that receives a Bill instance and returns the total amount of its products [ITERATIVE]

    public static BigDecimal calculateTotalAmountUsingIterativeModel(Bill bill) {
        BigDecimal res = new BigDecimal("0.0");
        for (String key : bill.getProducts().keySet()) {
            res = res.add(bill.getProducts().get(key));
        }
        return res;
    }

    // TODO: Create a function that receives a Bill instance and returns the total amount of its products [STREAMS]

    public static BigDecimal calculateTotalAmountUsingStreamsBasedModel(Bill bill) {
        return bill.getProducts().values()
                .stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    // TODO: Create a function that receives a Bill instance and returns the number of products that start with the letter A [ITERATIVE]

    public static long calculateNumberOfProductsThatStartWithAUsingIterativeModel(Bill bill) {
        long res = 0;
        for (String key : bill.getProducts().keySet()) {
            if (key.startsWith("A")) {
                res += 1;
            }
        }
        return res;
    }

    // TODO: Create a function that receives a Bill instance and returns the number of products that start with the letter A [ITERATIVE]

    public static long calculateNumberOfProductsThatStartWithAUsingStreamsBasedModel(Bill bill) {
        return bill.getProducts().keySet()
                .stream()
                .filter((key) -> key.startsWith("A"))
                .count();
    }
}
