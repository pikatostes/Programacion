public class Main {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 30, 40);
        Tiempo t3 = new Tiempo(0, 35, 20);
        
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        
        t2.suma(t3);
        System.out.println("t2 + t3 = " + t2);
        
        t1.resta(t2);
        System.out.println("t1 - t2 = " + t1);
    }
}
