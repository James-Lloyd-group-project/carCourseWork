package com.company;

public class Order {

    private String orderID;
    private StockItem stockItem;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public StockItem getStockItem() {
        return stockItem;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setStockItem(StockItem stockItem) {
        this.stockItem = stockItem;
    }
}
