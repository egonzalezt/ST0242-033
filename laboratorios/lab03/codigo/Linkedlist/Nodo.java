package com.company;

public class Nodo {
    /**
    * Atributos de la clase nodo
    */
    private Estudiante estudiante;
    private Nodo siguiente;

    /*
    *Constructor de la clase Nodo, almacena un estudiante.
    */
    public Nodo(Estudiante estudiante)
    {
        this.estudiante = estudiante;
        this.siguiente= null;
    }

    /**
    * Metodo encargado de retornar el estudiante del nodo
    * @return estudiante
    */
    public Estudiante Obtenerest()
    {
        return this.estudiante;
    }
    
    /**
    * Metodo que enlaza el nodo actual a otro nodo 
    */
    public void Enlazarsiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }

    /*
    * Metodo que retorna el nodo que fue enlazado
    * @return siguiente
    */
    public Nodo Obtenersiguiente()
    {
        return siguiente;
    }

}
