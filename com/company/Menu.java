package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Frame {
    Menu(){

        //panels for storing each of the different screens of the application
        Panel menu = new Panel();
        Panel orderingScreen = new Panel();
        Panel salesScreen = new Panel();
        Panel stockManagementScreen = new Panel();
        Panel addNewStkItm = new Panel();
        Panel modifyCurrentStk = new Panel();
        Panel supplierContactInfo = new Panel();

        this.setTitle("car rental application");

        setSize(1920,1080);

        //declaring the buttons for the menu screen
        Button salesButton = new Button("Sales");
        Button orderingButton = new Button("Ordering");
        Button stockManagement = new Button("Stock management");

        Button navSys = new Button();
        Button tyres = new Button();
        Button headlights = new Button();
        Button brakes = new Button();

        //declaring the gui objects for the ordering screen
        TextArea stockCodeFinder = new TextArea();
        TextArea quantityToOrder = new TextArea();
        Button orderStock = new Button();

        //gui objects for sale screen
        TextArea stockCodeSale = new TextArea();
        TextArea quantityToSell = new TextArea();
        Button sellStock = new Button();

        //gui objects for stockManagement entry screen
        Button edit = new Button();
        Button addStockItem = new Button();

        // styling gui objects for menu screen
        salesButton.setSize(200,100);
        salesButton.setLocation(850,300);
        salesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                       System.out.println("Button");
            }
        });

        orderingButton.setSize(200, 100);
        orderingButton.setLocation(850,500);
        orderingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println();
            }
        });

        stockManagement.setSize(200,100);
        stockManagement.setLocation(850,700);
        stockManagement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        //styling objects for stock management first screen
        edit.setSize(200,100);
        edit.setLocation(850,400);
        edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        //styling objects for stock management first screen
        addStockItem.setSize(200,100);
        addStockItem.setLocation(850,400);
        addStockItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        edit.setSize(200,100);
        edit.setLocation(850,600);
        edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        //styling objects for ordering stock screen
        stockCodeFinder.setSize(50,50);
        stockCodeFinder.setLocation(800,400);

        quantityToOrder.setSize(50,50);
        quantityToOrder.setLocation(850,400);

        orderStock.setSize(200,100);
        orderStock.setLocation(800,500);
        orderStock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        //styling objects for selling stock screen
        stockCodeSale.setSize(50,50);
        stockCodeSale.setLocation(800,400);

        quantityToSell.setSize(50,50);
        quantityToSell.setLocation(850,400);

        sellStock.setSize(200,100);
        sellStock.setLocation(800,500);
        sellStock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        menu.setSize(1920,1080);
        this.add(menu);

        orderingScreen.setSize(1920,1080);
        this.add(orderingScreen);
        orderingScreen.setVisible(false);

        salesScreen.setSize(1920,1080);
        this.add(salesScreen);
        salesScreen.setVisible(false);

        stockManagement.setSize(1920,1080);
        this.add(stockManagementScreen);
        stockManagementScreen.setVisible(false);

        addNewStkItm.setSize(1920,1080);
        this.add(addNewStkItm);
        addNewStkItm.setVisible(false);

        modifyCurrentStk.setSize(1920,1080);
        this.add(modifyCurrentStk);
        modifyCurrentStk.setVisible(false);

        menu.setLayout(null);

        menu.add(salesButton);
        menu.add(orderingButton);
        menu.add(stockManagement);

        orderingScreen.setLayout(null);
        orderingScreen.add(orderStock);
        orderingScreen.add(stockCodeFinder);
        orderingScreen.add(quantityToOrder);

        salesScreen.setLayout(null);
        salesScreen.add(stockCodeSale);
        salesScreen.add(quantityToSell);
        salesScreen.add(sellStock);

        stockManagementScreen.setLayout(null);
        stockManagementScreen.add(edit);
        stockManagementScreen.add(addStockItem);

        addNewStkItm.setLayout(null);


        this.setVisible(true);
    }


}
