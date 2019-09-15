package com.company;

public class Lista {
    private Nodo cabeza;
    private int size;

    public Lista()
    {
        cabeza = null;
        size=0;
    }

    public boolean Isempty() {
        if (cabeza == null)
        {
            return true;
        }else return false;
    }

    public Object Search(int index)
    {
        Nodo temp = cabeza;
        for(int i=0;i<index;i++)
        {
            temp = temp.Obtenersiguiente();
        }
        return temp.Obtenerest();
    }

    public void Addfirst(Estudiante obj)
    {
        if(cabeza==null)
        {
            cabeza = new Nodo(obj);
        }else
        {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.Enlazarsiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }

    public void Verlista()
    {
        String texto = "LISTA:\n";
        Nodo a = cabeza;
        int i=0;
        while (i<size){
            texto = a.Obtenerest().toString() + "\n";
            System.out.println(texto);
            a = a.Obtenersiguiente();
            i++;
        }
    }

    public void Consultacurso(String materia, String semestre)
    {
        String texto;
        Nodo a = cabeza;
        int i=0;
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

    public void Consultaestudiante(String nombre, String semestre)
    {
        String texto;
        Nodo a = cabeza;
        int i=0;
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
    public int getSize()
    {
        return size;
    }
}
