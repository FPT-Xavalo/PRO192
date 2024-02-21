
package data;

public class Dean extends Instuctor{
    private int tenure;
    private String membersAchivements;
    //Constructor

    public Dean(int tenure, String membersAchivements, String instructorCode, String specializationSubject, int experience, double salary, String workingPosition, Subject subject, String fullName, String idNumber, String email, String phoneNumber, Address address) {
        super(instructorCode, specializationSubject, experience, salary, workingPosition, subject, fullName, idNumber, email, phoneNumber, address);
        this.tenure = tenure;
        this.membersAchivements = membersAchivements;
    }
    //Get & set Methods
    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public String getMembersAchivements() {
        return membersAchivements;
    }

    public void setMembersAchivements(String membersAchivements) {
        this.membersAchivements = membersAchivements;
    }
    //toString

    @Override
    public String toString() {
        return "Dean{" + "tenure=" + tenure + ", membersAchivements=" + membersAchivements + '}';
    }
    
}
