package com.company.ejercicio3;

import java.util.UUID;

public class Account {
    ///Atributos
    public static final int MaxOperations = 10;

    private UUID idAccount;
    private double balance;
    private ClientBank client;
    private int accountantOperations = 0;
    private String[] operations = new String[MaxOperations];

    ///Constructor
    public Account() {
    }

    public Account(double balance, ClientBank client) {
        this.idAccount = UUID.randomUUID();
        this.balance = balance;
        this.client = client;
    }

    ///Getter and setter
    public UUID getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(UUID idAccount) {
        this.idAccount = idAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClientBank getClient() {
        return client;
    }

    public void setClient(ClientBank client) {
        this.client = client;
    }

    public int getAccountantOperations() {
        return accountantOperations;
    }

    public void setAccountantOperations(int accountantOperations) {
        this.accountantOperations = accountantOperations;
    }

    public String[] getOperations() {
        return operations;
    }

    public void setOperations(String[] operations) {
        this.operations = operations;
    }

    ///Metodos
    public double insert(double deposit) {
        documentInsert(deposit);
        return this.balance += deposit;
    }

    public double extract(double retirement) {
        if (this.balance >= retirement - 2000) {
            this.balance -= retirement;
            documentExtract(retirement);
        } else {
            System.out.println("No posee saldo suficiente en la cuenta para la extraccion de " + retirement);
        }
        return this.balance;
    }

    public String toPrintAccount() {
        return "\nCuenta:\nID: " + this.idAccount.toString().substring(0, 6).toUpperCase() +
                "\nBalance: " + this.balance +
                "\n" + this.client.toPrintClientBank();
    }

    public void documentInsert(double deposit) {
        if (this.accountantOperations == MaxOperations) {
            this.accountantOperations = 0;
        }
        operations[accountantOperations] = "El cliente: " + client.getName() + " | Monto depositado: " + deposit;
        this.accountantOperations++;
    }

    public void documentExtract(double retirement) {
        if (this.accountantOperations == MaxOperations) {
            this.accountantOperations = 0;
        }
        operations[accountantOperations] = "El cliente: " + client.getName() + " | Monto retirado: " + retirement;
        this.accountantOperations++;
    }
}
