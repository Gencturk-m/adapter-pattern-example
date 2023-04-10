package org.example;


public class Customer extends Person{
    public Customer() {
    }

    public Customer(String name, String lastName, int birthYear, String nationalityNumber) {
        super(name, lastName, birthYear, nationalityNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
