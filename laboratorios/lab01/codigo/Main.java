package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * Pruebas al punto 1.1
         */
        LCS p1 = new LCS();
        String x = "AGGTAB";
        String y = "GXTXAYB";
        System.out.println(p1.ADN(x,y));

        /**
         * Pruebas al punto 1.2
         */
        Puertoant c1 = new Puertoant();
        for(int i = 25; i < 45; i++){
            long startTime = System.currentTimeMillis();
            c1.Rect(i);
            long tiempo = System.currentTimeMillis() - startTime;
            System.out.println(tiempo);
        }

    }
}
