package com.company.ejercicio2;

import java.time.*;
import java.util.UUID;
import java.util.Arrays;

public class Invoice {
    ///Atributos
    private UUID idInvoice;
    private SaleItem[] items;
    private LocalDateTime date;
    private Client client;

    ///Constructor
    public Invoice(){
    }

    public Invoice(SaleItem[] items, Client client){
        this.idInvoice= UUID.randomUUID();
        this.items= items;
        this.date= LocalDateTime.now();
        this.client= client;
    }

    ///Getter and setter
    public UUID getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(UUID idInvoice) {
        this.idInvoice = idInvoice;
    }

    public SaleItem[] getItems() {
        return items;
    }

    public void setItems(SaleItem[] items) {
        this.items = items;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    ///Metodos
    /*Funcion antes del punto E
    public double totalPriceDiscount(){
        return this.totalPrice - client.getDiscount();
    }*/
    
    public double getTotalPriceDiscount(){
        double totalPrice= 0;
        for (SaleItem saleItems:items) {
            if(items!=null){
                totalPrice+= saleItems.getTotal();
            }
        }
        return totalPrice - (totalPrice * (client.getDiscount()/100));
    }

    public double getTotalPrice(){
        double totalPrice= 0;
        for (SaleItem saleItems:items) {
            if(items!=null){
                totalPrice+= saleItems.getTotal();
            }
        }
        return totalPrice;
    }


    public String toPrintInvoice(){
        String texto= "Factura:\n" +
                "ID: " + this.idInvoice.toString().substring(0,13).toUpperCase() +
                " | Fecha: " + this.date +
                " | Monto total: " + getTotalPrice() +
                " | Monto total con descuento: " + getTotalPriceDiscount() + "\n" +
                client.toPrintClient() + "\n";

        for (SaleItem saleItem: items) {
            texto+= saleItem.toPrintSaleItem();
        }
        return texto;
    }
}
