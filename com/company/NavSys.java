/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;


public class NavSys extends StockItem {

    public NavSys(String name, String code, int quantity, String description, float priceNoVat) {
        super(name, code, quantity, description, priceNoVat);


    }
    private String locationMethod;

    public  String getLocationMethod(){ return locationMethod;}

    public void SetStockCode(String newStockCode)  // sets stock code
    {
        String code = "n"+this.getStockCode();

        this.setStockCode(code);
    }


}
