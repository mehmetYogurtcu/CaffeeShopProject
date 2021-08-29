import abstracts.CustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucsCustomerManager;
import entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new StarbucsCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"mehmet","yoğurtcu", LocalDate.of(2000, 5, 12),"11111111111"));


    }
}



