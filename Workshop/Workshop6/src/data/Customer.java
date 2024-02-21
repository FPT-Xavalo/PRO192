/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author lvhho
 */
public class Customer {
    private String customerCode, fullName, address, email, phoneNumber;
    
    //Constructor
    
    public Customer() {
    }

    public Customer(String customerCode, String fullName, String email, String address, String phoneNumber) {
        this.customerCode = customerCode;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    //Getter & Setter

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //toString

    @Override
    public String toString() {
        return "Customer{" + "customerCode=" + customerCode + ", fullName=" + fullName + ", email=" + email +", address=" + address + ", phoneNumber=" + phoneNumber + '}';
    }
    public void showLineInfo() {
        System.out.printf("|%-10s|%-20s|%-15s|%-15s|%-12s|\n", customerCode, fullName, email, address, phoneNumber);
    }
}
