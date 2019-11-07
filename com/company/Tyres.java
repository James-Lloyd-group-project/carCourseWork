package com.company;

public class Tyres extends StockItem {
    public Tyres(String name, String code, int quantity, String description, float priceNoVat) {
        super(name, code, quantity, description, priceNoVat);
    }
    private double tyresize;
    private double tyrepressure;
    private double tyremodel;


    public double getTyreSize(){return tyresize;}

    public void getTyreSize(int newTyreSize){this.tyresize = newTyreSize;}

    public double getTyrePressure(){return tyrepressure;}

    public void setTyrePressure(int newTyrePressure){this.tyrepressure = newTyrePressure;}

    public double getTyreModel(){return tyremodel;}

    public void setTyreModel(int newTyreModel){this.tyremodel = newTyreModel;}


}
