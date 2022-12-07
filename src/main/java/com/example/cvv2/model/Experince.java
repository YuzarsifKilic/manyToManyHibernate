package com.example.cvv2.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Experince {

    @Id
    @GeneratedValue
    private int id;
    private String companyName;
    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name = "experience_cv",
            joinColumns = { @JoinColumn(name = "experience_id") },
            inverseJoinColumns = { @JoinColumn(name = "cv_id") }
    )
    private Set<Cv> cvs = new HashSet<>();

    public Experince() {}

    public Experince(String companyName, Set<Cv> cvs) {
        this.companyName = companyName;
        this.cvs = cvs;
    }

    public Experince(int id, String companyName, Set<Cv> cvs) {
        this.id = id;
        this.companyName = companyName;
        this.cvs = cvs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<Cv> getCvs() {
        return cvs;
    }

    public void setCvs(Set<Cv> cvs) {
        this.cvs = cvs;
    }
}
