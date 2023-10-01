import org.example.Library;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void testAddBook() {
        Library library = new Library();
        library.addBook("Book 1");
        assertTrue(library.isBookAvailable("Book 1"));
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        library.addBook("Book 1");
        library.removeBook("Book 1");
        assertFalse(library.isBookAvailable("Book 1"));
    }

    @Test
    public void testGetTotalBooks() {
        Library library = new Library();
        library.addBook("Book 1");
        library.addBook("Book 2");
        assertEquals(2, library.getTotalBooks());
    }

    @Test
    public void testIsBookAvailable() {
        Library library = new Library();
        library.addBook("Book 1");
        assertTrue(library.isBookAvailable("Book 1"));
        assertFalse(library.isBookAvailable("Book 2"));
    }

    @Test
    public void testGetAllBooks() {
        Library library = new Library();
        library.addBook("Book 1");
        library.addBook("Book 2");
        List<String> allBooks = library.getAllBooks();
        assertTrue(allBooks.contains("Book 1"));
        assertTrue(allBooks.contains("Book 2"));
    }

    @Test
    public void testBorrowBook() {
        // Write a test for the borrowBook method here
    }

    @Test
    public void testReturnBook() {
        // Write a test for the returnBook method here
    }

    @Test
    public void testReserveBook() {
        // Write a test for the reserveBook method here
    }

    @Test
    public void testIsBookReserved() {
        // Write a test for the isBookReserved method here
    }

    @Test
    public void testCheckoutBook() {
        // Write a test for the checkoutBook method here
    }

    @Test
    public void testIsBookOverdue() {
        // Write a test for the isBookOverdue method here
    }
}
