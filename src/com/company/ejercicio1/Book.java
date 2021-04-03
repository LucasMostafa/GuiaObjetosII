package com.company.ejercicio1;

import java.util.List;

public class Book {
    String title;
    double price;
    int stock;
    List<Author> authors;

    public Book(){
    }

    public Book(String title, double price, int stock, List<Author> authors) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthor(List<Author> authors) {

        this.authors = authors;
    }

    public double increasePrice(double increase){
        return this.price= this.price + increase;
    }

    public int increaseStock(int increase){

        return this.stock= this.stock + increase;
    }
    public String toPrintBook (){
        return ("\n" + this.title + "\n" + this.price+ "\n"  + this.stock + "\n" + this.authors.get(0).getName() + " " + this.authors.get(0).getSurname());
    }

    public String toPrintBookWhitPrice(List<Author> authors){
        String local= "";

        if(authors.size()>0){
            for (Author x:authors) {
                local= local + "\n" + x.name + " " + x.surname + ".";
            }
        }
        else{
            local= "Autor desconocido";
        }
        return "\nEl libro " + this.title + " de: " + local + "\nSe vende a " + this.price+ " pesos\n";
    }
}
