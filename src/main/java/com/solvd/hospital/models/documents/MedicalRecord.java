package com.solvd.hospital.models.documents;

import java.sql.Date;

public class MedicalRecord {
    private int id;
    private Date date;
    private String recommendations;
    private int medicalCartId;
    private int doctorId;
    private int diseaseId;

    public MedicalRecord() {
    }

    public MedicalRecord(int id, Date date, String recommendations, int medicalCartId, int doctorId, int diseaseId) {
        this.id = id;
        this.date = date;
        this.recommendations = recommendations;
        this.medicalCartId = medicalCartId;
        this.doctorId = doctorId;
        this.diseaseId = diseaseId;
    }

    public MedicalRecord(Date date, String recommendations, int medicalCartId, int doctorId, int diseaseId) {
        this.date = date;
        this.recommendations = recommendations;
        this.medicalCartId = medicalCartId;
        this.doctorId = doctorId;
        this.diseaseId = diseaseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public int getMedicalCartId() {
        return medicalCartId;
    }

    public void setMedicalCartId(int medicalCartId) {
        this.medicalCartId = medicalCartId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "id=" + id +
                ", date=" + date +
                ", recommendations='" + recommendations + '\'' +
                ", medicalCartId=" + medicalCartId +
                ", doctorId=" + doctorId +
                ", diseaseId=" + diseaseId +
                '}';
    }
}
