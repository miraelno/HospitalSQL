package com.solvd.hospital.models.patients;

import java.sql.Date;

public class HospitalizedPatient {
    private int id;
    private Date hospitalizationStart;
    private Date hospitalizationEnd;
    private int departmentId;
    private int patientId;

    public HospitalizedPatient() {
    }

    public HospitalizedPatient(Date hospitalizationStart, Date hospitalizationEnd, int departmentId, int patientId) {
        this.hospitalizationStart = hospitalizationStart;
        this.hospitalizationEnd = hospitalizationEnd;
        this.departmentId = departmentId;
        this.patientId = patientId;
    }

    public HospitalizedPatient(int id, Date hospitalizationStart, Date hospitalizationEnd, int departmentId,
                               int patientId) {
        this.id = id;
        this.hospitalizationStart = hospitalizationStart;
        this.hospitalizationEnd = hospitalizationEnd;
        this.departmentId = departmentId;
        this.patientId = patientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getHospitalizationStart() {
        return hospitalizationStart;
    }

    public void setHospitalizationStart(Date hospitalizationStart) {
        this.hospitalizationStart = hospitalizationStart;
    }

    public Date getHospitalizationEnd() {
        return hospitalizationEnd;
    }

    public void setHospitalizationEnd(Date hospitalizationEnd) {
        this.hospitalizationEnd = hospitalizationEnd;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "HospitalizedPatient{" +
                "id=" + id +
                ", hospitalizationStart=" + hospitalizationStart +
                ", hospitalizationEnd=" + hospitalizationEnd +
                ", departmentId=" + departmentId +
                ", patientId=" + patientId +
                '}';
    }
}
