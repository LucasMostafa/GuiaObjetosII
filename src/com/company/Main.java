package com.company;

import com.company.ejercicio1.Author;
import com.company.ejercicio1.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Author> authors= new ArrayList<Author>();

        //Ejercicio 1
        ///Inciso A
        Author author1= new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        Author author2= new Author("Lucas", "Mostafa", "cuca@email.com", 'M');
        Author author3= new Author("Juan Roman", "Riquelme", "roman@email.com", 'M');
        Author author4= new Author("Maria", "Messi", "messi@email.com", 'F');

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);

        ///Inciso B
        System.out.println(authors.get(0).getName() + "\n" + authors.get(0).getSurname() + "\n" + authors.get(0).getEmail() + "\n" + authors.get(0).getGender());

        ///Inciso C
        Book book= new Book("Effective Java", 850, 5000, authors);

        ///Inciso D
        System.out.println(book.toPrintBook());

        ///Inciso E
        book.increasePrice(500);
        book.increaseStock(50);

        System.out.println(book.toPrintBook());

        ///Inciso F
        System.out.println("\n" + book.getAuthors().get(0).getName() + "\n" + book.getAuthors().get(0).getSurname() + "\n" + book.getAuthors().get(0).getEmail() + "\n"+ book.getAuthors().get(0).getGender());

        ///Inciso G
        ///Inciso H
        System.out.println(book.toPrintBookWhitPrice(authors));
    }
}
