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
public class LoanAppFunction {

    /**
     * @param amount
     * @param nbYears
     * @param monthlyRate
     * @return
     */
    public static double calculateMonthlyPayment(int amount, int nbYears, double monthlyRate) {
        double monthlyPayment = (monthlyRate * amount) / (1 - (1 / (Math.pow((1 + monthlyRate), (12 * nbYears)))));
        return monthlyPayment;
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter loan amount:");
        int amount = sc.nextInt();
        System.out.println("Enter number of years:");
        int nbYears = sc.nextInt();
        nbYears = nbYears * 12;
        System.out.println("Enter % rate:");
        double monthlyRate = sc.nextDouble();
        monthlyRate = monthlyRate / 100 / 12;

        double payment = calculateMonthlyPayment(amount, nbYears, monthlyRate);

        System.out.println("Monthly Payment= " + payment);
    }
}
