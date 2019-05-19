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
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String choice = "y";
        while (choice.equals("y")) {

            //System.out.println("Please enter your choice y/n");
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your first name");
            String firstName = sc.next();
            System.out.println("Please enter your last name");
            String lastName = sc.next();
            System.out.println("Enter mark 1");
            int marks1 = sc.nextInt();
            System.out.println("Enter mark 2");
            int marks2 = sc.nextInt();

            int average = (marks1 + marks2) / 2;
            System.out.println(firstName + " " + lastName + " has an average of " + average);

            if (average >= 90) {
                System.out.println("grade A");
            } else if (average > 70) {
                System.out.println("grade B");
            } else if (average >= 60) {
                System.out.println("grade C");
            } else {
                System.out.println("grade D");
            }

            System.out.println("Do you want to continue?");
            choice = sc.next();
        }
    }
}
