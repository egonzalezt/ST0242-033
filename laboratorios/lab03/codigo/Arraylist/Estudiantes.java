package com.company;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase estudiantes, encargada de ejecutar el registro de estudiantes y realizar las diversas operaciones con estos.
 * @author Esteban Gonzalez Tamayo
 * @author David Felipe Garcia
 */

public class Estudiantes {

    //Atributo privado de la clase estudiante
    private ArrayList<Estudiante> estudiantes;
    /**
    * Metodo constructor sin parametros
    * Encargado de llamar al metodo registro.
    */
    public Estudiantes()
    {
        try {
            registro();
        }catch(Exception e){}
    }

    /**
    *@throws @FileNotFoundException encargado de lanzar excepción si hay un error al leer el csv.
    *metodo encargado de llamar a la clase Reader para leer los datos del archivo csv y registrarlos en un ArrayList
    */
    public void registro() throws FileNotFoundException
    {
        try
        {
            //invocacion del la clase Reader y su metodo read para la lectura del csv
            Reader read = new Reader();
            estudiantes = read.Lector();
            this.estudiantes = estudiantes;
        }catch(Exception e)
        {
            System.out.println("\n Error no se detecto ningun archivo\n");
        }
    }

    /**
    *   Metodo encargado de mostrar todos los estudiantes registrados en un curso especifico y semestre solicitado.
    *   @param materia Materia que se desea filtrar
    *   @param semestre Semestre que se desea filtrar
    */
    public void Consultacurso(String materia, String semestre)
    {
        /**
        * ciclo encargado de buscar y comparar cada semestre y materia de un estudiante y mostrar la obtenida
        */
        for(Estudiante estudiante : estudiantes)
        {
            if(estudiante.getMateria().equalsIgnoreCase(materia)&&estudiante.getSemestre().equalsIgnoreCase(semestre))
            {
                System.out.println(estudiante.toString());
            }
        }
    }
    
    /**
    *   Metodo encargado de mostrar todas las materias registradas por un estudiante en un semetre en especifico
    *   @param nombre Nombre del estudiante 
    *   @param semestre Semestre que se desea filtrar
    */
    public void Consultaestudiante(String nombre, String semestre)
    {
        /**
        * ciclo encargado de buscar y comparar cada estudiante y imprimir el deseado
        */
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre) && estudiante.getSemestre().equalsIgnoreCase(semestre)) {
                System.out.println(estudiante.toString());
            }
        }
    }
}
