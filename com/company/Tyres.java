package com.company;

public class Tyres extends StockItem {
    public Tyres(String name, String code, int quantity, String description, float priceNoVat, double size, double pressure, double depth, double model) {
        super(name, code, quantity, description, priceNoVat);

        this.tyreSize = size;
        this.tyrePressure = pressure;
        this.treadDepth = depth;
        this.tyreModel = model;

    }
    private double tyreSize;
    private double tyrePressure;
    private double tyreModel;
    private double treadDepth;



    public double getTyreSize(){return tyreSize;}

    public void setTyreSize(int newTyreSize){this.tyreSize = newTyreSize;}

    public double getTyrePressure(){return tyrePressure;}

    public void setTyrePressure(int newTyrePressure){this.tyrePressure = newTyrePressure;}

    public double getTyreModel(){return tyreModel;}

    public void setTyreModel(int newTyreModel){this.tyreModel = newTyreModel;}

    public double getTreadDepth(){return treadDepth;}

    public void setTreadDepth(int newTreadDepth){this.treadDepth = newTreadDepth;}

    public void SetStockCode(String newStockCode)  // sets stock code
    {
        String code = "t"+this.getStockCode();

        this.setStockCode(code);
    }


}
