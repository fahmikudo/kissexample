package id.co.friday.workspace.kissexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import id.co.friday.workspace.kissexample.service.GenericCRUDService;

public class GenericCRUDController<T, ID> {
    
    private GenericCRUDService<T, ID> service;

    GenericCRUDService<T, ID> getService(){
        return service;
    }

    @GetMapping
    public ResponseEntity<?> select() {
        return ResponseEntity.ok(getService().select());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> select(@PathVariable ID id) {
        return ResponseEntity.ok(getService().select(id));
    }
    
    @PostMapping
    public ResponseEntity<?> insertOrUpdate(@RequestBody T t) {
        return ResponseEntity.ok(getService().insertOrUpdate(t));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable ID id) {
        getService().delete(id);
        return ResponseEntity.ok().build();
    }

}
