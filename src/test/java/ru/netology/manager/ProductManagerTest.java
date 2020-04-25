package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);
    @Test
    void shouldSearchByName() {
        Product[] expected = {new Book(1,"Origin of species", 48, "Charles Darwin")};
        Product[] actual = manager.searchBy("Charles Darwin");
        assertEquals(expected, actual);
    }

    @Test
    void shouldSearchByBooksName() {
        Product[] expected = {new Book(2,"The ultimate secret", 65,"Bernard Werber")};
        Product[] actual = manager.searchBy("The ultimate secret");
        assertEquals(expected, actual);
    }

    @Test
    void shouldSearchBySmartphoneName() {
        Product[] expected = {new Smartphone(3,"P30 lite", 269, "HUAWEI")};
        Product[] actual = manager.searchBy("P30 lite");
        assertEquals(expected, actual);
    }

    @Test
    void shouldSearchByManufacturer() {
        Product[] expected = { new Smartphone(4,"OnePlus 8", 999,"ONEPLUS")};
        Product[] actual = manager.searchBy("OnePlus");
        assertEquals(expected, actual);
    }
}