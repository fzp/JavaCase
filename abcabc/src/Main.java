public class Main {

    public static void main(String[] args) throws InterruptedException {
        Object A = new Object();
        Object B = new Object();
        Object C = new Object();
        Print Pa = new Print('A',A,C);
        Print Pb = new Print('B',B,A);
        Print Pc = new Print('C',C,B);
        new Thread(Pa).start();
        Thread.sleep(100);
        new Thread(Pb).start();
        Thread.sleep(100);
        new Thread(Pc).start();
        Thread.sleep(100);
        System.out.println("End!");
    }
}
