/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julianrendon.myfirsteclipsegitrepo;

/**
 *
 * @author user
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        int s = 0;

        while (i <= 4) {
            s = s + i;
            i = i + 1;
            System.out.println("s= " + s);
            System.out.println("i= " + i);
        }
    }
}
