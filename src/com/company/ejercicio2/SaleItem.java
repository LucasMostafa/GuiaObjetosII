package com.company.ejercicio2;

import java.util.UUID;

public class SaleItem {
    ///Atributos
    private UUID idSaleItem;
    private String name;
    private String descrition;
    private double unitPrice;
    private int amount;

    public SaleItem(){
    }

    public SaleItem(String name, String descrition, double unitPrice, int amount){
        this.idSaleItem= UUID.randomUUID();
        this.name= name;
        this.descrition= descrition;
        this.unitPrice= unitPrice;
        this.amount= amount;
    }

    public UUID getIdSaleItem() {
        return idSaleItem;
    }

    public void setIdSaleItem(UUID idSaleItem) {
        this.idSaleItem = idSaleItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotal(){
        return this.unitPrice * this.amount;
    }

    public String toPrintSaleItem(){
        return "\nItem:\nID: " + this.idSaleItem.toString().toUpperCase().substring(0,5) +
                " | Nombre: " + this.name +
                " | Descripcion: " + this.descrition +
                " | Precio unitario: " + this.unitPrice +
                " | Cantidad: " + amount;
    }
}
