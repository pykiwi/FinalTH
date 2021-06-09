package com.example.finalthuchanh;

public class Order {
    private int id;
    private String product;
    private String customerName;
    private String address;
    private String customerPhoneNumber;
    private String customerEmail;
    private double COD;

    public Order(String product, String customerName, String address, String customerPhoneNumber, String customerEmail, double cod) {
        this.product = product;
        this.customerName = customerName;
        this.address = address;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
        this.COD = cod;
    }
    public Order(){

    }
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public double getCOD() {
        return COD;
    }

    public void setCOD(double COD) {
        this.COD = COD;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", product='" + product + '\'' +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", COD=" + COD +
                '}';
    }
}
