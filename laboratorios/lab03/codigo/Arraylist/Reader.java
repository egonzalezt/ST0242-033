package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader {

    ArrayList<Estudiante> registro;

    public ArrayList<Estudiante> Lector()throws FileNotFoundException
    {
        //lectura del archivo
        registro = new ArrayList<Estudiante>();
        //condicion para registrar mas archivos
        boolean condicion = true;
        try {
            //creacion del scanner para leer el archivo
            Scanner input = new Scanner(new File("E:\\Desktop\\LAB3\\src\\com\\company\\Libro3.csv"));
            //Guarda la primera linea del archivo
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
