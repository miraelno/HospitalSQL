package com.solvd.hospital.models.procedures;

public class Procedure {
    private int id;
    private String name;
    private int procedureTypeIid;

    public Procedure() {
    }

    public Procedure(int id, String name, int procedureTypeIid) {
        this.id = id;
        this.name = name;
        this.procedureTypeIid = procedureTypeIid;
    }

    public Procedure(String name, int procedureTypeIid) {
        this.name = name;
        this.procedureTypeIid = procedureTypeIid;
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

    public int getProcedureTypeIid() {
        return procedureTypeIid;
    }

    public void setProcedureTypeIid(int procedureTypeIid) {
        this.procedureTypeIid = procedureTypeIid;
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", procedureTypeIid=" + procedureTypeIid +
                '}';
    }
}
