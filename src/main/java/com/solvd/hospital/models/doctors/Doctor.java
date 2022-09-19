package com.solvd.hospital.models.doctors;

public class Doctor {
    private int id;
    private String fullName;
    private String gender;
    private boolean isHeadOfDepartment;
    private int specializationsId;
    private int departmentId;

    public Doctor() {
    }

    public Doctor(int id, String fullName, String gender, boolean isHeadOfDepartment, int specializationsId,
                  int departmentId) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.isHeadOfDepartment = isHeadOfDepartment;
        this.specializationsId = specializationsId;
        this.departmentId = departmentId;
    }

    public Doctor(String fullName, String gender, boolean isHeadOfDepartment, int specializationsId, int departmentId) {
        this.fullName = fullName;
        this.gender = gender;
        this.isHeadOfDepartment = isHeadOfDepartment;
        this.specializationsId = specializationsId;
        this.departmentId = departmentId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHeadOfDepartment() {
        return isHeadOfDepartment;
    }

    public void setHeadOfDepartment(boolean headOfDepartment) {
        isHeadOfDepartment = headOfDepartment;
    }

    public int getSpecializationsId() {
        return specializationsId;
    }

    public void setSpecializationsId(int specializationsId) {
        this.specializationsId = specializationsId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", isHeadOfDepartment=" + isHeadOfDepartment +
                ", specializationsId=" + specializationsId +
                ", departmentId=" + departmentId +
                '}';
    }
}
