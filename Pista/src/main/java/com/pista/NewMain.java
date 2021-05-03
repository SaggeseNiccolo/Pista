package com.pista;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Spogliatoio s = new Spogliatoio();
        Pista p = new Pista();

        Piloti p1 = new Piloti("p1", s, p);
        Piloti p2 = new Piloti("p2", s, p);
        Piloti p3 = new Piloti("p3", s, p);
        Piloti p4 = new Piloti("p4", s, p);
        Piloti p5 = new Piloti("p5", s, p);
        Piloti p6 = new Piloti("p6", s, p);
        Piloti p7 = new Piloti("p7", s, p);
        Piloti p8 = new Piloti("p8", s, p);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);
        Thread t6 = new Thread(p6);
        Thread t7 = new Thread(p7);
        Thread t8 = new Thread(p8);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

    }

}
