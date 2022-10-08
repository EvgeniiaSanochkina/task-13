import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    public void searchingProducts() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, " War and Peace 1", 300, "Tolstoy");
        Book book2 = new Book(2, " War and Peace 2", 300, "Tolstoy");
        Smartphone smartphone1 = new Smartphone(3, "Xiomi", 1000, "China");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);

        Product[] actual = manager.searchBy(" War");
        Product[] expected = {book1, book2};
        Assertions.assertArrayEquals(actual, expected);
    }


}