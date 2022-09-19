package com.solvd.hospital.models.patients;

public class Patient {
    private int id;
    private String fullName;
    private String mobile;
    private String gender;
    private String email;
    private int insuranceId;

    public Patient() {
    }

    public Patient(int id, String fullName, String mobile, String gender, String email, int insuranceId) {
        this.id = id;
        this.fullName = fullName;
        this.mobile = mobile;
        this.gender = gender;
        this.email = email;
        this.insuranceId = insuranceId;
    }

    public Patient(String fullName, String mobile, String gender, String email, int insuranceId) {
        this.fullName = fullName;
        this.mobile = mobile;
        this.gender = gender;
        this.email = email;
        this.insuranceId = insuranceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", insuranceId=" + insuranceId +
                '}';
    }
}
