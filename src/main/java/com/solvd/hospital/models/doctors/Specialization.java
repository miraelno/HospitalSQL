package com.solvd.hospital.models.doctors;

public class Specialization {
    private int id;
    private String name;

    public Specialization() {

    }

    public Specialization(String name) {
        this.name = name;
    }

    public Specialization(int id, String name) {
        this.id = id;
        this.name = name;
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
