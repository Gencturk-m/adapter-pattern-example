package org.example;

import java.util.ArrayList;
import java.util.List;

public class MernisService {

    private List<Person> customers;

    public MernisService() {
        this.customers = new ArrayList<>();
        customers.add(new Person("Ahmet","Şimşek",1964,"12345678910"));
        customers.add(new Person("Mehmet","Yılmaz",1988,"10987654321"));
        customers.add(new Person("Ayşe","Boz",1975,"62345178910"));
    }

    boolean checkPerson(Person person){
        for (Person p : customers) {
            if (p.equals(person)){
                return true;
            }
        }
        return false;
    }
}
