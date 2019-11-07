package com.company;

public class HeadLights extends StockItem {
    public HeadLights(String name, String code, int quantity, String description, float priceNoVat) {
        super(name, code, quantity, description, priceNoVat);


    }

    private int brightness;

    public int getBrightness(){ return brightness;}

    public void setBrightness(int newBrightness){ this.brightness = newBrightness;}
}
