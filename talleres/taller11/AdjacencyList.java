package com.company;
import java.util.LinkedList;

public class AdjacencyList {

    LinkedList<Nodo> Adjlist[];
    int size;

    public AdjacencyList(int size)
    {
        Graph g1 = new Graph(size);
        Adjlist = new LinkedList[size];
        for (int i = 0; i <size ; i++)
        {
            Adjlist[i] = new LinkedList<>();
        }
        this.size = size;
    }

    public void addEdge(int origen, int destino, int costo)
    {
        Nodo nodo = new Nodo(origen,destino,costo);
        Adjlist[origen].addFirst(nodo);
    }

    public void imprimir()
    {
        System.out.println("Lista");
        for (int i = 0; i <size ; i++)
        {
            if(Adjlist[i].size()>0)
            {
                System.out.print("Costo: "+Adjlist[i].get(0).getPeso()+"  Conexiones:  ");
                System.out.print(i+ " -> ");
                for (int j = 0; j < Adjlist[i].size(); j++)
                {
                    if(j<size-3)
                    {
                        System.out.print(Adjlist[i].get(j).getDestino());
                        System.out.print(" -> ");
                    }else System.out.print(Adjlist[i].get(j).getDestino());
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
