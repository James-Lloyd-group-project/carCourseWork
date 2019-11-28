package com.company;

public class Order {

    private String orderID;
    private String stockID;
    private Customer customer;

    public Order(String id, String stockIdNum, Customer customer1){
        this.customer = customer1;
        this.stockID = stockIdNum;
        this.orderID = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStockItem() {
        return stockID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setStockItem(String stockItem) {
        this.stockID = stockItem;
    }
}
