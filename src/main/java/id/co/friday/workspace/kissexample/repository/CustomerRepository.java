package id.co.friday.workspace.kissexample.repository;

import org.springframework.stereotype.Repository;

import id.co.friday.workspace.kissexample.model.Customer;

@Repository
public interface CustomerRepository extends GenericCRUDRepository<Customer, Long> {
    
}
