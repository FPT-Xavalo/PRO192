package data;

public class Student extends Person {

    private String studentID;
    private String key;
    private String major;
    private String studentRate;
    protected Subject subject;
    //Constuctor

    public Student(String studentID, String key, String major, String studentRate, Subject subject, String fullName, String idNumber, String email, String phoneNumber, Address address) {
        super(fullName, idNumber, email, phoneNumber, address);
        this.studentID = studentID;
        this.key = key;
        this.major = major;
        this.studentRate = studentRate;
        this.subject = subject;
    }
    // Get & set methods

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentRate() {
        return studentRate;
    }

    public void setStudentRate(String studentRate) {
        this.studentRate = studentRate;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    //ToString
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", key=" + key + ", major=" + major + ", studentRate=" + studentRate + ", subject=" + subject + '}';
    }

    //Show profile learing
    public void showProfileLearning() {
        System.out.printf("|%8s|%4s|%-25s|%20s|%20s|\n", studentID, key, fullName, major, email);
    }

    public void showPersonalInformation() {
        System.out.println("Personal Information");
        System.out.printf("|%-25s|CCCD: %-10s|Phone: %-11s| %15s - %15s|\n", fullName, idNumber, phoneNumber, address.district, address.province);
    }

    public void showStudentInformation() {
        this.showProfileLearning();
        this.showPersonalInformation();
    }
}
