public class Main {

    public static void main(String[] args) {
        Punto1 p1 = new Punto1();
        for(int i=1;i<10;i++) {
            p1.add(i);
        }
        p1.print();
        p1.del(6);

    }
}
