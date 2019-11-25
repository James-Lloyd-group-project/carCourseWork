package com.company;

public class Brakes extends StockItem {
    public Brakes(String name, String code, int quantity, String description, float priceNoVat) {
        super(name, code, quantity, description, priceNoVat);
    }

    private String diskbrakes;
    private String brakepads;
    private String brakecalipers;

    public void SetStockCode(String newStockCode)  // sets stock code
    {
        String code = "b"+this.getStockCode();

        this.setStockCode(code);
    }


    public String getDiskBrakes(){return diskbrakes;}

    public void setBrakeDisks(String newDiskBrakes){this.diskbrakes = newDiskBrakes;}

    public String getBrakePads(){return brakepads;}

    public void setBrakePads(String newBrakePads){this.brakepads = newBrakePads;}
    
    public void getBrakeCalipers(){return brakecalipers;}
    
    public void setBrakeCalipers(String newBrakeCalipers){this.brakecalipers = newBrakeCalipers;}
}
