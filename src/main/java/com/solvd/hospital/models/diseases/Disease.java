package com.solvd.hospital.models.diseases;

public class Disease {
    private int id;
    private String name;
    private int diseaseTypeId;

    public Disease() {
    }

    public Disease(int id, String name, int diseaseTypeId) {
        this.id = id;
        this.name = name;
        this.diseaseTypeId = diseaseTypeId;
    }

    public Disease(String name, int diseaseTypeId) {
        this.name = name;
        this.diseaseTypeId = diseaseTypeId;
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

    public int getDiseaseTypeId() {
        return diseaseTypeId;
    }

    public void setDiseaseTypeId(int diseaseTypeId) {
        this.diseaseTypeId = diseaseTypeId;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diseaseTypeId=" + diseaseTypeId +
                '}';
    }
}
