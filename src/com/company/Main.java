package com.company;

import com.company.ejercicio1.Author;
import com.company.ejercicio1.Book;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1
        ///Inciso A
        Author author= new Author("Joshua", "Bloch", "joshua@email.com", 'M');

        ///Inciso B
        System.out.println(author.getName() + "\n" + author.getSurname() + "\n" + author.getEmail() + "\n" + author.getGender());

        ///Inciso C
        Book book= new Book("Effective Java", 850, 5000, author.getName()+ author.getSurname());

        ///Inciso D
        System.out.println("\n" + book.getTitle() + "\n" + book.getPrice() + "\n" + book.getStock() + "\n"+ book.getAuthor());

        ///Inciso E
        book.increasePrice(500);
        book.increaseStock(50);

        System.out.println("\n" + book.getTitle() + "\n" + book.getPrice() + "\n" + book.getStock() + "\n"+ book.getAuthor());

        ///Inciso F
        System.out.println("\n" + book.getAuthor());
    }
}
