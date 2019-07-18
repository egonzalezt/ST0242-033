public class Punto {

    private double x,y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double radioPolar(double x, double y)
    {
        double radio;
        x= Math.pow(x,2);
        y= Math.pow(y,2);
        radio= Math.sqrt(x+y);
        return radio;
    }

    public double anguloPolar(double x, double y)
    {
        double polarA= Math.atan2(x,y);
        return polarA;
    }
    public double distanciaEuclidiana(Punto otro)
    {
        double difx=(Math.pow(otro.getX()-getX(),2));
        double dify=(Math.pow(otro.getY()-getY(),2));
        double distancia= Math.sqrt(difx+dify);
        return distancia;
    }
}
