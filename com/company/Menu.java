package com.company;

import java.awt.*;

public class Menu extends Frame {
    Menu(){

        setSize(1920,1080);

        Button salesButton = new Button("Sales");
        Button orderingButton = new Button("Ordering");
        Button stockManagement = new Button("Stock management");

        salesButton.setSize(200,100);
        salesButton.setLocation(850,300);

        orderingButton.setSize(200,100);
        orderingButton.setLocation(850,500);

        stockManagement.setSize(200,100);
        stockManagement.setLocation(850,700);

        this.add(salesButton);
        this.add(orderingButton);
        this.add(stockManagement);

        this.setVisible(true);
    }
}
