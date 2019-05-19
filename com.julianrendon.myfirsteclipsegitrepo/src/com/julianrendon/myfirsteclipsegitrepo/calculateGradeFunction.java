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
public class calculateGradeFunction {

    /**
     * @param marks1
     * @param marks2
     * @return
     */
    public static String calculateGrade(int marks1, int marks2) {
        String grade = "";
        int average = (marks1 + marks2) / 2;
        //System.out.println(firstName+" "+lastName+": " +average);

        if (average >= 90) {
            grade = "A";
        } else if (average > 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    public static void main(String[] args) {

        String choice = "y";
        while (choice.toLowerCase().equals("y")) {

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

            String Grade = calculateGrade(marks1, marks2);
            System.out.println(firstName + " " + lastName + " has a grade: " + Grade);
            System.out.println("Do you want to continue?");
            choice = sc.next();
        }
    }
}
