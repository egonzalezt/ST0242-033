package com.company;

public class Punto3 {

    public void mul1(int n)
    {
        for (int i = 1; i <= n; i++) // C1*n
        {
            for (int j = 1; j <= 10; j++) //C2*(n*n)
            {
                System.out.println(i + "*" + j + "=" + i * j); //C3*(n*n)
            }
        }
        /**
         *T(n)=C1*n+C2*n*n+C3*n*n
         *wolfram
         *T(n) = (C_2 + C_3) n^2 + C_1 n
         *O((C_2 + C_3)n^2)
         *O(n^2)
         */
    }

    public void mul(int n)
    {
        int n1=1;
        while(n!=0&&n1<=10)
        {
            System.out.println(n+" x "+n1+" = "+n*n1);
            if(n1==10)
            {
                n--;
                n1=0;
            }
            n1++;
        }
    }
}