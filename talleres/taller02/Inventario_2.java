package com.company;

public class Inventario_2 {
    public void combinations (String s)
    {
        combinationsAux("",s);
    }

    private void combinationsAux(String prefix, String s)
    {
        if (s.length()==0)
        {
            System.out.println(prefix);
        }else
        {
            combinationsAux(prefix+s.charAt(0),s.substring(1));
            combinationsAux(prefix, s.substring(1));
        }
    }
}
