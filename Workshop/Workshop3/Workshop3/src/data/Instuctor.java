package data;

public class Instuctor extends Person{
    private String instructorCode;
    private String specializationSubject;
    private int experience;
    private double salary;
    private String workingPosition;
    private Subject subject;
    //Constructor
    public Instuctor(String instructorCode, String specializationSubject, int experience, double salary, String workingPosition, Subject subject, String fullName, String idNumber, String email, String phoneNumber, Address address) {
        super(fullName, idNumber, email, phoneNumber, address);
        this.instructorCode = instructorCode;
        this.specializationSubject = specializationSubject;
        this.experience = experience;
        this.salary = salary;
        this.workingPosition = workingPosition;
        this.subject = subject;
    }
    //Get & set

    public String getInstructorCode() {
        return instructorCode;
    }

    public void setInstructorCode(String instructorCode) {
        this.instructorCode = instructorCode;
    }

    public String getSpecializationSubject() {
        return specializationSubject;
    }

    public void setSpecializationSubject(String specializationSubject) {
        this.specializationSubject = specializationSubject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    //toString

    @Override
    public String toString() {
        return "Instuctor{" + "instructorCode=" + instructorCode + ", specializationSubject=" + specializationSubject + ", experience=" + experience + ", salary=" + salary + ", workingPosition=" + workingPosition + ", subject=" + subject + '}';
    }
    
    
    
    
}
