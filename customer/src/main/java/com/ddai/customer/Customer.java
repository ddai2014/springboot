package com.ddai.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    @Id private final int id;
    private final String name;
    private final String address;

    public Customer() {
        this (1, "John Doe", "100 Main Street");
    }

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }    

    
    
}
