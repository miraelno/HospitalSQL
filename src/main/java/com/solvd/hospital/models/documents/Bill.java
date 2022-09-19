package com.solvd.hospital.models.documents;

import java.sql.Date;

public class Bill {
    private int id;
    private Date date;
    private float total;
    private int patientId;

    public Bill() {
    }

    public Bill(int id, Date date, float total, int patientId) {
        this.id = id;
        this.date = date;
        this.total = total;
        this.patientId = patientId;
    }

    public Bill(Date date, float total, int patientId) {
        this.date = date;
        this.total = total;
        this.patientId = patientId;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", date=" + date +
                ", total=" + total +
                ", patientId=" + patientId +
                '}';
    }
}
