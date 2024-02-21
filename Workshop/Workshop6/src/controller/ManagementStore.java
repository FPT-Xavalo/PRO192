/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import Decorate.ToolCheck;
import data.Customer;
import data.Invoice;
import data.Item;

/**
 *
 * @author lvhho
 */
public class ManagementStore {

    private ArrayList<Customer> listCustomers = new ArrayList<>();
    private ArrayList<Item> listItems = new ArrayList<>();
    public ArrayList<Invoice> listInvoices = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    int countCodeItem = 10000000;
    int countCodeInvoice = 1000000;

    //Constructor
    public ManagementStore() {
    }

    /*MANAGEMENT CUSTOMERS*/
    // Add a customer to list
    public void addACustomer() {
        String code, name, address, email, phone;
        System.out.println("Intput information of customer:");
        System.out.print("Customer code: ");
        code = sc.nextLine().toUpperCase().trim();
        System.out.print("Customer name: ");
        name = sc.nextLine().toUpperCase().trim();
        System.out.print("Customer email: ");
        email = sc.nextLine().trim();
        System.out.print("Customer address: ");
        address = sc.nextLine().trim();
        System.out.print("Customer phone: ");
        phone = sc.nextLine().trim();
        listCustomers.add(new Customer(code, name, email, address, phone));
        System.out.println("Add successful >^<");
        System.out.println("");
        System.out.println("List of Customers store has now:");
        System.out.printf("|%-10s|%-20s|%-15s|%-15s|%-12s|\n", "CODE", "Full Name", "Email", "Province", "Phone number");
        System.out.println("--------------------------------------------------------------------------------");
        for (Customer customer : listCustomers) {
            customer.showLineInfo();
        }
    }

    public void printListOfCustomers() {
        if (listCustomers.isEmpty()) {
            System.out.println("List of customer is empty!");
        } else {
            System.out.printf("|%-10s|%-20s|%-15s|%-15s|%-12s|\n", "CODE", "Full Name", "Email", "Province", "Phone number");
            System.out.println("---------------------------------------------------------------------------------------");
            for (Customer customer : listCustomers) {
                customer.showLineInfo();
            }
        }
    }

    /*MANAGEMENT ITEMS*/
    public void addAItem() {
        String name, group;
        int code, choice;
        Double originPrice;
        System.out.println("Input information of item: ");
        code = countCodeItem;
        System.out.println("Item code: " + code);
        System.out.print("Item name: ");
        name = sc.nextLine().toUpperCase().trim();
        printGroupProductChoice();
        choice = ToolCheck.getAnInteger("Group product: ", "No have this choice!", 1, 5);
        group = productGroup(choice);
        System.out.print("Selling price origin: ");
        originPrice = ToolCheck.getADouble();
        listItems.add(new Item(code, name, group, originPrice));
        countCodeItem++;
        System.out.println("Add successful >^<");
    }

    //print group choice
    public void printGroupProductChoice() {
        System.out.println("Your item is:");
        System.out.println("<1>.Transportation");
        System.out.println("<2>.Garments");
        System.out.println("<3>.Household appliances");
        System.out.println("<4>.High-tech equipment");
        System.out.println("<5>.Food");
    }

    // productGroup 1 to 5
    public String productGroup(int choice) {
        String result = "";
        switch (choice) {
            case 1: {
                result = "Transportation";
                break;
            }
            case 2: {
                result = "Garments";
                break;
            }
            case 3: {
                result = "Household appliances";
                break;
            }
            case 4: {
                result = "High-tech equipment";
                break;
            }
            case 5: {
                result = "Food";
                break;
            }
        }
        return result;
    }

    public void printItemsList() {
        System.out.println("List of Items store has now:");
        System.out.printf("|%-8s|%-15s|%-20s|%-7s|\n", "CODE", "Name of Item", "Group", "VND");
        System.out.println("----------------------------------------------------------");
        for (Item item : listItems) {
            item.showLineInfo();
        }
    }

    /*MANAGEMENT INVOICE*/
    public void addAInvoice() {
        String checkCusCode, customerCode, time;
        int count = 1, numberOfQuantity, itemCode, choice;
        ArrayList<Item> itemsBought = new ArrayList<>();
        ArrayList<Integer> listQuantity = new ArrayList<>();
        System.out.println("Enter purchase INVOICE:");
        System.out.print("Customer code: ");
        checkCusCode = sc.nextLine().toUpperCase().trim();
        if (getCustomer(checkCusCode) == null) {
            System.out.println("This customer does not exist yet!!!");
            String code, name, address, email, phone;
            System.out.println("Intput information of customer:");
            System.out.print("Customer code: ");
            code = sc.nextLine().toUpperCase().trim();
            System.out.print("Customer name: ");
            name = sc.nextLine().toUpperCase().trim();
            System.out.print("Customer email: ");
            email = sc.nextLine().trim();
            System.out.print("Customer address: ");
            address = sc.nextLine().trim();
            System.out.print("Customer phone: ");
            phone = sc.nextLine().trim();
            listCustomers.add(new Customer(code, name, email, address, phone));
            customerCode = code;
        } else {
            customerCode = checkCusCode;
        }
        Customer cus = new Customer();
        cus = getCustomer(customerCode);
        time = getTime();
//        System.out.println("Time: " + time);

        // input item + quantity
        System.out.println("Enter the items and quantity purchased by " + cus.getFullName() + " :");
        Invoice newInvoice = null;
        do {
            menuEnterItemsBought();
            choice = ToolCheck.getAnInteger("Your choice:", "Your choice is not valid", 1, 2);
            switch (choice) {
                case 1: {
                    System.out.println("#" + count + " : ");
                    System.out.print("|Item code|: ");
                    itemCode = ToolCheck.getAnInteger();
                    if (getItemByCode(itemCode) != null) {
                        itemsBought.add(getItemByCode(itemCode));
                    } else {
                        System.out.println("Item is not exist!");
                        break;
                    }
                    System.out.print("|Quantity|: ");
                    numberOfQuantity = ToolCheck.getAnInteger();
                    listQuantity.add(numberOfQuantity);
                    newInvoice = new Invoice(itemCode, customerCode, time, itemsBought, listQuantity);
                    listInvoices.add(newInvoice);
                    count++;
                    break;

                }
                case 2: {
                    if (newInvoice != null) {
                        newInvoice.printInvoice();
                    }
                    System.out.println("Done >^<");
                    break;
                }
            }
        } while (choice != 2);

    }

    // list items customer buy
    // menu choice of enter item code
    public void menuEnterItemsBought() {
        System.out.println("<1> - New item");
        System.out.println("<2> - Print Invoice....");
    }
    //get Time 

    public String getTime() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }

    //get Item 
    public Item getItem(String itemName) {
        for (Item item : listItems) {
            if (itemName.equalsIgnoreCase(item.getItemName())) {
                return item;
            }
        }
        return null;
    }

    // get item by code
    public Item getItemByCode(int itemCode) {
        for (Item item : listItems) {
            if (itemCode == (item.getItemCode())) {
                return item;
            }
        }
        return null;
    }

    //get Customer
    public Customer getCustomer(String customerCode) {
        for (Customer cus : listCustomers) {
            if (customerCode.equalsIgnoreCase(cus.getCustomerCode())) {
                return cus;
            }
        }
        return null;
    }

    //<4> MANAGEMENT SORT
    //<a> Sort by customer name
    public ArrayList<Invoice> sortInvoiceByNameCustomer() {
        ArrayList<Invoice> sortList = new ArrayList<>(listInvoices);
        Comparator<Invoice> compareName = new Comparator<Invoice>() {
            @Override
            public int compare(Invoice i1, Invoice i2) {
                String codeCusInvoice1 = i1.getCustomerCode();
                String codeCusInvoice2 = i2.getCustomerCode();
                String nameCusInvoice1 = "";
                String nameCusInvoice2 = "";
                for (Customer customer : listCustomers) {
                    if(customer.getCustomerCode().equalsIgnoreCase(codeCusInvoice1)) {
                        String[] arrayWords = customer.getFullName().split("\\s+");
                        nameCusInvoice1 = arrayWords[arrayWords.length - 1];
                    }
                    if(customer.getCustomerCode().equalsIgnoreCase(codeCusInvoice2)) {
                        String[] arrayWords = customer.getFullName().split("\\s+");
                        nameCusInvoice2 = arrayWords[arrayWords.length - 1];
                    }
                }
                return nameCusInvoice1.compareTo(nameCusInvoice2);
            }
        };
        Collections.sort(sortList,compareName);
        return sortList;
    }
    //<b> Sort by total quantity
    public ArrayList<Invoice> sortInvoiceByTotalQuantity() {
        ArrayList<Invoice> sortList = new ArrayList<>(listInvoices);
        Comparator<Invoice> sortTotal = new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                if (o1.getTotalQuantity() == o2.getTotalQuantity()) {
                    return 0;
                } else if (o1.getTotalQuantity() > o2.getTotalQuantity()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(sortList, sortTotal);
        return sortList;
    }
    //<c> total pay
    public ArrayList<Invoice> sortInvoiceByTotalPay() {
        ArrayList<Invoice> sortList = new ArrayList<>(listInvoices);
        Comparator<Invoice> sortPay = new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                if (o1.getPay() == o2.getPay()) {
                    return 0;
                } else if (o1.getPay() > o2.getPay()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(sortList,sortPay);
        return sortList;
    }

    //<5> MANAGEMENT SEARCH
    //<a> Search by Customer name
    public ArrayList<Invoice> searchInvoiceByName(String cusName) {
        ArrayList<Invoice> listInvoice;
        listInvoice = new ArrayList<>();
        String cusCode = null;
        for (Customer customer : listCustomers) {
            if (customer.getFullName().equalsIgnoreCase(cusName)) {
                cusCode = customer.getCustomerCode();
            }
        }
        if (cusCode != null) {
            for (Invoice invoice : listInvoices) {
                if (invoice.getCustomerCode().equalsIgnoreCase(cusCode)) {
                    listInvoice.add(invoice);
                }
            }
        }
        return listInvoice;
    }

    //<b> Search by itemName
    public ArrayList<Invoice> searchInvoiceByItem(String itemName) {
        ArrayList<Invoice> listInvoice;
        listInvoice = new ArrayList<>();
        for (Invoice invoice : listInvoices) {
            ArrayList<Item> listItemInInvoice = invoice.getListItems();
            for (Item item : listItemInInvoice) {
                if (item.getItemName().equalsIgnoreCase(itemName)) {
                    listInvoice.add(invoice);
                }
            }
        }
        return listInvoice;
    }
}
