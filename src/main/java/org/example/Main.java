package org.example;

public class Main {
    public static void main(String[] args) {
        StarbucksManager sbManager = new StarbucksManager(new MernisServiceAdapter());

        Customer c1 = new Customer("Ayşe","Boz",1975,"62345178910");
        Customer c2 = new Customer("Ahmet","Şimşek",1964,"12345678910");
        Customer c3 = new Customer("Mehmet","Yılmaz",1988,"10987654321");
        Customer c4 = new Customer("Fatma","Boz",1975,"62345178910");


        //gerçek kişi
        sbManager.registerCustomer(c1);
        sbManager.registerCustomer(c2);
        sbManager.registerCustomer(c3);
        //sahte kişi
        sbManager.registerCustomer(c4);

        sbManager.showCustomers();
    }
}