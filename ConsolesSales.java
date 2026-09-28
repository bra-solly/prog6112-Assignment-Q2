/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceconsoleiconsole;



public class ConsolesSales {
    private String consoleType;
    private String store;
    private int totalSales;

    public ConsolesSales(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    public String getConsoleType() { return consoleType; }
    public void setConsoleType(String consoleType) { this.consoleType = consoleType; }

    public String getStore() { return store; }
    public void setStore(String store) { this.store = store; }

    public int getTotalSales() { return totalSales; }
    public void setTotalSales(int totalSales) { this.totalSales = totalSales; }
}