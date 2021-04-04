package com.company.ejercicio3;

import java.util.UUID;

public class ClientBank {
    ///Atributos
    private UUID idClient;
    private String name;
    private char gender;

    ///Constructor
    public ClientBank(){
    }

    public ClientBank(String name, char gender){
        this.idClient= UUID.randomUUID();
        this.name= name;
        this.gender= gender;
    }

    ///Getter and setter
    public UUID getIdClient() {
        return idClient;
    }

    public void setIdClient(UUID idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    ///Metodos
    public String toPrintClientBank(){
        return "Cliente:\nID: " + this.idClient.toString().substring(0,4).toUpperCase() +
                " | Nombre: " + this.name +
                " | Genero: " + this.gender;
    }
}
