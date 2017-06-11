package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WorkData {

    @Id
    @GeneratedValue
    private long id;
    private String possition;

    public WorkData() {
    }

    public WorkData(String possition) {
        this.possition = possition;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPossition() {
        return possition;
    }

    public void setPossition(String possition) {
        this.possition = possition;
    }
}
