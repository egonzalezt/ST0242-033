package com.company;

public class Main {

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(6);
        Graph p1 = new Graph(5);

        graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.imprimir();

        AdjacencyMatrix graph1 = new AdjacencyMatrix(5);
        graph1.addEdge(0, 1);
        graph1.addEdge(0, 4);
        graph1.addEdge(1, 2);
        graph1.addEdge(1, 3);
        graph1.addEdge(1, 4);
        graph1.addEdge(2, 3);
        graph1.addEdge(3, 4);
        graph1.imprimir();
    }
}
