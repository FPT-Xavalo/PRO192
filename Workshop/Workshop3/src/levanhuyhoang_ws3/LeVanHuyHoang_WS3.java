/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levanhuyhoang_ws3;

import data.ArrayObject;
import java.util.Scanner;

/**
 *
 * @author lvhho
 */
public class LeVanHuyHoang_WS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** WELCOME TO > HUY HOANG < PROGRAM ***");
        Scanner sc = new Scanner(System.in);
        ArrayObject arrayStudent = new ArrayObject();
        int choice;
        do {
            printMenuChoice();
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    arrayStudent.addAStudent();
                    break;
                }
                case 2: {
                    arrayStudent.editInfoStudent();
                    break;
                }
                case 3: {
                    arrayStudent.removeStudent();
                    break;
                }
                case 4: {
                    arrayStudent.searchByName();
                    break;
                }
                case 5: {
                    arrayStudent.searchByID();
                    break;
                }
                case 6: {
                    arrayStudent.sortStudentListByName();
                    break;
                }
                case 7: {
                    arrayStudent.printStudentList();
                    break;
                }
                default: {
                    System.out.println("Your choice is not valid! Try again!!");
                }
            }
        } while (choice != 8);
    }

    public static void printMenuChoice() {
        System.out.println("HH PROGRAM HAVE 8 OPTIONS");
        System.out.println("Enter your choice you want:");
        System.out.println("<1> Add student to your list");
        System.out.println("<2> Edit information of student in the list by ID student");
        System.out.println("<3> Clear information of student in the list by ID student");
        System.out.println("<4> Search student by name");
        System.out.println("<5> search student by ID student");
        System.out.println("<6> Sort the list by name ( a - z )");
        System.out.println("<7> Print the list of student");
        System.out.println("<8> Exit HH program");

    }

}
