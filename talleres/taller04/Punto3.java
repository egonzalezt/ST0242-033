package com.company;

public class Punto3 {
    public long fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }else return fibonacci(n-1)+fibonacci(n-2);
    }
}
