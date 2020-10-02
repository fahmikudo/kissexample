package id.co.friday.workspace.kissexample.service;

import java.util.List;

import id.co.friday.workspace.kissexample.repository.GenericCRUDRepository;

public abstract class GenericCRUDService<T, ID> {
    
    private GenericCRUDRepository<T, ID> repository;

    GenericCRUDRepository<T, ID> getRepository() {
        return repository;
    }

    public T select(ID id) {
        return getRepository().findById(id).get();
    }
    
    public List<T> select() {
        return getRepository().findAll();
    }
    
    public T insertOrUpdate(T t) {
        return getRepository().save(t);
    }
    
    public void delete(ID id) {
        getRepository().deleteById(id);
    }



}
