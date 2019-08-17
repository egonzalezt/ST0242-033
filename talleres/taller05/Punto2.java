package com.company;

public class Punto2 {
    public int suma(int nums[])
    {
        int total=0; // C3
        for(int i=0;i<nums.length;i++)    //C1*N + c2
        {
            total+=nums[i];               //C2*n
        }
        /**+
         * T(n)=C3+C1*n+C2+C2*n+C4
         * wolfram
         *(C_1 + C_2) n + C_3 + C_4 = T(n)
         *(C_1 + C_2) n
         * O(n)
         */
        return total; //C4
    }
}

