package com.lexdrel.com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private long id;
    private String name;
    private int testScore;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTestScore() {
        return testScore;
    }
}
