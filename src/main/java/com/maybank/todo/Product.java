package com.maybank.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
 
@Entity
@Data
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String madein;
    private float price;
 
    protected Product() {
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
     
    // other getters and setters are hidden for brevity
}