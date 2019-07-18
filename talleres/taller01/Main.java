public class Main {

    public static void main(String[] args) {
        /**
         * PRUEBA PUNTO 1
         */
        Punto a = new Punto(12,32);
        Punto b = new Punto(40,50);

        System.out.println(a.anguloPolar(a.getX(),a.getY()));
        System.out.println(a.distanciaEuclidiana(b));
        System.out.println(a.radioPolar(a.getX(),a.getY()));

        /**
         * PRUEBA PUNTO 2
         */
        Fecha c= new Fecha(21,03,2001);
        Fecha d = new Fecha(15,06,2000 );
        System.out.println(c.comparar(d));
        System.out.println(c.toString());
        System.out.println(d.toString());
    }
}
