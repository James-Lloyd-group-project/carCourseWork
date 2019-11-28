package com.company;

public class Supplier {

    private String supplierID;
    private String supplierName;

    private ContactInformation supplierContactInfo;
    private Address supplierAddress;

    public Supplier(String ID, String name, ContactInformation contactInfo, Address supaddress){
        this.supplierID = ID;
        this.supplierName = name;
        this.supplierContactInfo = contactInfo;
        this.supplierAddress = supaddress;
    }

    public Address getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(Address supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public ContactInformation getSupplierContactInfo() {
        return supplierContactInfo;
    }

    public void setSupplierContactInfo(ContactInformation supplierContactInfo) {
        this.supplierContactInfo = supplierContactInfo;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
