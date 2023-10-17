import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Bill {

    /*
    In this exercise you will need to create a class that represents a Bill.
    This class will be used in the rest of the project.
     */

    // TODO: Add instance variables

    private String customer;
    private HashMap <String, BigDecimal> products;


    // TODO: Implement two constructors (default [no params] and with params [HINT: Look at the tests ;-D])

    public Bill() {
        this.customer = "";
        this.products = new HashMap<>();
    }


    public Bill(Map<String, BigDecimal> products, String customer) {
        this.customer = customer;
        this.products = (HashMap<String, BigDecimal>) products;
    }

    public Bill(String customer, Map<String, BigDecimal> products) {
        this.customer = customer;
        this.products = (HashMap<String, BigDecimal>) products;
    }


    // TODO: Implement getters and setters

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public HashMap<String, BigDecimal> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, BigDecimal> products) {
        this.products = products;
    }




    // TODO: Override toString - Expected output:

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customer).append("\n").append("\n");
        for (Map.Entry<String, BigDecimal> entry : products.entrySet()) {
            sb.append(entry.getKey()).append(": $").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}






    /*
    Customer: John Doe

    Apple: $2.0
    Apricot: $1.5
    Meat: $8.0
    Milk: $4.5

     */


