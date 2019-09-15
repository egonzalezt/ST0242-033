package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Clase Reader encargada de leer un archivo csv
 * @author Esteban Gonzalez Tamayo
 * @author David Felipe Garcia
 */

public class Reader {

    ArrayList<Estudiante> registro;

    /**
    * Metodo encargado de leer el archivo csv y registrar un nuevo estudiante 
    * @throws FileNotFoundException
    */
    public ArrayList<Estudiante> Lector()throws FileNotFoundException
    {
        //lectura del archivo
        registro = new ArrayList<Estudiante>();
        
        try {
            //creacion del scanner para leer el archivo
            Scanner input = new Scanner(new File("E:\\Desktop\\LAB3\\src\\com\\company\\Libro3.csv"));
            /**
            *Guarda la primera linea del archivo que contiene:
            * nombre, código, Cod. Materia, Semestre, Grupo, Descripcion Evaluacion, Porcentaje, Descripcion, Nom. Materia,
            * Nota, Nota Definitiva
            */
            String Nombre = input.nextLine();
            //Separa el contenido del String en un arreglo
            String[] tamorigi = Nombre.split(",");
            //verifica si el archivo contiene los caracteres validos
            while (input.hasNextLine()) {
                String line = input.nextLine();//reemplaza "" "" por " "
                //Separa el contenido en un arreglo
                String[] coleccion = line.split(",");
                this.registro.add(new Estudiante(coleccion[0], coleccion[1], coleccion[2], coleccion[3], coleccion[4], coleccion[5], coleccion[6], coleccion[7], coleccion[8],coleccion[9],coleccion[10]));
            }
        } catch(Exception e)
        {
            System.out.println("\n Error no se detecto ningun archivo\n");
        }
        return registro;
    }
}
