package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    Book book1 = new Book(1,"Origin of species", 48, "Charles Darwin");
    Book book2 = new Book(2,"The ultimate secret", 65,"Bernard Werber");
    Smartphone smart1 = new Smartphone(3,"P30 lite", 269, "HUAWEI");
    Smartphone smart2 = new Smartphone(4,"OnePlus 8", 999,"ONEPLUS");

    @BeforeEach
    void setup(){
        manager.add(book1);
        manager.add(book2);
        manager.add(smart1);
        manager.add(smart2);
    }
    @Test
    void shouldSearchByName() {
        Product[] expected = new Product[]{book1};
        Product[] actual = manager.searchBy("Charles Darwin");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByBooksName() {
        Product[] expected = {new Book(2,"The ultimate secret", 65,"Bernard Werber")};
        Product[] actual = manager.searchBy("The ultimate secret");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBySmartphoneName() {
        Product[] expected = {new Smartphone(3,"P30 lite", 269, "HUAWEI")};
        Product[] actual = manager.searchBy("P30 lite");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByManufacturer() {
        Product[] expected = { new Smartphone(4,"OnePlus 8", 999,"ONEPLUS")};
        Product[] actual = manager.searchBy("OnePlus");
        assertArrayEquals(expected, actual);
    }
}