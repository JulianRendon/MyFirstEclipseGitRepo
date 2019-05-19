/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julianrendon.myfirsteclipsegitrepo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println ("Hello World");
        int a = 3;
        int b = 5;
        int total = a + b;
        System.out.println(a + "+" + b + " =" + total);

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int d = sc.nextInt();

        System.out.println("Enter second value");
        int e = sc.nextInt();

        int total1 = d + e;
        System.out.println("Total: " + total1);

    }
}
