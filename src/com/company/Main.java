package com.company;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        char c;
        try {
            FileReader in = new FileReader("leggi.txt");
            //creazione dell'oggetto della classe FileReader
            //come parametro passo il nome del file da leggere
            FileWriter out = new FileWriter("scrivi.txt");
            //oggetto per scrivere un file
            //se il file non esiste viene creato
            c = (char) in.read();
            while (c != (char) (-1)) {
                out.write(c);
                //scrivo nel file il carattere contenuto c
                System.out.println("Ho letto il carattere " + c);
                c = (char) in.read();
                //il metodo restituisce un int, poi faccio il casting a char
                //legge carattere per carattere in modo sequenziale
            }
            //quando arrivo a fine file esco dal ciclo while
            in.close();
            //chiudo il file
            out.close();
            //chiudo anche l'altro file
        } catch (Exception e) {
            System.out.println("Il file non esiste");
        }
        //é obbligatorio gestire le eccezioni
        // i caratteri di escape per andare a capo e riportare il carello a sx
        //sono \n \r
    }
}

