package com.solvd.hospital.models.documents;

public class MedicalCard {
    private int id;
    private float height;
    private float weight;
    private int age;
    private int patientId;

    public MedicalCard() {
    }

    public MedicalCard(int id, float height, float weight, int age, int patientId) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.patientId = patientId;
    }

    public MedicalCard(float height, float weight, int age, int patientId) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.patientId = patientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "MedicalCard{" +
                "id=" + id +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", patientId=" + patientId +
                '}';
    }
}
