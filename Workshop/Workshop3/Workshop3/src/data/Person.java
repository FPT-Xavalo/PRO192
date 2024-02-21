
package data;

public class Person {
    protected String fullName;
    protected String idNumber;
    protected String email;
    protected String phoneNumber;
    protected Address address;
    //Constuctor
    public Person(String fullName, String idNumber, String email, String phoneNumber, Address address) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    // Get & set methods

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    //ToString 

    @Override
    public String toString() {
        return "Person{" + "fullName=" + fullName + ", idNumber=" + idNumber + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + '}';
    }
    
}
