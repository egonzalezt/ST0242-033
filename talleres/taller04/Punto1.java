package com.company;

public class Punto1 {

    public int suma(int[] arr)
    {
        int tam = arr.length;
        return sumaAUX2(arr,tam);
    }
    //suma de numeros
    public int sumaAUX(int arr[],int sum,int tam)
    {
        if(tam==0)//C1
            return sum;
        else return sumaAUX(arr,sum+arr[tam-1],tam-1); //T(c) = c2 + t(a+b)
    }
    //suma de numeros mejorada
    private int sumaAUX2(int arr[],int n)
    {
        int sum=0;
        if(n==0)//C1
            return sum;
        else return (sum+arr[n-1])+sumaAUX2(arr,n-1); //T(c) = C2 + T(n-1)

    }
}
