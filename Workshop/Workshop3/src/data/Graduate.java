
package data;

public class Graduate extends Student{ 
    private String position;
    private double salary;
    private int numberOfSubRetake;
    //Constructor

    public Graduate(String position, double salary, int numberOfSubRetake, String studentID, String key, String major, String studentRate, Subject subject, String fullName, String idNumber, String email, String phoneNumber, Address address) {
        super(studentID, key, major, studentRate, subject, fullName, idNumber, email, phoneNumber, address);
        this.position = position;
        this.salary = salary;
        this.numberOfSubRetake = numberOfSubRetake;
    }
    
    
    //Get & set methods

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
     public int getNumberOfSubRetake() {
        return numberOfSubRetake;
    }

    public void setNumberOfSubRetake(int numberOfSubRetake) {
        this.numberOfSubRetake = numberOfSubRetake;
    }
    //toString
    @Override
    public String toString() {
        return "Graduate{" + "position=" + position + ", salary=" + salary + '}';
    }
    //Methods show total tuition fees paid during the study period
    public double totalTuitionFees() {
        return this.subject.credits * 560;
    }
    
    
}
