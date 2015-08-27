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
public class ThreadTwo {

    public static void main(String[] args) {
        
        Even even = new Even();
        ThreadHere first = new ThreadHere(even);
        ThreadHere second = new ThreadHere(even);
        first.start();
        second.start();
        
    }

}
