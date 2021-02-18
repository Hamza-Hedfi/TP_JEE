package com.deuterium.ProdConsFile;

public class ProdConsFile {
    public static void main(String[] args) {
        String donnee = "123456789";
        Buffer buffer = new Buffer(4);
        Producteur p = new Producteur(buffer, donnee);
        Consommateur c = new Consommateur(buffer, donnee.length());

        p.start();
        c.start();
    }
}
