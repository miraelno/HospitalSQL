package com.solvd.hospital.models.structure;

public class Department {
    private int id;
    private String name;
    private int hospitalID;

    public Department() {
    }

    public Department(int id, String name, int hospitalID) {
        this.id = id;
        this.name = name;
        this.hospitalID = hospitalID;
    }

    public Department(String name, int hospitalID) {
        this.name = name;
        this.hospitalID = hospitalID;
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

    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hospitalID=" + hospitalID +
                '}';
    }
}
