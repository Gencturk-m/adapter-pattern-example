package org.example;

public class MernisServiceAdapter implements PersonCheckService {
    @Override
    public boolean checkPerson(Customer customer) {
        MernisService mernisService = new MernisService();
        return mernisService.checkPerson(customer);
    }
}
