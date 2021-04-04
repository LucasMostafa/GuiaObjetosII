package com.company;

import com.company.ejercicio1.Author;
import com.company.ejercicio1.Book;
import com.company.ejercicio2.Client;
import com.company.ejercicio2.Invoice;
import com.company.ejercicio2.SaleItem;
import com.company.ejercicio3.Account;
import com.company.ejercicio3.ClientBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        List<Author> authors= new ArrayList<Author>();

        //EJERCICIO 1
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

        //EJERCICIO 2
        Client client= new Client("Lucas", "mostafalucas@gmail.com", 20);
        System.out.println(client.toPrintClient());

        SaleItem item1= new SaleItem("Alfajor", "Oreo", 50, 10 );
        SaleItem item2= new SaleItem("Papas fritas", "Pringles", 250, 2 );
        SaleItem item3= new SaleItem("Galletitas", "Frutigram", 80, 4 );

        SaleItem[] items= new SaleItem[3];
        items[0]= item1;
        items[1]= item2;
        items[2]= item3;

        Invoice invoice= new Invoice(items, client);
        System.out.println(invoice.toPrintInvoice());

        //EJERCICIO 3
        ClientBank clientBank= new ClientBank("Lucas", 'M');
        System.out.println(clientBank.toPrintClientBank());

        Account account= new Account(10000, clientBank);
        System.out.println(account.toPrintAccount());
        account.insert(5000);
        System.out.println(account.toPrintAccount());
        account.extract(17000);
        System.out.println(account.toPrintAccount());
        account.extract(7000);
        System.out.println(account.toPrintAccount());

        for (String operations: account.getOperations()) {
            if(operations!=null){
                System.out.println(operations);
            }
        }
    }
}
