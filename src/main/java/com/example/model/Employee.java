package com.example.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    private boolean active;

    @OneToOne(cascade = CascadeType.PERSIST)
    private WorkData data;

    public Employee() {
    }

    public Employee(String name, String lastName, boolean active, WorkData data) {
        this.name = name;
        this.lastName = lastName;
        this.active = active;
        this.data = data;
    }

   /* public Employee(String name, String lastName, boolean active) {
        this.name = name;
        this.lastName = lastName;
        this.active = active;
    }*/

    public WorkData getData() {
        return data;
    }

    public void setData(WorkData data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
