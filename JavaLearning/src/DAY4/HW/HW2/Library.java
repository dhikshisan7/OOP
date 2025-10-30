package DAY4.HW.HW2;
class Author {
    String name;
    String email;
    char gender;
    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    void display() {
        System.out.println("Author Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }
}
class Book {
    String name;
    Author author; // Composition: Book HAS-A Author
    double price;
    int qtyInStock;
    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    void displayBook() {
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + qtyInStock);
        System.out.println("----- About Author -----");
        author.display();
    }
}
public class Library {
    public static void main(String[] args) {
        Author author = new Author("Franz Kafka", "fk@example.com", 'M');
        Book book = new Book("The Metamorphosis", author, 98.50, 50);
        book.displayBook();
    }
}
