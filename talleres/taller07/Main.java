package com.company;

public class Main {

    public static void main(String[] args) {
        Nodo primer = new Nodo("ejm");
        Nodo dos = new Nodo(45);
        Nodo tres = new Nodo("hola");

        primer.Enlazarsiguiente(dos);
        //System.out.println(primer.Obtenersiguiente().Obtenervalor());
        //dos.Enlazarsiguiente(tres);
/*
        primer.Obtenersiguiente().Enlazarsiguiente(tres);
        System.out.println(primer.Obtenervalor());
        System.out.println(primer.Obtenersiguiente().Obtenervalor());
        System.out.println(primer.Obtenersiguiente().Obtenersiguiente().Obtenervalor());
*/
        Linkedlist lista = new Linkedlist();

       // System.out.println("Esta vacia? "+lista.Isempty());

        lista.Addfirst("David");
        lista.Addfirst(12);
        lista.Addfirst("Esteban");
        lista.Addfirst(24);

/*
        for(int i=0;i<lista.getSize();i++) {
            System.out.println(lista.Search(i));
        }*/

        Nodo nuevk = new Nodo(777);
        lista.AddSpecific(2,"Prueba de que si se agrego en la posicion deseada");

        for(int i=0;i<lista.getSize();i++) {
          System.out.println(lista.Search(i));
        }

/*
        lista.DeleteSpecific(3);
        System.out.println("Esta vacia? "+lista.Isempty());
        System.out.println("elemento 1: "+lista.Search(0));
        System.out.println("ultimo: "+lista.Search(lista.getSize()));
        System.out.println("Tamaño: "+lista.getSize());
*/
    }
}
