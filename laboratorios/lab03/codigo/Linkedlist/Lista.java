package com.company;

/**
 * Clase estudiantes, encargada de ejecutar el registro de estudiantes y realizar las diversas operaciones con estos.
 * @author Esteban Gonzalez Tamayo
 * @author David Felipe Garcia
 */

public class Lista {
    private Nodo cabeza;
    private int size;
    /**
    * Metodo encargado de crear la cabeza de la lista y establecer el tamaño inicial de la lista.
    */
    public Lista()
    {
        cabeza = null;
        size=0;
    }
    /**
    * Metodo encargado de detectar si la cabeza esta vacia.
    * @return boolean.
    */
    public boolean Isempty() {
        if (cabeza == null)
        {
            return true;
        }else return false;
    }

    /*
    * Metodo que agrega estudiantes a la cabeza de la lista enlazada.
    */
    public void Addfirst(Estudiante obj)
    {
        //verificacion de si la cabeza esta vacia.
        if(cabeza==null)
        {
            //si esta vacia agrega el nodo que contiene un estudiante a la cabeza.
            cabeza = new Nodo(obj);
        }else
        {
            //Copia de la cabeza.
            Nodo temp = cabeza;
            //Nodo que contiene el estudiante.
            Nodo nuevo = new Nodo(obj);
            //se enlaza el estudiante a la copia de la cabeza.
            nuevo.Enlazarsiguiente(temp);
            //la cabeza apunta a el estudiante agregado.
            cabeza = nuevo;
        }
        //aumento del tamaño de la lista.
        size++;
    }

    /**
    *   Metodo encargado de mostrar el contenido de la lista.
    */
    public void Verlista()
    {
        // String que almacena el contenido.
        String texto = "LISTA:\n";
        // copia de la cabeza.
        Nodo a = cabeza;
        //indice del iterador.
        int i=0;
        //ciclo que recorre toda la lista.
        while (i<size){
            //impresion de la lista invocando el meotodo toString.
            texto = a.Obtenerest().toString() + "\n";
            System.out.println(texto);
            a = a.Obtenersiguiente();
            i++;
        }
    }

    /**
    *   Metodo encargado de mostrar todos los estudiantes registrados en un curso especifico y semestre solicitado.
    *   @param materia Materia que se desea filtrar.
    *   @param semestre Semestre que se desea filtrar.
    */
    
    public void Consultacurso(String materia, String semestre)
    {
        String texto;
        //copia de la cabeza
        Nodo a = cabeza;
        int i=0;
        //ciclo encargado de recorrer toda la lista y comparar cada elemento de la lista con el nombre y el semestre.
        while (i<size){
            if(a.Obtenerest().getMateria().equalsIgnoreCase(materia)&&a.Obtenerest().getSemestre().equalsIgnoreCase(semestre))
            {
                texto = a.Obtenerest().toString() + "\n";
                System.out.println(texto);
            }
            a = a.Obtenersiguiente();
            i++;
        }
    }

    /**
    *   Metodo encargado de mostrar todas las materias registradas por un estudiante en un semetre en especifico.
    *   @param nombre Nombre del estudiante.
    *   @param semestre Semestre que se desea filtrar.
    */
    
    public void Consultaestudiante(String nombre, String semestre)
    {
        String texto;
        //copia de la cabeza
        Nodo a = cabeza;
        int i=0;
        //ciclo encargado de recorrer toda la lista y comparar cada elemento de la lista con el nombre y el semestre.
        while (i<size){
            if(a.Obtenerest().getNombre().equalsIgnoreCase(nombre)&&a.Obtenerest().getSemestre().equalsIgnoreCase(semestre))
            {
                texto = a.Obtenerest().toString() + "\n";
                System.out.println(texto);
            }
            a = a.Obtenersiguiente();
            i++;
        }
    }
    
    /**
    * Metodo encargado de mostrar el tamaño de la lista
    * @return size tamaño de la lista
    */
    public int getSize()
    {
        return size;
    }
}
