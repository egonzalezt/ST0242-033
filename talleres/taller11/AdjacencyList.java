package com.company;
import java.util.LinkedList;

public class AdjacencyList {

    LinkedList<Integer> Adjlist[];
    int size;

    public AdjacencyList(int size)
    {
        Graph g1 = new Graph(size);
        Adjlist = g1.getlist();
        this.size = size;
    }

    public void addEdge(int origen, int destino)
    {
        Adjlist[origen].addFirst(destino);
        Adjlist[destino].addFirst(origen);
    }

    public void imprimir()
    {
        System.out.println("Lista");
        for (int i = 0; i <size ; i++)
        {
            if(Adjlist[i].size()>0)
            {
                System.out.print(i+ " -> ");
                for (int j = 0; j < Adjlist[i].size(); j++)
                {
                    if(j<size-3)
                    {
                        System.out.print(Adjlist[i].get(j));
                        System.out.print(" -> ");
                    }else System.out.print(Adjlist[i].get(j));
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
