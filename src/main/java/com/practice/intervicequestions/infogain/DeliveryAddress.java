package com.practice.intervicequestions.infogain;

public class DeliveryAddress {
   private String ProductName;
   private String Address;
   private String Pincode;

    public DeliveryAddress(String productName, String address, String pincode) {
        ProductName = productName;
        Address = address;
        Pincode = pincode;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getAddress() {
        return Address;
    }

    public String getPincode() {
        return Pincode;
    }
}
