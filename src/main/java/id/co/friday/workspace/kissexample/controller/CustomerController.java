package id.co.friday.workspace.kissexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.co.friday.workspace.kissexample.model.Customer;
import id.co.friday.workspace.kissexample.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController extends GenericCRUDController<Customer, Long> {
    
    @Autowired
    private CustomerService customerService;

    CustomerService getService(){
        return customerService;
    }

}
