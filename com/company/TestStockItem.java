package com.company;

public class TestStockItem {
    public void test(StockItem objectTest){
        System.out.println("Stock code: " + objectTest.getStockCode());
        System.out.println("Stock name: " + objectTest.getStockName());
        System.out.println("Price no Vat: " + objectTest.getNoVatPrice());
        System.out.println("VAT Rate: 20%");
        System.out.println("Price Including VAT: " +objectTest.getVatPrice());
        System.out.println("Stock Description: " +objectTest.GetStockDescription());
        System.out.println("");

    }
}
