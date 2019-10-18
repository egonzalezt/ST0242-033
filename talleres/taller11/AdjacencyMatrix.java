package com.company;

public class AdjacencyMatrix {

    private int size;
    public int matrix[][];

    public AdjacencyMatrix(int size)
    {
        this.size = size;
        this.matrix = new int[size][size];
    }

    public void addEdge(int origen, int destino)
    {
        matrix[origen][destino]=1;

        matrix[destino][origen] = 1;
    }

    public void imprimir()
    {
        System.out.println("Matriz");
        for (int i = 0; i < size; i++)
        {
            if(i==0)
            {
                System.out.print("    ");
                for (int k = 0; k <size ; k++)
                {
                    System.out.print("["+k+"] ");
                }
                System.out.println();
            }
            System.out.print("["+i+"]  ");

            for (int j = 0; j <size ; j++)
            {
                System.out.print(matrix[i][j]+ "   ");
            }

            System.out.println();
        }
        System.out.println();
    }

}
