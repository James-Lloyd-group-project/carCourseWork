package com.company;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to our car part sale application");

        switch (modeSelection()){
            case 1:
                salesMode();
                break;
            case 2:
                orderingMode();
                break;
            case 3:
                stockManagement();
                break;
        }
    }

    public static int modeSelection(){

        System.out.println("Enter 1 for sales");
        System.out.println("Enter 2 for ordering stock ");
        System.out.println("Enter 3 for stock management");

        int modeSelected = input.nextInt();

        return modeSelected;
    }

    static void salesMode(){
        System.out.println("Entering sales mode");
    }

    static void orderingMode(){
        System.out.println("Entering ordering mode");
    }

    static void stockManagement(){
        System.out.println("Entering stock management mode");

        System.out.println("Press 1 for adding new item of stock");
        System.out.println("Press 2 to modify existing item of stock");

        int modeSelection = input.nextInt();

        switch(modeSelection){
            case 1:

        }


    }

    static void modifyStock(){

    }

    static void addStock(){

    }
}
