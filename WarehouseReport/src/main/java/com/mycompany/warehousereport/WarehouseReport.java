/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.warehousereport;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class WarehouseReport {

    final static int[][] warehouseStock = new int[3][4];
    final static int WEEKS = 4;
    final static String[] warehouseItems = {
        "Shoes",
        "T-Shirts",
        "Hats"
    };

    public static void stockInput() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < warehouseStock.length; i++) {
            System.out.println("Enter stock amounts for: " + (warehouseItems[i]));
            for (int j = 0; j < WEEKS; j++) {
                while (true) {
                    System.out.println("Week " + (j + 1));
                    if (scanner.hasNextInt()) {
                        int getAmount = scanner.nextInt();
                        if (getAmount >= 0) {
                            warehouseStock[i][j] = getAmount;
                            break;
                        } else {
                            System.out.println("Integer must be greater than 0.");
                        }
                    } else {
                        System.out.println("Invalid integer input.");
                        scanner.next();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        stockInput();

        int totalAmount = 0;
        System.out.println("WAREHOUSE STOCK REPORT: ");
        System.out.println("--------------");
        for (int i = 0; i < warehouseStock.length; i++) {
            System.out.println("Item: " + warehouseItems[i]);
            System.out.println("--------------");
            for (int j = 0; j < WEEKS; j++) {
                System.out.println("Week " + (j + 1));
                System.out.println("Amount received: " + warehouseStock[i][j]);
                totalAmount += warehouseStock[i][j];
            }
            System.out.println("Weekly total: " + totalAmount);
            System.out.println();
            totalAmount = 0;
        }
    }
}
