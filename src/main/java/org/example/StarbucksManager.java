package org.example;

import java.util.ArrayList;
import java.util.List;

public class StarbucksManager {

    PersonCheckService service;
    List<Customer> customers;

    public StarbucksManager(PersonCheckService service) {
        this.service = service;
        this.customers = new ArrayList<>();
    }

    public void registerCustomer(Customer customer){
        if (service.checkPerson(customer)) {
            System.out.println("Kayıt Başarılı.");
            customers.add(customer);
        } else {
            System.out.println("Kayıt Başarısız.");
        }
    }

    public void showCustomers(){
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }

    }

}
