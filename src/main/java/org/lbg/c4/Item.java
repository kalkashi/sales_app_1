package org.lbg.c4;

public class Item {
    private int quantity;
    private double  cost;
    private double vatRate;

    public Item(double cost, double vatRate, int quantity){
        this.cost=cost;
        this.quantity=quantity;
        this.vatRate=vatRate;
    }

    public double calcVAT(double cost, double vatRate){
        return cost * (vatRate / 100);
    }

    public double calcTotalCost(double cost, double vatRate, int quantity){
        return (cost + calcVAT(cost,vatRate))*quantity;
    }

}
