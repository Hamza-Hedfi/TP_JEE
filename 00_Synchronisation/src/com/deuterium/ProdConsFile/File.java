package com.deuterium.ProdConsFile;

import java.util.LinkedList;
import java.util.Queue;

public class File {
    private int nbElem;

    private Queue<Character> queue;

    File(int n) {
        nbElem = n;
        queue = new LinkedList<>();
    }

    void enfiler(char e) {
        queue.add(e);
    }

    char defiler() {
        return queue.remove();
    }

    boolean filePleine() {
        if (queue.size() == nbElem) return true;
        else return false;
    }

    boolean fileVide() {
        if (queue.size() == 0) return true;
        else return false;
    }
}

