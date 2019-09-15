package com.company;

public class Main {

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

        }

    }
}
