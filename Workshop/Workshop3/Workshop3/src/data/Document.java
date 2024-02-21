
package data;

public class Document {
    protected String name;
    protected String author;
    protected int yearOfPub;
    protected double price;
    //Constuctor
    public Document(String name, String author, int yearOfPub, double price) {
        this.name = name;
        this.author = author;
        this.yearOfPub = yearOfPub;
        this.price = price;
    }
    // Get & set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //toString

    @Override
    public String toString() {
        return "Document{" + "name=" + name + ", author=" + author + ", yearOfPub=" + yearOfPub + ", price=" + price + '}';
    }
    
}
