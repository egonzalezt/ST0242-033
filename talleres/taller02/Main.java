package com.company;

public class Main {

    public static void main(String[] args) {
        Inventario_1 i1 = new Inventario_1();
        boolean a, b, c, d;
        a=i1.SumaGrupo(0, new int[] {2, 4, 8}, 8);
        b=i1.SumaGrupo(0, new int[] {2, 4, 2}, 8);
        c=i1.SumaGrupo(0, new int[] {10, 2, 2, 5}, 9);
        d=i1.SumaGrupo(0, new int[] {10, 2, 2, 5}, 17);
        if(b)
        {
            System.out.println("Congratulations");
        }
        Inventario_2 p2 = new Inventario_2();
        p2.combinations("Eafit");
    }
}
