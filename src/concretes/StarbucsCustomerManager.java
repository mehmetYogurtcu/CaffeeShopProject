package concretes;

import abstracts.CustomerCheckService;
import abstracts.CustomerManager;
import entities.Customer;

public class StarbucsCustomerManager extends CustomerManager {

    private CustomerCheckService customerCheckService;


    public StarbucsCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer){

        if (customerCheckService.CheckIfRealPerson(customer)){
                super.save(customer);
        }else{

            System.out.println("Not a valid person");

        }



    }



}
