package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void shouldMatchesByManufacturer() {
        Smartphone smartphone = new Smartphone(3,"P30 lite", 269, "HUAWEI");
        assertTrue(smartphone.matches("Huawei"));
    }

    @Test
    void shouldMatchesByName() {
        Smartphone smartphone = new Smartphone(3,"P30 lite", 269, "HUAWEI");
        assertFalse(smartphone.matches("Galaxy S20"));
    }
}