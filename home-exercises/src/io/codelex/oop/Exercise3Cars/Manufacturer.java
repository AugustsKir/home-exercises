package io.codelex.oop.Exercise3Cars;

import java.time.LocalDate;
import java.util.Objects;

public class Manufacturer {
    String brandName;
    LocalDate yearOfEstablishment;
    String country;

    public Manufacturer(String name, LocalDate yearOfEstablishment, String country) {
        this.brandName = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getBrandName() {
        return brandName;
    }

    public LocalDate getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(brandName, that.brandName) && Objects.equals(yearOfEstablishment, that.yearOfEstablishment) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, yearOfEstablishment, country);
    }
}
