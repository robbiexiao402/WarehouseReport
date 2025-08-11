/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.warehousereport;

/**
 *
 * @author lab_services_student
 */
public class WarehouseReport {
    final static int[][] warehouseStock = {
        {
            10, 20, 30, 40
        },
        {
            11, 21, 31, 41
        }, 
        {
            12, 22, 32, 42
        }
    };
    final static int WEEKS = 4;
    final static String[] warehouseItems = {
      "Shoes",
      "T-Shirts",
      "Hats"
    };
    
    public static void main(String[] args) {
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
