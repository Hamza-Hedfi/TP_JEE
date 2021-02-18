package com.deuterium.FirstExample;

public class Echangeur {
    int a, b;

    public Echangeur(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void echange() {
        int sauv;
        sauv = a;
        a = b;
        b = sauv;
    }
}
