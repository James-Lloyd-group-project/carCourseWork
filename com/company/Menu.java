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

        setSize(1920,1080);

        //declaring the buttons for the menu screen
        Button salesButton = new Button("Sales");
        Button orderingButton = new Button("Ordering");
        Button stockManagement = new Button("Stock management");

        //declaring the gui objects for the ordering screen
        TextArea stockCodeFinder = new TextArea();


        salesButton.setSize(200,100);
        salesButton.setLocation(850,300);
        salesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                       System.out.println();
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



        menu.setSize(1920,1080);
        this.add(menu);
        menu.setLayout(null);

        menu.add(salesButton);
        menu.add(orderingButton);
        menu.add(stockManagement);

        this.setVisible(true);
    }


}
