package com.company;

public class Baldosas {
    int p;
    int q;

    public Baldosas(int p, int q) {
        this.p = p;
        this.q = q;
    }

    public int recursivo (int x,int y)
    {
        if(y==0)
        {
            return p;
        }
        else return recursivo(y,p%q);
    }
}
