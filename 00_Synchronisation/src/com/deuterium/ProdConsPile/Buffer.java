package com.deuterium.ProdConsPile;

public class Buffer extends Pile {
    Buffer(int taille) {
        super(taille);
    }

    public synchronized void poser(char c) {
        if (pilePleine()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        empiler(c);
        notify();
    }

    public synchronized char prendre() {
        if (pileVide()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        char c = depiler();
        notify();
        return (c);
    }
}
