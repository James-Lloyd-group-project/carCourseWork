package com.company;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static String modeSelection;


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

        System.out.println("Enter one for sales");
        System.out.println("Enter two for ");
        System.out.println("Enter three for stock management");

        int modeSelected = input.nextInt();

        return modeSelected;
    }

    static void salesMode(){

    }

    static void orderingMode(){

    }

    static void stockManagement(){

    }
}
