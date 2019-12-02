package com.company;

public class TestStockItem {
    public StockItem test(StockItem objectTest){

        if(objectTest.getStockCode()=="s204"){
            System.out.println("Stockcode: s204");
        }
        else{
            System.out.println("unexpected output");
        }

        if(objectTest.getNoVatPrice()==20.39){

        }

        return objectTest;
    }
}
