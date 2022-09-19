package com.solvd.hospital.models.schedules;

import java.sql.Date;

public class Appointment {
    private int id;
    private Date start;
    private Date end;
    private int patientId;
    private int doctorId;

    public Appointment() {
    }

    public Appointment(int id, Date start, Date end, int patientId, int doctorId) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public Appointment(Date start, Date end, int patientId, int doctorId) {
        this.start = start;
        this.end = end;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", start=" + start +
                ", end=" + end +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                '}';
    }
}
