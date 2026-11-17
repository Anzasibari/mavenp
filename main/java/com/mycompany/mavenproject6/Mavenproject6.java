/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author Student
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
public class ProductSales {

    public static void main(String[] args) {

        // Two-dimensional array containing sales data
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Single-dimensional array containing all sales
        int[] sales = new int[6];

        int index = 0;

        // Copy values from 2D array into 1D array
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                sales[index] = productSales[i][j];
                index++;
            }
        }

        // Calculate total sales
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }

        // Calculate average sales
        double average = (double) total / sales.length;

        // Calculate maximum and minimum sales
        int maximum = sales[0];
        int minimum = sales[0];

        for (int i = 1; i < sales.length; i++) {

            if (sales[i] > maximum) {
                maximum = sales[i];
            }

            if (sales[i] < minimum) {
                minimum = sales[i];
            }
        }

        // Display product sales report
        System.out.println("--------------------------------");
        System.out.println("     PRODUCT SALES REPORT - 2025");
        System.out.println("--------------------------------");

        System.out.println("Total sales:   " + total);
        System.out.printf("Average sales: %.0f%n", average);
        System.out.println("Maximum sale:  " + maximum);
        System.out.println("Minimum sale:  " + minimum);

        System.out.println("--------------------------------");
    }
}

    }
}
