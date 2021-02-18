package com.deuterium.ProdConsFile;

public class Buffer extends File {
    Buffer(int taille) {
        super(taille);
    }

    public synchronized void poser(char c) {
        if (filePleine()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        enfiler(c);
        notify();
    }

    public synchronized char prendre() {
        if (fileVide()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        char c = defiler();
        notify();
        return (c);
    }
}
