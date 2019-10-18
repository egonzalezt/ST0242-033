package com.company;

import java.util.LinkedList;

public class Graph
{
    protected int size;
    LinkedList<Integer> list[];

    public Graph(int size)
    {
        this.size = size;
        list = new LinkedList[size];
        for (int i = 0; i <size ; i++)
        {
            list[i] = new LinkedList<>();
        }
    }

    public int getSize()
    {
        return size;
    }

    public LinkedList<Integer>[] getlist()
    {
        return list;
    }
}
