import static org.junit.jupiter.api.Assertions.*;

import org.example.Bill;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BillTest {

    private static final String BILL_STRING_REPRESENTATION =
            "Customer: John Doe\n\nApple: $2.0\nApricot: $1.5\nMeat: $8.0\nMilk: $4.5\n";

    private final Bill bill = createTestBill();

    @Test
    public void billStringRepresentationIsTheExpected() {
        assertEquals(BILL_STRING_REPRESENTATION, bill.toString());
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
