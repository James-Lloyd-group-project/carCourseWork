package com.company;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static String modeSelection;
    static String modeSelected;

    public static void main(String[] args) {
	System.out.println("Welcome to our car part sale application");
	    while(modeSelected==null){
	        ModeSelection();
        }
	    }

    public static String ModeSelection(){

        System.out.println("Enter Sales,buying or updating  stock what you would like to do");

        modeSelection = input.nextLine().toLowerCase();

        System.out.println(modeSelection);

        if(modeSelection=="sales"){
            return modeSelection;
        }
        else if(modeSelection=="buying"){
            return modeSelection;
        }
        else if(modeSelection=="updating"){
            return modeSelection;
        }
        else{
            System.out.println("input not recognised by system please try again");
            return null;
        }


    }
}
