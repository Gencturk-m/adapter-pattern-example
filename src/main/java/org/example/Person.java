package org.example;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private int birthYear;
    private String nationalityNumber;

    public Person() {
    }

    public Person(String name, String lastName, int birthYear, String nationalityNumber) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.nationalityNumber = nationalityNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getNationalityNumber() {
        return nationalityNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setNationalityNumber(String nationalityNumber) {
        this.nationalityNumber = nationalityNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return birthYear == person.birthYear && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName) && Objects.equals(nationalityNumber, person.nationalityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, birthYear, nationalityNumber);
    }

    @Override
    public String toString() {
        return "Nationality Number: " + this.getNationalityNumber() +
                ", Customer Name: " + this.getName() +
                ", Lastname: " + this.getLastName() +
                ", Birth Year: " + this.getBirthYear();
    }
}
