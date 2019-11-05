package com.company;
import java.util.Scanner;
import  java.io.FileWriter;

public class Main {

    static Scanner input = new Scanner(System.in);
    static StockItem[] stockArray = new StockItem[10];

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
                addStock();
                break;
            case 2:
                modifyStock();

        }


    }

    static void modifyStock(){
        System.out.println("Please enter the stock code of the item that you would like to modify");

        String stockCode = input.nextLine();
        int indexOfStock = findStockCode(stockCode);
    }

    static void addStock(){

    }

    static int findStockCode(String code){
        int indexOfItem = 0;

        for (int i = 0 ; i < stockArray.length; i++) {
            if (code.equals(stockArray[1].GetStockCode())){
                indexOfItem = i;
            }
        }

        return indexOfItem;
    }

    static void createStockItem(){
        System.out.println("What is the stock code of the new item?");
        String code= input.nextLine();
        System.out.println("What is the stock name of the new item?");
        String name = input.nextLine();
        System.out.println("Please enter a short description of the new item");
        String description = input.nextLine();
        System.out.println("Please enter the quantity you have of this stock item");
        int quantity =  input.nextInt();
        System.out.println("Please enter the price of the new item excluding VAT");
        float priceNoVat = (float) input.nextDouble();

    }
}
