package com.example.cvv2.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Cv {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToMany(mappedBy = "cvs")
    private Set<Experince> experinces = new HashSet<>();

    public Cv() {}

    public Cv(String name) {
        this.name = name;
    }

    public Cv(int id, String name, Set<Experince> experinces) {
        this.id = id;
        this.name = name;
        this.experinces = experinces;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
