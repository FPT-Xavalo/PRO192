
package data;

public class Subject extends Document{
    protected String subCode;
    protected int credits;
    protected String title;
    protected String references; // nguoi gioi thieu
    //Constructor
    public Subject(String subCode, int credits, String title, String references, String name, String author, int yearOfPub, double price) {
        super(name, author, yearOfPub, price);
        this.subCode = subCode;
        this.credits = credits;
        this.title = title;
        this.references = references;
    }
    //Get & set methods

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }
    //toString

    @Override
    public String toString() {
        return "Subject{" + "subCode=" + subCode + ", credits=" + credits + ", title=" + title + ", references=" + references + '}';
    }
    
    
    
    
    
}
