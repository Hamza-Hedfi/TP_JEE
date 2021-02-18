package com.deuterium.ProdConsFile;

public class Producteur extends Thread {
    private Buffer buffer;
    private String donnee;

    Producteur(Buffer buffer, String donnee) {
        this.buffer = buffer;
        this.donnee = donnee;
    }

    public void run() {
        for (int i = 0; i < donnee.length(); i++) {
            char car = donnee.charAt(i);

            buffer.poser(car);
            System.out.println(" j’ai produit : " + car);
            try {
                sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
            }

        }
        System.out.println(" \nProduction terminée");
    }
}
