package com.deuterium.ProdConsPile;

public class Consommateur extends Thread {
    private Buffer buffer;
    private int nb;

    Consommateur(Buffer buffer, int nb) {
        this.buffer = buffer;
        this.nb = nb;
    }

    public void run() {
        for (int i = 0; i < nb; i++) {

            char car = buffer.prendre();
            System.out.println(" j’ai consommé : " + car);
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }

        }
        System.out.println("\nConsommation terminée");
    }
}
