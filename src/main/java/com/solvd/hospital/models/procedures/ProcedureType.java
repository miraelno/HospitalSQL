package com.solvd.hospital.models.procedures;

public class ProcedureType {
    private int id;
    private String name;

    public ProcedureType() {
    }

    public ProcedureType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProcedureType(String name) {
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
        return "ProcedureType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
