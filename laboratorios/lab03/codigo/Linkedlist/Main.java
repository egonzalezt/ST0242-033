package com.company;

/**
 * Clase Main
 * @author Esteban Gonzalez Tamayo
 * @author David Felipe Garcia
 */

public class Main {

    /**
    * Clase main, encargada de crear una lista e invocar los diversos metodos las demas clases
    */
    public static void main(String[] args) {
        try
        {
            Lista lista = new Reader().Lector();
            lista.Verlista();
            lista.Consultaestudiante("Abel","20142");
            System.out.println("Consultar por curso");
            lista.Consultacurso("FUNDAMENTOS DE PROGRAMACIÓN","20151");

        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
