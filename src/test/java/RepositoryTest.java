import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Book book1 = new Book(1, " War and Peace 1", 300, "Tolstoy");
    Book book2 = new Book(2, " War and Peace 2", 300, "Tolstoy");
    Smartphone smartphone1 = new Smartphone(3, "Xiomi", 1000, "China");
    @Test
    public void removeProducts() {
        Repository repo = new Repository();
        //   ProductManager manager = new ProductManager(repo);
        repo.add(book1);
        repo.add(book2);
        repo.add(smartphone1);
        repo.remove(2);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, smartphone1};
        Assertions.assertArrayEquals(actual, expected);
    }


    @Test
    public void addProducts() {
        Repository repo = new Repository();
        //   ProductManager manager = new ProductManager(repo);
        repo.add(book1);
        repo.add(book2);
        repo.add(smartphone1);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, smartphone1};
        Assertions.assertArrayEquals(actual, expected);
    }

}