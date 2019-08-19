package com.company;

public class LCS {

    public int ADN(String x,String y)
    {
        int total=0;
        String[] adn1 = x.split("");
        String[] adn2 = y.split("");
        for(int i=0;i<x.length();i++)
        {
            String a1 = adn1[i];
            for (int j=0;j<y.length();j++)
            {
                if(a1.equalsIgnoreCase(adn2[j]))
                {
                    total++;
                    adn2[j]=Integer.toString(j);
                }
            }
        }
        return total;
    }
}
