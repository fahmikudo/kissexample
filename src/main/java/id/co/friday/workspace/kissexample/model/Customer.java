package id.co.friday.workspace.kissexample.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
    /**
    *
    */
    private static final long serialVersionUID = 1L;

    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    private String customerId;

    private String customerName;

    private String customerAddress;
    
    
}
