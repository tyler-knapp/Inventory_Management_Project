package com.company;

public class Cart {

    private String itemName;
    private int itemQuantity;
    private double itemCost;

    public Cart(){

    }

    public Cart(String itemName, int itemQuantity, double itemCost) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemCost = itemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }
}
