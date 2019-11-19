package com.company;

public class Brakes extends StockItem {
    public Brakes(String name, String code, int quantity, String description, float priceNoVat) {
        super(name, code, quantity, description, priceNoVat);
    }

    private String brakedisks;
    private String brakepads;

    public void SetStockCode(String newStockCode)  // sets stock code
    {
        String code = "b"+this.getStockCode();

        this.setStockCode(code);
    }


    public String getBrakeDisks(){return brakedisks;}

    public void setBrakeDisks(String newBrakeDisks){this.brakedisks = newBrakeDisks;}

    public String getBrakePads(){return brakepads;}

    public void setBrakePads(String newBrakePads){this.brakepads = newBrakePads;}
}
