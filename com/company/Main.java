package com.company;
import java.util.Scanner;
import  java.io.FileWriter;

public class Main {

    static Scanner input = new Scanner(System.in);
    static StockItem[] stockArray = new StockItem[1];
    static int modeSelected;

    public static void main(String[] args) {
        System.out.println("Welcome to our car part sale application");

        modeSelection();
    }

    public static void modeSelection(){

        System.out.println("Enter 1 for sales");
        System.out.println("Enter 2 for ordering stock ");
        System.out.println("Enter 3 for stock management");

        modeSelected = input.nextInt();

        menuSelection();
    }

    static void menuSelection(){
        switch (modeSelected){
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

    static void salesMode(){
        int indexOfStock = -1;

        System.out.println("Entering sales mode");

        System.out.println("Please enter the stock code of the item that you would like to sell");
        String stockCode = input.nextLine();

        int itemIndex = findStockCode(stockCode);
        if(itemIndex==-1){
            System.out.println("Item not found");
        }
        else{
            System.out.println("Stock item: "+ stockCode+ " found how many would you like to sell?");

            int saleQuantity = input.nextInt();

            int newQuantity = stockArray[itemIndex].sellItem(saleQuantity);
            System.out.println("You now have "+ newQuantity+ " of item "+ stockCode+ " in stock");
        }
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
        createStockItem();
    }

    static int findStockCode(String code){
        int indexOfItem = 0;

        for (int i = 0 ; i < stockArray.length; i++) {
            if (code.equals(stockArray[i].GetStockCode())){
                indexOfItem = i;
            }
        }

        return indexOfItem;
    }

    static void createStockItem(){
        int itemsOfStock = 0;

        System.out.println("What is the stock code of the new item?");
        String code= input.nextLine();
        code= input.nextLine();
        System.out.println("What is the stock name of the new item?");
        String name = input.nextLine();
        System.out.println("Please enter a short description of the new item");
        String description = input.nextLine();
        System.out.println("Please enter the quantity you have of this stock item");
        int quantity =  input.nextInt();
        System.out.println("Please enter the price of the new item excluding VAT");
        float priceNoVat = (float) input.nextDouble();
        while(quantity<0){
            System.out.println("Please enter a valid quantity");
            quantity = input.nextInt();
        }

        stockArray[itemsOfStock] = new StockItem(name,code,quantity,description,priceNoVat);
        ;
        System.out.println("stock item: "+ stockArray[itemsOfStock].GetStockCode()+" has been created");

        itemsOfStock++;

        String selection = continueUsingApp();
        selection = selection.toLowerCase();

        if(selection.equals("y")){
            System.out.println("Returning to main menu");
            modeSelection();
        }
        else{
            System.out.println("exiting application");
        }

    }

    static String continueUsingApp(){
        System.out.println("Would you like to carry on?: Y/N");
        String selection = input.next();
        selection.toLowerCase();
        return selection;
    }


}
