package com.company;

public class Puertoant {
    public int Rect(int n)
    {
        if(n<=2)
        {
            return n;
        }
        else return Rect(n-1)+Rect(n-2);
    }
}
