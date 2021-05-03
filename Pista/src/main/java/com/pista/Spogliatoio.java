package com.pista;

import static java.lang.Thread.*;
import java.util.concurrent.*;

/**
 *
 * @author User
 */
public class Spogliatoio {

    Semaphore s = new Semaphore(2);

    public Spogliatoio() {

    }

    public void indossa(Piloti p) throws InterruptedException {
        s.acquire();
        sleep(2000);
        s.release();
        System.out.println(p.getNome() + " ha indossato la tuta e il casco");
    }

    public void togli(Piloti p) throws InterruptedException {
        s.acquire();
        sleep(2000);
        s.release();
        System.out.println(p.getNome() + " si è tolto la tuta e il casco");
    }

}
