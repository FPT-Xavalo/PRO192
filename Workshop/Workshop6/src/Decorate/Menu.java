/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorate;

/**
 *
 * @author lvhho
 */
public class Menu {

    public void printMenu() {
        System.out.println("+============================================================+");
        System.out.println("|                     HUYHOANG-STORE                         |");
        System.out.println("|            +================================+              |");
        System.out.println("+============================================================+");
        System.out.println("|       <1> Add a new item. show a list of items contained   |");
        System.out.println("|       <2> Add a new customer. show a list of customers     |");
        System.out.println("|       <3> Create an invoice for the selected customer      |");
        System.out.println("|       <4> Sort the invoice list                            |");
        System.out.println("|       <5> Search invoices                                  |");
        System.out.println("|       <6> Exit system                                      |");
        System.out.println("+============================================================+");
    }
    public void printSortOptions() {
        System.out.println("");
        System.out.println("               --- OPTIONS FOR SORT INVOICE ---               ");
        System.out.println("   +---------------------------------------------------------+");
        System.out.println("   |          1. Customer name (a-z)                         |");         
        System.out.println("   |          2. Total quantity                              |");
        System.out.println("   |          3. Total amount to be paid by the customer     |");
        System.out.println("   +---------------------------------------------------------+");
    }
    public void printSearchOptions() {
        System.out.println("");
        System.out.println("               --- YOU WANT SEARCH BY ...            ---      ");
        System.out.println("   +---------------------------------------------------------+");
        System.out.println("   |               1. Customer name                          |");         
        System.out.println("   |               2. By item name purchased.                |");
        System.out.println("   +---------------------------------------------------------+");
    }
    public void printMenuWriteFile() {
        System.out.println("");
        System.out.println("                  --- MENU WRITE FILE ---                     ");
        System.out.println("   +---------------------------------------------------------+");
        System.out.println("   |  1. Write staff proficient in C++ to Req2.txt           |");         
        System.out.println("   |  2. Write employees with salary > 4,700,000 to Req3.txt |");
        System.out.println("   |  3. Back to main menu                                   |");
        System.out.println("   +---------------------------------------------------------+");
        
    }
}
