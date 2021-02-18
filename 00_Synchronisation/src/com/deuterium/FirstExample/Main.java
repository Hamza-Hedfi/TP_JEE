package com.deuterium.FirstExample;

public class Main {
    public static void main(String[] args) {
        ElapsedTimeWithThreads();
        ElapsedTimeWithoutThreads();
    }

    private static void ElapsedTimeWithThreads() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Test();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\n Total time in Millis (With Thead): " + (endTime - startTime));
    }

    private static void ElapsedTimeWithoutThreads() {
        Echangeur e = new Echangeur(3, 2);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 200000; i++) {
            e.echange();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("\n Total time in Millis (Without Thread): " + (endTime - startTime));
    }

    private static void Test() {
        Echangeur e = new Echangeur(3, 2);

        MonThread t1 = new MonThread(e);
        MonThread t2 = new MonThread(e);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception ee) {
            ee.printStackTrace();
        }

//        System.out.println("a = " + e.a + ", b = " + e.b);
    }
}
