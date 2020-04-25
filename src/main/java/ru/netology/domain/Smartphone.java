package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return getManufacturer().equals(that.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getManufacturer());
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "producer='" + manufacturer + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || this.getManufacturer().equalsIgnoreCase(search);
    }
}
