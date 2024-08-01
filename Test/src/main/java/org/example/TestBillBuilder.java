package org.example;

public class TestBillBuilder {
    public static void main(String[] args) {
        BillDirector director = new BillDirector();
        BillBuilder builder = new BillBuilder();
        director.makeBill(builder);
        Bill bill = builder.getBill();
        System.out.println(bill.toString());
    }
}
