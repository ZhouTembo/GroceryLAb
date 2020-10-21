package com.wozu.LabA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//page creates Table's "essence"


@Entity
public class Grocery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

//    Constructor
    public Grocery(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

//    Getters and Setters
public int getId() {
    return id;
}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private int qty;
}
