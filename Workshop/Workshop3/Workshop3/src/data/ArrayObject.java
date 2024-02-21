/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author lvhho
 */
public class ArrayObject {

    Student[] arrObject = new Student[100];
    private int count = 0;
    private Scanner sc = new Scanner(System.in);

    //<1> Method to add one student to the list
    public void addAStudent() {
        int credits, yearOfPub, houseNumber;
        double price;
        String subCode, title, references, name, author;
        String ward, district, province, streetName;
        String studentID, key, major, studentRate;
        String fullName, idNumber, email, phoneNumber;
        Subject subject;
        Address address;
        //Input infor student
        System.out.println("Input student " + (count + 1) + "/" + arrObject.length);
        System.out.print("Student name: ");
        fullName = sc.nextLine().toUpperCase();

        System.out.print("Input idNumber - CCCD: ");
        idNumber = sc.nextLine();

        System.out.print("Input student email: ");
        email = sc.nextLine();

        System.out.print("Phone number: ");
        phoneNumber = sc.nextLine();

        System.out.print("Student ID: ");
        studentID = sc.nextLine().toUpperCase();

        System.out.print("Key: ");
        key = sc.nextLine().toUpperCase();

        System.out.print("Major: ");
        major = sc.nextLine();
        System.out.print("Student rating <String>: ");
        studentRate = sc.nextLine();

        System.out.print("Input Subject code: ");
        subCode = sc.nextLine().toUpperCase();

        System.out.print("Prerequisite courses <title>: ");
        title = sc.nextLine();

        System.out.print("References <String>: ");
        references = sc.nextLine();

        System.out.print("Number of credits <int>: ");
        credits = Integer.parseInt(sc.nextLine());

        System.out.print("Name of the document : ");
        name = sc.nextLine();

        System.out.print("Author: ");
        author = sc.nextLine().toUpperCase();

        System.out.print("Year of publication: ");
        yearOfPub = Integer.parseInt(sc.nextLine());

        System.out.print("Cover price <double>: ");
        price = Double.parseDouble(sc.nextLine());

        System.out.print("House number <int>: ");
        houseNumber = Integer.parseInt(sc.nextLine());

        System.out.print("Street name: ");
        streetName = sc.nextLine();

        System.out.print("Ward: ");
        ward = sc.nextLine();

        System.out.print("District: ");
        district = sc.nextLine();

        System.out.print("Province: ");
        province = sc.nextLine();

        address = new Address(houseNumber, streetName, ward, district, province);
        subject = new Subject(subCode, credits, title, references, name, author, yearOfPub, price);
        arrObject[count] = new Student(studentID, key, major, studentRate, subject, fullName, idNumber, email, phoneNumber, address);
        count++;
        System.out.println("Add student successfully");

    }

    //<2> Edit info student by ID
    public void editInfoStudent() {
        int credits, yearOfPub, houseNumber;
        double price;
        String subCode, title, references, name, author;
        String ward, district, province, streetName;
        String studentID, key, major, studentRate;
        String fullName, idNumber, email, phoneNumber;
        Subject subject;
        Address address;
        System.out.print("Enter ID student you want to update: ");
        String idStd = sc.nextLine();
        int positionOfStudentRemove = -1;
        for (int i = 0; i < count; i++) {
            if (arrObject[i].getStudentID().equalsIgnoreCase(idStd)) {
                positionOfStudentRemove = i;
            }
        }
        if (positionOfStudentRemove != -1) {
            System.out.print("Student name: ");
            fullName = sc.nextLine().toUpperCase();

            System.out.print("Input idNumber - CCCD: ");
            idNumber = sc.nextLine();

            System.out.print("Input student email: ");
            email = sc.nextLine();

            System.out.print("Phone number: ");
            phoneNumber = sc.nextLine();

            System.out.print("Student ID: ");
            studentID = sc.nextLine();

            System.out.print("Key: ");
            key = sc.nextLine().toUpperCase();

            System.out.print("Major: ");
            major = sc.nextLine();
            System.out.print("Student rating <String>: ");
            studentRate = sc.nextLine();

            System.out.print("Input Subject code: ");
            subCode = sc.nextLine().toUpperCase();

            System.out.print("Prerequisite courses <title>: ");
            title = sc.nextLine();

            System.out.print("References <String>: ");
            references = sc.nextLine();

            System.out.print("Number of credits <int>: ");
            credits = Integer.parseInt(sc.nextLine());

            System.out.print("Name of the document : ");
            name = sc.nextLine();

            System.out.print("Author: ");
            author = sc.nextLine().toUpperCase();

            System.out.print("Year of publication: ");
            yearOfPub = Integer.parseInt(sc.nextLine());

            System.out.print("Cover price <double>: ");
            price = Double.parseDouble(sc.nextLine());

            System.out.print("House number <int>: ");
            houseNumber = Integer.parseInt(sc.nextLine());

            System.out.print("Street name: ");
            streetName = sc.nextLine();

            System.out.print("Ward: ");
            ward = sc.nextLine();

            System.out.print("District: ");
            district = sc.nextLine();

            System.out.print("Province: ");
            province = sc.nextLine();

            address = new Address(houseNumber, streetName, ward, district, province);
            subject = new Subject(subCode, credits, title, references, name, author, yearOfPub, price);
            arrObject[positionOfStudentRemove] = new Student(studentID, key, major, studentRate, subject, fullName, idNumber, email, phoneNumber, address);
            System.out.println("Successfully updated!");
        }
    }

    //<3> Clear object
    public void removeStudent() {
        System.out.print("Enter ID student you want to remove: ");
        String idStd = sc.nextLine();
        int positionOfStudentRemove = -1;
        for (int i = 0; i < count; i++) {
            if (arrObject[i].getStudentID().equalsIgnoreCase(idStd)) {
                positionOfStudentRemove = i;
            }
        }
        if (positionOfStudentRemove != -1) {
            for (int i = positionOfStudentRemove; i < count - 1; i++) {
                arrObject[i] = arrObject[i + 1];
            }
            count--;
        } else {
            System.out.println("NO search result!!!");
        }
    }

    //<4> Search student by ID
    public void searchByID() {
        System.out.print("Enter ID student you want to find: ");
        String idstd = sc.nextLine();
        int check = 0;
        for (int i = 0; i < count; i++) {
            if (arrObject[i].getStudentID().equalsIgnoreCase(idstd)) {
                System.out.print("Search is complete: ");
                arrObject[i].showProfileLearning();
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("NO search result!!!");
        }
    }

    //<5> Search student by name
    public void searchByName() {
        System.out.print("Enter name of student you want to find: ");
        String nameStd = sc.nextLine();
        int check = 0;
        for (int i = 0; i < count; i++) {
            if (arrObject[i].getFullName().equalsIgnoreCase(nameStd)) {
                System.out.print("Search is complete: ");
                arrObject[i].showProfileLearning();
            }
        }
        if (check == 0) {
            System.out.println("No search results!");
        }
    }

    //<6> Sort student by name ( a - z )
    public void sortStudentListByName() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arrObject[i].getFullName().compareToIgnoreCase(arrObject[j].getFullName()) > 0) {
                    Student tmp = arrObject[i];
                    arrObject[i] = arrObject[j];
                    arrObject[j] = tmp;
                }
            }
        }
        System.out.println("Sort a to z is done!");
    }

    //<7> Print the list of the student
    public void printStudentList() {
        System.out.println("Here is the student list you have: ");
        for (int i = 0; i < count; i++) {
            arrObject[i].showProfileLearning();
        }
    }
}
