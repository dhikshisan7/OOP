package MINIPROJECT;
import java.util.*;
public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        Member member = new Member("M001", "Dhikshi"); // demo user

        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. View All Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Book ID: ");
                        String id = sc.nextLine();
                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();
                        library.addBook(new Book(id, title, author));
                        break;

                    case 2:
                        System.out.print("Enter Book ID to issue: ");
                        String issueId = sc.nextLine();
                        library.issueBook(issueId, member);
                        break;

                    case 3:
                        System.out.print("Enter Book ID to return: ");
                        String returnId = sc.nextLine();
                        System.out.print("Enter late days: ");
                        int days = sc.nextInt();
                        library.returnBook(returnId, days);
                        break;

                    case 4:
                        System.out.println("\nAll Books:");
                        for (Book b : library.getAllBooks()) {
                            System.out.println(b);
                        }
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
