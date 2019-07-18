public class Fecha {

    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public int  comparar(Fecha otra) {
        /**
         * 0 para igual
         * 1 para menor
         * 2 para mayor
         * 3 para diferentes
         */
        if (getDia() == otra.getDia() && getMes() == otra.getMes() && getAnyo() == otra.getAnyo()) {
            return 0;
        } else if (getAnyo() > otra.getAnyo()) {
            return 2;
        } else if (getAnyo() < otra.getAnyo()) {
            return 1;
            //Años
        }
        //Meses
        else if ((getAnyo() == otra.getAnyo()) && getMes() > otra.getMes()) {
            return 2;
        } else if ((getAnyo() == otra.getAnyo()) && getMes() < otra.getMes()) {
            return 1;
        } else if ((getAnyo() == otra.getAnyo()) && getMes() == otra.getMes() && getDia() < otra.getDia()) {
            return 1;
        } else if ((getAnyo() == otra.getAnyo()) && getMes() == otra.getMes() && getDia() > otra.getDia()) {
            return 2;
        }
        else
            return 3;
    }


    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", anyo=" + anyo +
                '}';
    }
}
