package com.solvd.hospital.models.diseases;

public class DiseaseType {
    private int id;
    private String name;

    public DiseaseType() {
    }

    public DiseaseType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public DiseaseType(String name) {
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

    @Override
    public String toString() {
        return "DiseaseType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
