package com.company;

public class Nodo {
    private Estudiante estudiante;
    private Nodo siguiente;

    public Nodo(Estudiante estudiante)
    {
        this.estudiante = estudiante;
        this.siguiente= null;
    }

    public Estudiante Obtenerest()
    {
        return this.estudiante;
    }

    public void Enlazarsiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }

    public Nodo Obtenersiguiente()
    {
        return siguiente;
    }

}
