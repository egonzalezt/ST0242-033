package com.company;

public class Main {

    public static void main(String[] args) {
        ejercicio1();
        System.out.println(ejercicio2());
        ejercicio3();
    }
    public static void ejercicio1(){
     Punto1 p1 = new Punto1();
        int[] arr ={56,7,6,45,8,4,34,8,7,5,34,7,23,23,23,234,2345,456,456,2345,234,123,78,9};
        int[] newarr;
        newarr=p1.insertionSort(arr); 
        for(int i=0;i<newarr.length;i++)  
        {
          System.out.println(newarr[i]);
        }  
    }
  
	public static boolean ejercicio2(){
        int nums [] = {1,23,34,4,3,234,3456,346,6,4};
        Punto2 sum = new Punto2();
        int a,b,c,d;
        a = sum.suma(new int[] {1,2,3,4,5,5});
        b = sum.suma(new int[] {12,324,43,2,3,43,2,3,43});
        c = sum.suma(new int[] {3,2,343,2,43,55,67,68,86,3,4});
        d = sum.suma(new int[] {56,7,6,45,8,4,34,8,7,5,34,7,78,9});
        if(a!=20 || b!=475 || c!=676 || d!=308)
            return false;
        return true;
    }
    public static void ejercicio3()
    {
        Punto3 p3 = new Punto3();
        for(int i=6000 ; i< 42426 ;i+=600)
        {
            long start = System.currentTimeMillis();
            p3.mul1(i);
            long end = System.currentTimeMillis();
            System.out.println(end-start);
        }
    }
}
