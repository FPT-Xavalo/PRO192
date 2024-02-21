/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levanhuyhoang_se170333_ws6;

import Decorate.Menu;
import Decorate.ToolCheck;
import data.Invoice;
import controller.ManagementStore;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lvhho
 */
public class LeVanHuyHoang_SE170333_WS6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("WELCOME TO WORKSHOP 6 OF HUY HOANG");
        Scanner sc = new Scanner(System.in);
        int choice;
        ManagementStore store = new ManagementStore();
        Menu menu = new Menu();
        do {
            menu.printMenu();
            choice = ToolCheck.getAnInteger("Enter your choice: ", "Your selection is not valid, choose form 1 to 6!", 1, 6);
            switch (choice) {
                case 1: {
                    store.addACustomer();
                    break;
                }
                case 2: {
                    store.addAItem();
                    store.printItemsList();
                    break;
                }
                case 3: {
                    store.addAInvoice();
                    break;
                }
                case 4: {
                    int choice4;
                    menu.printSortOptions();
                    choice4 = ToolCheck.getAnInteger("Sort by :", "Your selection is not valid, choose form 1 to 3!", 1, 3);
                    ArrayList<Invoice> sortList = new ArrayList<>();
                    switch (choice4) {
                        case 1: {
                            sortList = store.sortInvoiceByNameCustomer();
                            System.out.println("List Invoice after sort by NAME OF CUSTOMER (A->Z): ");
                            break;
                        }
                        case 2: {
                            sortList = store.sortInvoiceByTotalQuantity();
                            System.out.println("List Invoice after sort by TOTAL QUANTITY: ");
                            for (Invoice invoice : sortList) {
                                invoice.printInvoice();
                            }
                            break;
                        }
                        case 3: {
                            sortList = store.sortInvoiceByTotalPay();
                            System.out.println("List Invoice after sort by TOTAL customer PAY: ");
                            for (Invoice invoice : sortList) {
                                invoice.printInvoice();
                            }
                            break;
                        }
                    }

                    break;
                }
                case 5: {
                    int choice5;
                    menu.printSearchOptions();
                    choice5 = ToolCheck.getAnInteger("Sort by :", "Your selection is not valid, choose form 1 to 2!", 1, 2);
                    ArrayList<Invoice> listAfterSearch = new ArrayList<>();
                    switch (choice5) {
                        case 1: {
                            System.out.print("Enter name of customer: ");
                            String name = sc.nextLine().trim();
                            listAfterSearch = store.searchInvoiceByName(name);
                            if (listAfterSearch.isEmpty()) {
                                System.out.println("Can not found invoice with information " + name + ".");
                            } else {
                                for (Invoice invoice : listAfterSearch) {
                                    invoice.printInvoice();
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.print("Enter name of Item: ");
                            String itemName = sc.nextLine().trim();
                            listAfterSearch = store.searchInvoiceByItem(itemName);
                            if(listAfterSearch.isEmpty()) {
                                System.out.println("Can not found invoice with information " + itemName +".");
                            }else {
                                for(Invoice invoice : listAfterSearch) {
                                    invoice.printInvoice();
                                }
                            }
                            break;
                        }
                    }
                    break;
                }

            }
        } while (choice != 6);
    }

}
