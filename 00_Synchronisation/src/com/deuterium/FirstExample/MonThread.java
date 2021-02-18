package com.deuterium.FirstExample;

public class MonThread extends Thread{
    Echangeur e;

    public MonThread(Echangeur e) {
        this.e = e;
    }

    public void run() {
        e.echange();
    }
}
