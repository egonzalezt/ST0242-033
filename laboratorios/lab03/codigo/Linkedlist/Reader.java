package com.company;
import java.util.Scanner;
import java.io.*;
public class Reader {
    Lista Registro;

    public Lista Lector()throws FileNotFoundException
    {
         Registro = new Lista();
        //lectura del archivo
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
                this.Registro.Addfirst(new Estudiante(coleccion[0], coleccion[1], coleccion[2], coleccion[3], coleccion[4], coleccion[5], coleccion[6], coleccion[7], coleccion[8],coleccion[9],coleccion[10]));
            }
        } catch(Exception e)
        {
            System.out.println("\n Error no se detecto ningun archivo\n");
        }
        return Registro;
    }
}
