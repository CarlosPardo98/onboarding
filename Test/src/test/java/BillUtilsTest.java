import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Bill;
import org.example.BillUtils;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BillUtilsTest {

    private static final BigDecimal TOTAL_AMOUNT = new BigDecimal("16.0");
    private static final long NUMBER_OF_PRODUCTS = 2;

    private final Bill bill = createTestBill();

    @Test
    public void calculateTotalAmountUsingIterativeModel() {
        BigDecimal totalAmount = BillUtils.calculateTotalAmountUsingIterativeModel(bill);
        assertEquals(TOTAL_AMOUNT, totalAmount);
    }

    @Test
    public void calculateTotalAmountUsingStreamsBasedModel() {
        BigDecimal totalAmount = BillUtils.calculateTotalAmountUsingStreamsBasedModel(bill);
        assertEquals(TOTAL_AMOUNT, totalAmount);
    }

    @Test
    public void calculateNumberOfProductsThatStartWithAUsingIterativeModel() {
        long numberOfProducts = BillUtils.calculateNumberOfProductsThatStartWithAUsingIterativeModel(bill);
        assertEquals(NUMBER_OF_PRODUCTS, numberOfProducts);
    }

    @Test
    public void calculateNumberOfProductsThatStartWithAUsingStreamsBasedModel() {
        long numberOfProducts = BillUtils.calculateNumberOfProductsThatStartWithAUsingStreamsBasedModel(bill);
        assertEquals(NUMBER_OF_PRODUCTS, numberOfProducts);
    }

    private Bill createTestBill() {
        Map<String, BigDecimal> products = new HashMap<>();
        products.put("Apple", new BigDecimal("2.0"));
        products.put("Apricot", new BigDecimal("1.5"));
        products.put("Meat", new BigDecimal("8.0"));
        products.put("Milk", new BigDecimal("4.5"));

        return new Bill("John Doe", products);
    }
}
