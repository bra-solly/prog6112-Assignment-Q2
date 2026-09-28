
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceconsoleiconsole;     
               
  import java.util.Scanner;

public class Interfaceconsoleiconsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" CONSOLE SALES ENTRY SYSTEM ");

        
        System.out.print("Select / Enter the console type for example PS5, Xbox, Switch): ");
        String consoleType = scanner.nextLine();

      
        System.out.print("Enter the store name: ");
        String store = scanner.nextLine();

   
        System.out.print("Enter the total number of sales: ");
        int totalSales = 0;
        if (scanner.hasNextInt()) {
            totalSales = scanner.nextInt();
        } else {
            System.out.println("Invalid input for sales. .");
            scanner.next(); 
        }

       
        ConsolesSales currentSale = new ConsolesSales(consoleType, store, totalSales);

        System.out.println("\nSALES ENTRY SUMMARY");
        System.out.println("Console Type  : " + currentSale.getConsoleType());
        System.out.println("Store Location: " + currentSale.getStore());
        System.out.println("Total Units   : " + currentSale.getTotalSales());  

        scanner.close();
    }
}


