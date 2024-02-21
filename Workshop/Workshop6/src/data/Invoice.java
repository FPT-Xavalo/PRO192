/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author lvhho
 */
public class Invoice {
    double pay = 0;
    private int invoiceCode;
    private String customerCode;
    private String time;
    private int totalQuantity;
    private ArrayList<Item> listItems;
    private ArrayList<Integer> listQuantity;
    //Constructor

    public Invoice(){
    }
    public Invoice(int invoiceCode, String customerCode, String time, ArrayList<Item> listItems, ArrayList<Integer> listNumberOfItem) {
        this.invoiceCode = invoiceCode;
        this.customerCode = customerCode;
        this.time = time;
        this.listItems = listItems;
        this.listQuantity = listNumberOfItem;
    }

    public Invoice(Invoice searchInvoiceByName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(int invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Item> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<Item> listItems) {
        this.listItems = listItems;
    }

    public ArrayList<Integer> getListQuantity() {
        return listQuantity;
    }

    public void setListQuantity(ArrayList<Integer> listQuantity) {
        this.listQuantity = listQuantity;
    }

    public double getPay() {
        return pay;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }
    
    

    

    // Print Invoice
    public void printInvoice() {
        double invoicePay = 0;
        System.out.println("=================================================");
        System.out.println("\t>>Purchase invoice at HUYHOANG Store<<");
        System.out.println("Customer Code:" + customerCode + "\t Date: " + time);
        System.out.println("-------------------------------------------------");
        System.out.printf("|%15s|%7s|%10s|\n", "Name of product","Quanity", "Price");
        for (int i = 0; i < listItems.size(); i++) {
            String name = listItems.get(i).getItemName();
            int quantity = listQuantity.get(i);
            double price = listItems.get(i).getPriceOrigin();
            System.out.printf("|%-15s|%-7d|%-10.2f|\n", name, quantity, price);
            totalQuantity += quantity;
            invoicePay+= ( price * quantity);
        }
        System.out.println("");
        System.out.println("Total amount to be paid by the customer: " + invoicePay + " VND");
        System.out.println("                >> THANK YOU <<");
    }

}
