package com.company;

public class Main {

    public static void main(String[] args) {
        punto1();
        Punto3 p3 = new Punto3();
        p3.fibonacci(10);
        //System.out.println(ejercicio3());
    }
    public static boolean ejercicio3(){
        Punto3 p3 = new Punto3();
        long a,b,c,d;
        a = p3.fibonacci(4);
        b = p3.fibonacci(8);
        c = p3.fibonacci(12);
        d = p3.fibonacci(16);
        for(int i = 25; i < 45; i++){
            long startTime = System.currentTimeMillis();
            p3.fibonacci(i);
            long tiempo = System.currentTimeMillis() - startTime;
            System.out.println(tiempo);
        }
        if(a==3 && b==21 && c==144 && d==987)
            return true;
        return false;
    }
    public static void punto1()
    {
        int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Punto1 p1 = new Punto1();
        int a =p1.sumaAUX(arr,0,arr.length);
        System.out.println(a);
        int b=p1.suma(arr);
        System.out.println(b);
    }
}