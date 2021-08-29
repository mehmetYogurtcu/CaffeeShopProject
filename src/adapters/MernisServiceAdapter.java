package adapters;


import MernisService.KSDKPSPublicSoap;
import abstracts.CustomerCheckService;
import entities.Customer;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        KSDKPSPublicSoap clint = new KSDKPSPublicSoap();

        try {
            return clint.TCKimlikNoDogrula(Long.valueOf((customer.getNationalityId())), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;

    }
}