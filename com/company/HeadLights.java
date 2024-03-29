package com.company;

public class HeadLights extends StockItem {
    public HeadLights(String name, String code, int quantity, String description, float priceNoVat) {
        super(name, code, quantity, description, priceNoVat);


    }

    private int brightness;
    private int colour;
    private int model;

    public void SetStockCode(String newStockCode)  // sets stock code
    {
        String code = "h"+this.getStockCode();

        this.setStockCode(code);
    }


    public int getBrightness(){ return brightness;}

    public void setBrightness(int newBrightness){ this.brightness = newBrightness;}

    public int getColour(){return colour;}

    public void setColour(int newColour){ this.colour = newColour;}

    public int getModel(){return model;}

    public void setModel(int newModel){ this.model = newModel;}



}
