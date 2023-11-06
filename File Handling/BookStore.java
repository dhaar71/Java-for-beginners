import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Book implements Serializable {
    private String bookTitle;
    private double bookPrice;
    private int bookId;

    public Book(String bookTitle, double bookPrice, int bookId) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "Book [Title: " + bookTitle + ", Price: " + bookPrice + ", ID: " + bookId + "]";
    }
}

public class BookStore {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 25.99, 1));
        books.add(new Book("Book2", 19.99, 2));
        books.add(new Book("Book3", 34.50, 3));
        books.add(new Book("Book4", 15.75, 4));
        books.add(new Book("Book5", 29.99, 5));

        // Serialize and save the book details to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bookdetails.dat"))) {
            oos.writeObject(books);
            System.out.println("Book details have been saved to bookdetails.dat.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the book details from the file and search for a book by title
        String searchTitle = "Book3";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bookdetails.dat"))) {
            List<Book> storedBooks = (List<Book>) ois.readObject();
            for (Book book : storedBooks) {
                if (book.getBookTitle().equals(searchTitle)) {
                    System.out.println("Found book with title '" + searchTitle + "': " + book);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Find the book with the highest price
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bookdetails.dat"))) {
            List<Book> storedBooks = (List<Book>) ois.readObject();
            Book highestPriceBook = null;
            double highestPrice = Double.MIN_VALUE;
            for (Book book : storedBooks) {
                if (book.getBookPrice() > highestPrice) {
                    highestPrice = book.getBookPrice();
                    highestPriceBook = book;
                }
            }
            System.out.println("Book with the highest price: " + highestPriceBook);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

