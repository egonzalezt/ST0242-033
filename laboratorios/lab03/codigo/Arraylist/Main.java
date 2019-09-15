package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try
        {
            ArrayList<String> cars = new ArrayList<String>();
            Estudiantes ed1 = new Estudiantes();
            System.out.println("Consultar por estudiante");
            ed1.Consultaestudiante("Abel","20142");
            System.out.println("Consultar por curso");
            ed1.Consultacurso("FUNDAMENTOS DE PROGRAMACIÓN","20151");
        }
        catch (Exception e)
        {

        }
    }
}
