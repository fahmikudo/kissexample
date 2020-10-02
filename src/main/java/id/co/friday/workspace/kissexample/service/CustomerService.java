package id.co.friday.workspace.kissexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.co.friday.workspace.kissexample.model.Customer;
import id.co.friday.workspace.kissexample.repository.CustomerRepository;

@Service
public class CustomerService extends GenericCRUDService<Customer, Long> {
    
    @Autowired
    public CustomerRepository customerRepository;

    CustomerRepository getRepository(){
        return customerRepository;
    }

}
