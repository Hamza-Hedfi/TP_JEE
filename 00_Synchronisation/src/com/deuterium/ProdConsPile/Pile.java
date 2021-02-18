package com.deuterium.ProdConsPile;

public class Pile {
    private char[] tab;
    private int nbElem;

    Pile(int n) {
// Allocation du tableau de dimension n
        tab = new char[n];
    }

    void empiler(char e) {
        tab[nbElem] = e;
        nbElem++;
    }

    char depiler() {
        nbElem--;
        return (tab[nbElem]);
    }

    boolean pilePleine() {
        if (nbElem == tab.length) return (true);
        else return (false);
    }

    boolean pileVide() {
        if (nbElem == 0) return (true);
        else return (false);
    }
}

