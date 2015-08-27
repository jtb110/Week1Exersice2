/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1exersice2;

/**
 *
 * @author Jonas
 */
public class ThreadHere extends Thread {

    Even even = new Even();

    public ThreadHere(Even even) {
        this.even = even;

    }

    @Override
    public void run() {

        synchronized (even) {
            int count = 0;
            for (int i = 0; i < 1000; i++) {
                int j = even.next();
                if ((i % 2) != 0) {
                    count++;
                    System.out.println(count);
                }
            }
        }

    }
}
