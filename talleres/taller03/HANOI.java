package com.company;

public class HANOI {
    public void torresHANOI(int n) {
        torresAUX(n, 1, 2, 3); {
        }
    }

    public void torresAUX(int n, int origen, int intermedio, int destino) {

        if (n == 1) {

            System.out.println("Disco 1 de " + origen + " se mueve a " + destino);

        } else {
            torresAUX(n - 1, origen, destino, intermedio);
            System.out.println("Disco "+ n +" de "+origen+" se mueve a "+ destino);
            torresAUX(n - 1, intermedio, origen, destino);

        }
    }

}

